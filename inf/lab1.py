def super_perevod(n, a, b):                     # n - число, a - основание числа, b - необходимое основание
        n_z = ""
        if a != "fib" and a != "fac" and a != "9C":
                d = {str(i): i for i in range(10)}
                d["A"] = 10                     # по цифре или букве можно получить число для умножения
                d["B"] = 11
                d["C"] = 12
                d["D"] = 13
                d["E"] = 14
                d["F"] = 15
                if "." in str(n):
                        n, n_z = str(n).split(".")   # разделяем число на две части до запятой и после, если она есть
                else:
                        n = str(n)
                        n_z = ""
                n10 = 0                         # n10 - число в десятичной системе счисления
                n = n[::-1]
                for i in range(len(n)):
                        n10 += d[n[i]]*a**i
        """
        Создаём массив из цифр числа n и переворачиваем его,
        таким образом при умножении
        i-ого элемента на a в степени i, после суммирования,
        получается число в десятичной системе счисления.

        При переводе дробной части надо умножать (i - 1) -ый элемент
        на a в степени -i, при этом строку не нужно переворачивать
        """
        
        if a == "fib":          # первод числа из системы счисления фиббоначи в десятичную
                s = [1, 2]
                sb = [0 for i in range(42)]
                for i in range(40):
                        s.append(s[-1] + s[-2])
                n = str(n)[::-1]
                n10 = 0
                for i in range(len(n)):
                        if n[i] == "1":
                                n10 += s[i]
        elif a == "9C":       # первод числа из симметричной системы счисления в десятичную        
                n_z = ""
                s = []
                n = str(n)
                i = 0
                while i < len(n):
                        if n[i].isdigit():
                                s.append(int(n[i]))
                                i += 1
                        else:
                                s.append(-int(n[i+1]))
                                i += 3
                n10 = 0
                for i in range(len(s)):
                        n10 += 9**(len(s) - i - 1)*s[i]
        elif a == "fac":        # первод числа из факториальной системы счисления в десятичную
                n_z = ""
                s = [1]
                for i in range(10):
                        s.append(s[i]*(i + 2))
                n = str(n)[::-1]
                n10 = 0
                for i in range(len(n)):
                        n10 += int(n[i])*s[i]
        summ = 0
        n_zb = "0"
        if n_z != "":                           # перевод дробной части в десятичную систему счисления
                for i in range(1, min(len(n_z) + 1, 5)):
                        summ += d[n_z[i-1]]*a**(-i)
                n_zb = "0."
                while summ != 0 and len(n_zb) < 7: # перевод дробной части из десятичной в систему с основанием b
                        summ *= b
                        n_zb += str(int(summ))
                        if summ > 1:
                                summ -= int(summ)
        
        nb = ""

        if b == "9C":           # перевод числа из десятичной в симметричную
                nb = []
                while n10 != 0:
                        nb.append(n10 % 9)
                        n10 //= 9
                for i in range(len(nb)):
                        if nb[i] > 4:
                                nb[i] -= 9
                                if i == len(nb) - 1:
                                        nb.append(1)
                                else:
                                        nb[i + 1] += 1
                return sum([str(i) if i >= 0 else ("{" + str(i)[1:] + "}") for i in nb])

        elif b != "fib" and b != "fac" and b < 10 and b != "9C":              # стандартный алгоритм перевода из десятичной в систему с более низким основанием
                while n10 != 0:
                        nb += str(n10 % b)
                        n10 //= b
                if n_zb != "0":
                        return int(nb[::-1]) + float(n_zb)
                return int(nb[::-1])
        
        elif b != "fib" and b != "fac" and b >= 10:
                s = ["A", "B", "C", "D", "F", "E"]
                while n10 != 0:
                        if n10 % b >= 10:       # остатки от деления превышающие 9, при основании системы счисления > 10, переводятся в буквы
                                nb += s[(n10 % b) - 10]
                        else:
                                nb += str(n10 % b)
                        n10 //= b
                if n_zb != "0":
                        return int(nb[::-1]) + float(n_zb)
                return int(nb[::-1]) # строка получается развёрнутой не в ту сторону, при выводе это исправлено
        
        elif b == "fib":        #первод числа из десятичной системы счисления в фиббончиевую
                s = [1, 2]
                sb = [2 for i in range(42)]
                for i in range(40):
                        s.append(s[-1] + s[-2])
                n_fib = n10
                k_s = 42
                flag = 0
                while n_fib > 0:
                        k_s -= 2
                        while s[k_s] > n_fib:
                                sb[k_s] = 0
                                k_s -= 1
                        if flag == 0:
                                flag = k_s
                        sb[k_s - 1] = 0
                        sb[k_s] = 1
                        n_fib -= s[k_s]
                otv = ""
                K = 0
                while sb[K:].count(1) != 0:
                        otv += str(sb[K])
                        K += 1
                return otv[::-1]
        elif b == "fac": # первод числа из десятичной системы счисления в факториальную
                s = ""
                i = 2
                while n10 != 0:
                        s = str(n10 % i) + s
                        n10 //= i
                        i += 1
                return s[::-1]


while True:
        print("Ввести число")
        n = input()
        print("Введите основание числа")
        a = input()
        if a[0] == "f" or "A" in a or "B" in a or "C" in a or "E" in a or "F" in a or "D" in a:
                pass
        else:
                a = int(a)
        print("Введите необходимое основание")
        b = input()
        if b[0] == "f" or "A" in b or "B" in b or "C" in b or "E" in b or "F" in b or "D" in b:
                pass
        else:
                b = int(b)
        print(super_perevod(n, a, b))


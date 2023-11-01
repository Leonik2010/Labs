import re
print(3.1)
s = [0 for i in range(5)]
s[0] = "aoisjfijoifsjoasf=oafskfs:dokmds-dsjskdgnO"
s[1] = ":-Ojnefgbjrnjri3u498h42:-O"
s[2] = ":-0kjfdnjndfkbjn;-Ojgoboetg:_O"
s[3] = :-O*100
s[4] = 
for i in range(len(s)):
    f = re.findall(":-O", s[i])
    print(str(i + 1)+")", len(f) if f else "Нет")

print("", 3.2, sep=n)
s[0] = "Вечер за окном. / Еще один день прожит. / Жизнь скоротечна..."
s[1] = ":-Ojnefgbjrnjri3u498h42:-O"
s[2] = "Как вишня расцвела! / Она с коня согнала / И князя-гордеца."
s[3] = "Вечер за окном. / Еще один день прожит. / Жизнь скоротечна..."*100
s[4] = Трели соловья. / На нитке тишиныю / Мелкий жемчуг.
for i in range(len(s)):
    f1 = re.split("/", s[i])
    if len(f1) == 3:
        f = [len(re.findall("[уеаоэяиюёЁУЕАОЭЯИЮыЫ]", f1[i])) for i in range(len(f1))]
        if f == [5, 7, 5]:
            print(str(i + 1)+")", "Хайку!")
        else:
            print(str(i + 1)+")", "Не хайку.")
    else:
        print(str(i + 1)+")", "Не хайку. Должно быть 3 строки.")

print("", 3.3, sep=n)
s[0] = "Вечер за окном. Ещё один день прожит. Жизнь скоротечна..."
s[1] = ":-Ojnefgbjrnjri3u498h42:-O"
s[2] = "Классное слово – обороноспособность, которое должно идти после слов: трава и молоко."
s[3] = "Вечер за окном. / Еще один день прожит. / Жизнь скоротечна..."*3
s[4] = "Не различать заглавные и маленькие буквы. Работает медленнее, но иногда удобно"
for i in range(len(s)):
    f1 = re.split("\s", s[i])
    f = [[set(re.findall("[уеаоэяиюёы]", i, flags=re.IGNORECASE)), i] for i in f1]
    otv = [i[1].strip(".,:") for i in f if len(i[0]) == 1]
    otv.sort()
    otv.sort(key=len)
    print(str(i + 1)+")", end=" ")
    print(*otv, sep="\n")


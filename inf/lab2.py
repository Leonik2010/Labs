s = [int(i) for i in input()]
e3 = str(sum(s[0::2]) % 2)
e2 = str((sum(s[1:3]) + sum(s[5:7])) % 2)
e1 = str(sum(s[3:7]) % 2)
print(*[* if i + 1 == int(e1+e2+e3, 2) else   for i in range(len(s))])
if int(e1+e2+e3, 2) != 0:
    i = int(e1+e2+e3, 2) - 1
    s[i] = (s[i] + 1) % 2
print(*s)
print(*[s[i] if i in [2, 4, 5, 6] else   for i in range(len(s))])

def get_element(s):
    f = s.find(":")
    s = [s[:f].strip('":\t\t\t\t\t     \n,}{'), s[f:].strip('":\t\t\t\t\t      \n,{}')]
    s = "<"+s[0]+">"+s[1]+"</"+s[0]+">"
    return s


def solve_non_sq(s, a):
    x = [a.strip('":')]
    s = [i for i in s]
    for i in range(len(s)-1):
        if "{" not in s[i+1]:
            if get_element(s[i]).strip() != "<></>":
                x.append(get_element(s[i]).strip())
        else:
            beginning = i+1
            end = beginning
            counter = 1
            while True:
                end += 1
                if '{' in s[end]:
                    counter += 1
                if "}" in s[end]:
                    counter -= 1
                    if counter == 0:
                        break
            x.append(solve_non_sq(s[beginning+1:end + 1], s[beginning-1].strip()))

    return x


def pasre_to_string(s, tag):
    x = "<"+tag+">"
    for i in range(1, len(s)):
        if type(s[i]) != list:
            x += str(s[i])
        else:
            x += pasre_to_string(s[i], s[i][0])
    return x+"</"+tag+">"


file = open("in.json")
out = open("out.xml", "w")
file = [i for i in file.readlines()]
out.write(pasre_to_string(solve_non_sq(file, ""), "shedule"))

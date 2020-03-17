def theList():
    x = []
    xxx = []
    zz = []
    i = 0
    n = int(input())

    while (i < n):
        i+=1
        xx = input()
        x.append(xx)

    for d in range(n):
        if (x[d] == "print"):
            zz.add(xxx)
        if (x[d][0:6] == "insert"):
            ii1 = x[d][7]
            ii2 = x[d][9:len(x[d])]
            xxx.insert(ii1, ii2)
        if (x[d][0:6] == "remove"):
            rr = x[d][7:len(x[d])]
            xxx.remove(rr)
        if (x[d][0:6] == "append"):
            aa = x[d][7:len(x[d])]
            xxx.append(aa)
        if (x[d] == "sort"):
            xxx.sort()
        if (x[d] == "pop"):
            xxx.pop()
        if (x[d] == "reverse"):
            xxx.reverse()

    ss = 0
    while (ss < len(zz)):
        print(zz[ss])
        ss+=1

theList()


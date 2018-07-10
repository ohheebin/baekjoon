
# coding: utf-8

# In[ ]:

while True:
    n = int(input());
    if n == 0:
        break
    while True:
        if n < 10:
            print(n)
            break
        temp = n
        check = 0
        
        while True :
            if temp < 10:
                check += temp
                break
            check += temp // 10
            temp = temp % 10
        n = check



# coding: utf-8

# In[ ]:

while True:
    n , m = input().split(" ")
    if int(n) == 0 and int(m) == 0:
        break
    int_n = int(n)
    int_m = int(m)
    k = int_n - int_m
    x = 1
    y = 1
    if int_n == int_m or int_m == 0:
        print(1)
    else :
        if int_m > k:
            for i in range(1,k+1):
                x = x * int_n
                y = y * i
                int_n -= 1
        else:
            for i in range(1,int_m+1):
                x = x * int_n
                y = y * i
                int_n -= 1
        print(x//y)
        


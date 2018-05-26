
# coding: utf-8

# In[ ]:

#유클리드 호제법을 이용해서 최대공약수를 구하고 a*b 에 최대공약수를 나누어 준것이 최소공배수이다.
n = int(input())
for i in range(n):
    x , y = input().split(" ")
    a = int(x)
    b = int(y)
    if a > b:
        temp = a
        a = b
        b = temp
    c = b
    d = a
    #최대공약수를 구하고 마지막에 a*b 한 값에 최대공약수를 나누어준다.
    while True:
        min_num = c % d
        if min_num == 0:
            print(int(a*b/d))
            break
        else :
            c = d
            d = min_num


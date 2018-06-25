
# coding: utf-8

# In[ ]:

n = int(input())
x = 0
y = 1
z = 0

if(n > 1):
    j = 2
    while True:
        z = (x + y) % 1000000000
        x = y
        y = z
        if j == n:
            break
        j += 1
    print(1)
    print(z)
elif n <= -2: #음수인 경우는 짝수인 경우 음수 홀수인 경우 양수이며 기본 피보나치와 값은 같다
    j = -2
    while True:
        z = (x + y) % 1000000000
        x = y
        y = z
        if j == n:
            break
        j -= 1
    if n % 2 == 0:
        print(-1)
    else:
        print(1)
    print(z)
else:
    if n == 0 :
        print(0)
        print(0)
    else:
        print(1)
        print(1)


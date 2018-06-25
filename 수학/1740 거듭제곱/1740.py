
# coding: utf-8

# In[ ]:

x = int(input())
k = 0
i = 1
#각 3의 거듭제곱의 크기 순서가 2의 거듭제곱의 자리에 있다.
#그렇기에 2의 거듭제급을 통해 크거나 같아지는 자릿수를 찾아낸다
while True :
    if x < i :
        k -= 1
        i /= 2
        break
    elif x == i :
        break
    i *= 2
    k += 1
result = 0
#찾아낸 2의 거듭제곱 자릿수를 통해 3의 거듭제곱을 더해간다
while True :
    if x == 0 :
        break
    if x >= i :
        x -= i
        y = 1
        for j in range(k):
            y *= 3
        result += y
    i /= 2
    k -= 1
print(result)


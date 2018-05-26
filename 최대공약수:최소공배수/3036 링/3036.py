
# coding: utf-8

# In[ ]:

#유클리드 호제법을 이용해서 최대공약수를 구한다
#0번째 배열과 나머지들의 각각 최대공약수를 구하고 각각의 배열을 그 값으로 나눠준다.
n = int(input())
arr = [0 for row in range(n)]
arr = input().split(" ")

for i in range(1,n) :
    a = int(arr[0])
    b = int(arr[i])
    while True :
        min_num = a % b
        if min_num == 0:
            result = str(int(int(arr[0])/b))
            result += "/"
            result += str(int(int(arr[i])/b))
            print(result)
            break
        else :
            a = b
            b = min_num


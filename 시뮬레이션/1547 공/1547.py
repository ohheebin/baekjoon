
# coding: utf-8

# In[ ]:

#공의 위치는 항상 맨 왼쪽에 존재하고 맨 왼쪽의 컵의 번호를 출력하는 문제
#처음에 1번위치에 공이 있기에 1을 넣고 바뀌는 컵의 위치의 값만 바꾼후 1이 들어있는 컵을 출력
num = int(input())
arr = [0, 1, 0, 0]
for i in range(num) :
    n , m = input().split(" ")
    temp = arr[int(n)]
    arr[int(n)] = arr[int(m)]
    arr[int(m)] = temp
for i in range(1,4):
    if arr[i] == 1:
        print(i)


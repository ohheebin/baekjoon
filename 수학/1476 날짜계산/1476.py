
# coding: utf-8

# In[ ]:

a, b, c = input().split(" ")
E = int(a) # 1 ~ 15
S = int(b) # 1 ~ 28
M = int(c) # 1 ~ 19
arr = [1,1,1]
count = 1
while True :
    if arr[0] == E and arr[1] == S and arr[2] == M :
        break
    arr[0] += 1
    arr[1] += 1
    arr[2] += 1
    count += 1
    if arr[0] == 16 :
        arr[0] = 1
    if arr[1] == 29 :
        arr[1] = 1
    if arr[2] == 20 :
        arr[2] = 1

print(count)


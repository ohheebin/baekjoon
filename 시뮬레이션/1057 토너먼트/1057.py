
# coding: utf-8

# In[ ]:

#서로의 번호가 주어졌을때 2로 계속 나눠가면서 올림 값이 같아질경우가 두사람이 경기를 하는 경우이기에 계속해서 올림을 해준다.
num, n, m = input().split(" ")
round(int(n))
round(int(m))
x = round((int(n)/2)+0.1)
y = round((int(m)/2)+0.1)
count = 1
while True :
    if x == y :
        break
    else:
        x = round((x/2)+0.1) 
        y = round((y/2)+0.1)
        count += 1
print(count)


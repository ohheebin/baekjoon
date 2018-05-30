
# coding: utf-8

# In[ ]:

m = int(input())
n = int(input())
sum_num = 0
min_num = 10001
for i in range(1,10000):
    mlt = i * i
    if mlt > n :
        break
    elif mlt >= m :
        sum_num += mlt
        if min_num > mlt :
            min_num = mlt

if sum_num == 0:
    print(-1)
else:
    print(int(sum_num))
    print(int(min_num))



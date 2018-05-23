
# coding: utf-8

# In[ ]:

num = 0
max_num = 0
for i in range(4):
    n , m = input().split(" ")
    int_n = int(n)
    int_m = int(m)
    num = num + int_m - int_n
    if max_num < num :
        max_num = num
print(max_num)



# coding: utf-8

# In[ ]:

n , m = input().split(" ")

int_n = int(n)
int_m = int(m)

x = 1
y = 1
for i in range(1,int_m + 1):
    x = x * int_n
    y = y * i
    int_n = int_n - 1
    
print(int(x//y))


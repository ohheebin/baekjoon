
# coding: utf-8

# In[64]:

n, m = input().split(" ")
x = 1
y = 1
    
int_n = int(n)
int_m = int(m)
for i in range(1,int(m)+1):
    x = x * int_n
    int_n = int_n - 1
    y= y * i
        
print(int(x/y))


# In[ ]:




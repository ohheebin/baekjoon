
# coding: utf-8

# In[45]:

n = int(input())
x = 1
first = -1
second = 0
check = 0
count = 0

for i in range(1,n+1):
    x = x * i
    
for i in range(0,len(str(x))):
    if first == -1 :
        check = int(str(x)[-1:])
    else :
        check = int(str(x)[first:second])
    first = first - 1
    second = second - 1
    
    if check == 0 :
        count = count + 1
    else :
        break
print(count)


# In[ ]:




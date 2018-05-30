
# coding: utf-8

# In[ ]:

a, b, c, d = input().split(" ")
x = int(a)
y = int(b)
w = int(c)
h = int(d)

if w - x > x :
    min_x = x
else:
    min_x = w - x

if h - y > y :
    min_y = y
else:
    min_y = h - y
    
if(min_x > min_y):
    print(min_y)
else:
    print(min_x)


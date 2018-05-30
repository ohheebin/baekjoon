
# coding: utf-8

# In[ ]:

a, b, c = input().split(" ")

first = int(a)
second = int(b)
third = int(c)
count_a = 0
count_b = 0
while True :
    if second-1 == first:
        break
    count_a += 1
    first += 1

while True :
    if second+1 == third:
        break
    count_b += 1
    third -= 1

if count_b > count_a:
    print(count_b)
else:
    print(count_a)


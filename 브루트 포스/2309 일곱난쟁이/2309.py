
# coding: utf-8

# In[ ]:

for i in range(9):
    n[i] = int(input())
    
check = True
for i in range(0,8) :
    if check == False:
        break
    for j in range (i+1,9) :
        num = 0
        arr = [0 for col in range(7)]
        m = 0
        for k in range(0,9):
            if k != i and k != j :
                num += n[k]
                arr[m] = n[k]
                m += 1
            if num > 100:
                break
        if num == 100 :
            check = False
            break

arr.sort()
            
for i in range(7) :
    print(arr[i])


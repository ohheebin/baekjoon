
# coding: utf-8

# In[ ]:

n = int(input())
m = int(input())
check = False
max_num = 0
for i in range(n):
    x , y = input().split(" ")
    in_car = int(x) #터널에 진입한 차량
    out_car = int(y) #터널에서 나간 차량
    
    m = m + in_car - out_car # 터널에 존재하는 차량 수 + 진입한 차량 - 나간 차량
    if check == False :
        if m < 0 :
            check = True
        else :
            if max_num < m :
                max_num = m

if check == True :
    print(0)
else:
    print(max_num)


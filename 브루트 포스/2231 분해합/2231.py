
# coding: utf-8

# In[ ]:

#1000000까지의 값이 주어지기에 최대 1000000번 for문을 돈다. 자기 자신의 값과 각 자릿수값이 m과 같아 지는 i값을 출력
#각 자릿수의 값을 구하기위해 나머지값을 더해주고 100이하의 값은 몫과 나머지를 더해 while을 끝마친다
m = int(input())
result = 0
for i in range(1000000) :
    sum_num = i
    check = i
    while True :
        if check < 100:
            sum_num += int(check % 10)
            sum_num += int(check // 10)
            break
        sum_num += int(check%10)
        check = check // 10
    if sum_num == m :
        result = i
        break
print(result)


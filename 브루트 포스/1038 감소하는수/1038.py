
# coding: utf-8

# In[ ]:

#배열을 이용한 풀이 
#만약 앞의 배열 값이 더 작다고 9가 아니라면 그 값을 하나 증가시켜준다. 그리고 9라면 앞의 배열 값을 1증가 시키고 그 배열의 값은 0으로 둔다.
#그리고 그 뒤의 값들을 모두 0으로 만들어 주고 for문을 끝마친다.
#감소하는 수인 경우 마지막 배열의 값을 1증가시키고 count를 1 증가 시켜준다.
m = int(input())
count = 0
result = 0
arr = [0 for i in range(10)]
if(m == 0):
    print(0)
else:
    while count != m :
        if m > 1022:
            print(-1)
            break
        if count < 9:
            count += 1
            arr[9] += 1
            result = 8
        else :
            for i in range(result,9):
                if arr[i] <= arr[i+1]:
                    if arr[i] == 9 :
                        arr[i - 1] += 1
                        arr[i] = 0
                        result -= 1
                    else :
                        arr[i] += 1
                    for j in range(i,9):
                        arr[j+1] = 0
                    break;
                else:
                    if i == 8:
                        count += 1
                        if count != m :
                            arr[9] += 1
    
    if m <= 1022:
        print(int(''.join(str(x) for x in arr))) 


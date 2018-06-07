
# coding: utf-8

# In[ ]:

n = int(input())
result = ["" for row in range(n)]
for i in range(n):
    st = input()
    arr = [0 for row in range(26)]
    temp = 0
    check = True
    for j in range(len(st)):
        #아스키코드를 확인해서 그 배열의 값이 3 이면 false로 바꾸고 그 다음 문자와 비교해서 같으면 다시 True로
        #다르면 FAKE 출력
        ch = ord(st[j])
        if check == True :
            arr[ch-65] += 1
            if arr[ch-65] == 3:
                arr[ch-65] = 0
                temp = ch
                check = False
        elif check == False:
            if temp == ch :
                check = True
            else :
                break    
    if check == True :
        result[i] = "OK"
    else:
        result[i] = "FAKE"
        
for i in range(n):
    print(result[i])


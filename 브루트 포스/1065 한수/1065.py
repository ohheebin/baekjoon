
# coding: utf-8

# In[ ]:

#1~99 까지는 한수이다 100 부터는 백의자리 십의자리 일의자리의 수를 구한 후 백의자리 - 십의자리 의 값과 십의자리 - 일의자리의 값이 같으면 한수
num = int(input())
count = 0;
for i in range(1, num+1) :
    if i <= 99 :
        count += 1;
    elif i != 1000 :
        x = int(i / 100)
        y = int((i / 10) % 10)
        z = int((i % 100) % 10)
        n = x - y
        m = y - z
        if n == m :
            count += 1
print(count)


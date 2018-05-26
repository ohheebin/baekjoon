
# coding: utf-8

# In[ ]:

# 주기 1000000 / 10 * 15 => 1500000
# 피보나치의 주기를 구해서 해결하는 문제 주기는 n / 10*15 이다
n = int(input())
mod = 1000000
p = int(1000000 / 10 * 15)
arr = [0 for row in range(1500000)]
arr[0] = 0; arr[1] = 1;
for i in range(2,p) : 
    arr[i] = arr[i - 2] + arr[i - 1]
    arr[i] %= mod
print(arr[n%p])


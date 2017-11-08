
# coding: utf-8

# In[1]:

import sys


# In[82]:

def main():
    b = list(map(int,input().split()))
    land = [[0 for col in range(b[0])] for row in range(b[1])]
    dp = [[0 for col in range(b[0] + 1)] for row in range(b[1] + 1)]
    max_num = 0
    
    for x in range(b[1]) :
        string_input = input()
        list_input = list(string_input)
        for y in range(b[0]) :
            land[x][y] = int(list_input[y])
            
    for x_ran in range(len(land)) :
        for y_ran in range(len(land[x])) :
            if land[x_ran][y_ran] == 1:
                dp[x_ran+1][y_ran+1] = min(dp[x_ran][y_ran], dp[x_ran+1][y_ran], dp[x_ran][y_ran+1]) + 1
                
            if max_num < dp[x_ran+1][y_ran+1] :
                max_num = dp[x_ran+1][y_ran+1]

    return print(max_num*max_num)


# In[83]:

def min(a, b, c):
    min_num = 0
    if a < b:
        min_num = a
    else :
        min_num = b
        
    if min_num < c :
        min_num = min_num
    else :
        min_num = c
        
    return min_num


# In[84]:

if __name__ == '__main__':
    main()




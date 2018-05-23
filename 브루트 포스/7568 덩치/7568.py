
# coding: utf-8

# In[ ]:

t = int(input())
build = [[0 for col in range(t)] for row in range(t)]
rank = [1 for i in range(t)]

for i in range(t) :
    x , y = input().split(" ")
    build[i][0] = int(x)
    build[i][1] = int(y)
    
for i in range(t) :
    for j in range(t) :
        if i != j :
            if build[i][0] < build[j][0] and build[i][1] < build[j][1] :
                rank[i] += 1

print(' '.join(str(x) for x in rank))


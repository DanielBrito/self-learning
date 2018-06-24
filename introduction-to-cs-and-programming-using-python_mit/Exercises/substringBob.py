s = 'azcbobobegghakl'
count = 0

for i in range(0, len(s), 1):   
    if('bob'==s[i:i+3]):
        count+=1
    
print('Number of times bob occurs is: ' + str(count))
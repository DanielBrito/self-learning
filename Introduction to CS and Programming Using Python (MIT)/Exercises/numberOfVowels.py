s = 'azcbobobegghakl'
count=0

for i in s:
    if(i=='a' or i=='e' or i=='i' or i=='o' or i=='u'):
        count += 1
        
print('Number of vowels: ' + str(count))

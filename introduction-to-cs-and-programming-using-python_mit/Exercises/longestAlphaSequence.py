s = 'azcbobobegghakl'

result = ''
aux = ''

for char in s:
    if (aux == ''):
        aux = char
    elif (aux[-1] <= char):
        aux += char
    elif (aux[-1] > char):
        if (len(result) < len(aux)):
            result = aux
            aux = char
        else:
            aux = char
            
if (len(aux) > len(result)):
    result = aux
    
print(result)


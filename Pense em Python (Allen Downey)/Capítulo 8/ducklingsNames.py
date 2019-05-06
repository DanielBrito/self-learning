prefixes = 'JKLMNOPQ'
suffix = 'ack'

for letter in prefixes:
    if(letter=='O'):
        print(letter + 'u' + suffix)
    elif(letter=='Q'):
        print(letter + 'u' + suffix)
    else:
        print(letter + suffix)

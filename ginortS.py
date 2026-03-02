s = list(input())
lowerLetters=[]
upperLetters=[]
oddNumbers = []
evenNumbers = []
for l in s:
    if l.isalpha():
        if l.islower():
            lowerLetters.append(l)
        else:
            upperLetters.append(l)
    else:
        if int(l)%2 == 0:
            evenNumbers.append(l)
        else:
            oddNumbers.append(l)
print("".join(sorted(lowerLetters)+sorted(upperLetters)+sorted(oddNumbers)+sorted(evenNumbers)))

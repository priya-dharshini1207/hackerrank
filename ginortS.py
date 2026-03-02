s = input()
odd=lambda x:int(x)%2==0
upper=lambda x:x.isupper()
lower=lambda x:x.islower()
digit=lambda x:x.isdigit()
print("".join(sorted(list(filter(lower,s))) + sorted(list(filter(upper,s))) + sorted(list(filter(digit,s)), key=odd)))

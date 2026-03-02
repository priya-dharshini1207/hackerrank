x,y = map(int,input().split())
P = list(input().split('+'))
val = 0
for i in P:
    val += eval(i)
print(val == y)

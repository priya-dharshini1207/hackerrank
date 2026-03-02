import collections
size=int(input())
list1=list(map(int,input().split()))
a=collections.Counter(list1)
target_value=min(a.values())
for key , value in a.items():
    if value==target_value:
        print(key)

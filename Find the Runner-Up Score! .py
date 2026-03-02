if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    new = set(arr)
    final = max(new)
    new.remove(final) 
    print(max(new))
   

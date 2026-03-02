test_cases = int(input())

for i in range(test_cases):
    count_A = int(input())
    A = list(map(int, input().split()))
    count_B = int(input())
    B = list(map(int, input().split()))
    count = len(set(A).intersection(set(B)))
    if count == count_A:
        print(True)
    else:
        print(False)

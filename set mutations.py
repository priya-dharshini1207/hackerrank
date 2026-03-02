n = int(input())
A = set(map(int, input().split()))
N = int(input())
for _ in range(N):
    op, l = input().split()
    n_set = set(map(int, input().split()))
    getattr(A, op)(n_set)
print(sum(A))

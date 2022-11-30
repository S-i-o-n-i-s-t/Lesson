# 5. ** Реализуйте алгоритм перемешивания списка. Без функции shuffle из модуля random.
# 10
# -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
# -> [0, 7, 6, 3, 4, 2, 9, 5, 1, 8]
print('Введите натуральное число для текущего задания:')
N = int(input())
size = list(range(0, N))
print(f' -> {size}')
import random
r = 0
size[r] = random.randint(0, N - 1)
n = 1
while n < N:
    size[n] = random.randint(0, N - 1)
    z = 0
    while z < n:   
        if size[z] == size[n]:
            size[n] = random.randint(0, N - 1)
            z = 0
        else:
            z = z + 1
    n = n + 1
print(f' -> {size}')
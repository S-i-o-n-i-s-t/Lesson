# 2. Напишите программу, которая принимает на вход число N и выдает набор произведений чисел от 1 до N.
# 1 - 1 * 1, 2 - 1 * 2, 3 - 1 * 2 * 3, 4 - 1 * 2 * 3 * 4 и т.д.
# - 4 -> [1, 2, 6, 24]
# - 6 -> [1, 2, 6, 24, 120, 720]
print('Введите натуральное положительное число')
num = int(input())
c = 0
a = 1
b = 1
if num == 0:
    print('[1]')
else:
    size = list(range(1, num + 1))
    print(size)
    while a <= num:
        b = b * a
        size[c] = b
        c = c + 1
        a = a + 1
    print(size)
# 3. Задайте список из n чисел, заполненный по формуле (1 + 1/n) ** n и выведите на экран их сумму.
# Для n = 6: [2, 2, 2, 2, 2, 3] -> 13
print('Введите натуральное число n')
num = int(input('Число n = '))
size = list(range(0, num))
g = num - 1
a = 1
b = num
while a <= num:
    b = round((1 + (1 / b)) ** b)
    size[g] = b
    a = a + 1
    g = g - 1
print(size)
x = 0
c = 0
y = num - 1
while c < num:
    x = size[c] + x
    c = c + 1
print(f'Сумма элементов в списке = {x}')

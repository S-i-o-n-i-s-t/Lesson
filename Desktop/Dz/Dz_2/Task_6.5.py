# * 4. Напишите программу, которая принимает на вход 2 числа. Задайте список из N элементов, заполненных числами из промежутка [-N, N]. Найдите произведение элементов на указанных позициях(не индексах).
# Position one: 1
# Position two: 3
# Number of elements: 5
# -> [-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5]
# -> 15
a = int(input('Position one: '))
b = int(input('Position two: '))
N = int(input('Number of elements:'))
size = list(range(-N, N + 1))
#print(len(size))
print(size)
num = N * 2 + 1
a1 = a
if a < 0:
    a = a * -1
#print(f'сделали число положительным {a}')
while a > num:
    a = a - num
#print(f'число для выявления нужного индекса = {a}') 
ai = 0
if a1 > 0:
    ai = a - 1
elif a1 < 0:
    ai = num - a
#print(f'индекс ai = {ai}')
b1 = b
if b < 0:
    b = b * -1
while b > num:
    b = b - num
#print(f'число для выявления нужного индекса = {a}') 
bi = 0
if b1 > 0:
    bi = b - 1
elif b1 < 0:
    bi = num - b
#print(f'индекс bi = {bi}')
a1 = size[ai] * size[bi]
print(f'Oтвет: {a1}')
# min = 0
# max = 0
# if ai < bi:
#     min = ai
#     max = bi
# elif ai >= bi:
#     min = bi
#     max = ai
# num = max - min
# print(f'min index = {min} max index = {max}')
# ai = size[min]
# print(f'start {ai}')
# min = min + 1
# while num > 0:
#     ai = ai * size[min]
#     min = min + 1 
#     num = num - 1
# print(f'Произведение чисел выделенных из условия задачи = {ai}')





    
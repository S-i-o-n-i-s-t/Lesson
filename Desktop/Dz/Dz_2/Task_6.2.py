# 1. Напишите программу, которая принимает на вход вещественное число и показывает сумму его цифр.
# in -> out
# - 6782 -> 23
# - 0.67 -> 13
# - 198.45 -> 27
print('Введите вещественное число')
num = float(input())
a = 0
print(num.isdigit())
if num < 0:
    num = num * -1
while num % 10 != 0:
    num = num * 10
num = int(num)
num = num // 10
print(num)
N = str(num)
size = len(N)
while size != 0:
    a = a + num % 10
    num = num // 10
    size = size - 1
print(f'Сумма цифр в числе = {a}')

#print(sum(map(int, list(input("Введите дробное число: ").replace(".", "")))))




 





# Написать программу удаляющую из текста все слова содержащие "абв". В тексте разделителем является пробел

#from os import remove
import random
a = "абв"
f = int(input("Введите количество слов, которые будут содержать буквы 'абв' - "))
c = 3
size = []
for i in range(0, f):
    size.append(str((''.join([random.choice(a) for _ in range(random.randint(3, 3))]))))
print(f'Наша строка     {size}')

for_str = [x for x in range(f)]

st = list(filter(lambda n: not n == 'абв', size))

# size.remove('абв')

print(f'Без слова "абв" {st}')


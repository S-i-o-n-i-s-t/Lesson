import os
import do


def original(aktion: int):
    if aktion == 1:
        number1, number2 = data(aktion)
        do.sum(number1, number2)
    if aktion == 2:
        number1, number2 = data(aktion)
        do.sub(number1, number2)
    if aktion == 3:
        number1, number2 = data(aktion)
        do.mult(number1, number2)
    if aktion == 4:
        number1, number2 = data(aktion)
        do.div(number1, number2)
    if aktion == 5:
        number1, number2 = data(aktion)
        do.pow(number1, number2)

def data(flag: int):
    try:
        os.system('cls' if os.name == 'nt' else 'clear')
        if flag <= 4:
            number1 = complex(input("Введите первое число: "))
            number2 = complex(input("Введите второе число: "))
        elif flag == 5:
            number1 = complex(input("Введите число: "))
            number2 = int(input("Введите степень: "))
    except ValueError:
        print("Вы ввеели не допустимые символы")
        data(flag)
    else:
        return number1, number2
package Lekcion_2;

public class Dz_2 {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        // Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.
        String str1 = "Hello vorld, main frend";
        String str2 = "vorld";
        //System.out.println(str1.contains(str2));  
        StringBuilder str3 = new StringBuilder("");
        int help = 0;
        int help2 = -1;  
        for(int i = 0; i < str1.length() - str2.length(); i++){
            str3.delete(0, str2.length());
            help2++;
            help = help2;
            for(int i1 = 0; i1 < str2.length(); i1++){
                str3.append(str1.charAt(help));
                help++;
            }
            if(str3.toString().equals(str2) == true)               
                System.out.println("True");          
        }
        
        // Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.
        String strRevers1 = "qwertyu";
        String str1Revers2 = "uytrewq";        
        System.out.println(reverse(strRevers1).equals(str1Revers2));

        // Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        int num1 = 3;
        int num2 = 56;
        String equally = " = ";
        
        StringBuilder addition = new StringBuilder();
        addition.append(num1);
        addition.append(" + ");
        addition.append(num2);
        addition.append(equally);
        System.out.println(addition.append(num1 + num2));
        
        StringBuilder subtraction = new StringBuilder();
        subtraction.append(num1);
        subtraction.append(" - ");
        subtraction.append(num2);
        subtraction.append(equally);
        System.out.println(subtraction.append(num1 - num2));
        
        StringBuilder multiplication = new StringBuilder();
        multiplication.append(num1);
        multiplication.append(" * ");
        multiplication.append(num2);
        multiplication.append(equally);
        System.out.println(multiplication.append(num1 * num2));
        
        // Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        String Equally = "равно";
        int index = 7;
        addition.deleteCharAt(index);
        addition.insert(index, Equally);
        System.out.println(addition);
        
        subtraction.deleteCharAt(7);
        subtraction.insert(index, Equally);
        System.out.println(subtraction);
        
        multiplication.deleteCharAt(index);
        multiplication.insert(index, Equally);
        System.out.println(multiplication);

    }
 
}

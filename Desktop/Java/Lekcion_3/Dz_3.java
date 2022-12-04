package Lekcion_3;

import java.util.ArrayList;
import java.util.Iterator;
public class Dz_3 {
    public static void main(String[] args) {
        // 1.Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> newList = new ArrayList<String>();
        newList.add("Ni");
        newList.add("main");
        System.out.println(newList);
        
        // 2.Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        ArrayList<String> newList1 = new ArrayList<String>();
        Iterator<String> iter = newList.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            next += "!";
            newList1.add(next);
        }
        System.out.println(newList1);
       
        // 3.Вставить элемент в список в первой позиции.
        newList1.add(0, "khgyc");
        System.out.println(newList1);
    
        // 4.Извлечь элемент (по указанному индексу) из заданного списка.
        String str = newList1.get(0);
        System.out.println(str);

        // 5.Обновить определенный элемент списка по заданному индексу.
        newList1.set(0, "Gutbay");
        System.out.println(newList1);
        
        // 6.Удалить третий элемент из списка.
        newList1.remove(0);
        System.out.println(newList1);

        // 7.Поиска элемента в списке по строке.
        String oghrjn = "main!";
        System.out.println(newList1.indexOf(oghrjn));

        // 8.Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList<String> newList2 = new ArrayList<String>();
        newList2.add("zero");
        newList2.add("zero");
        newList2.add(newList1.get(1));
        System.out.println(newList2);
       
        // 9.Удалить из первого списка все элементы отсутствующие во втором списке. equals
        newList.clear();
        Iterator<String> iter1 = newList1.iterator();
        while (iter1.hasNext()) {
            String next = iter1.next();
            if(newList2.contains(next) != true){
                iter1.remove();
            }
        
             
        }
        System.out.println(newList1);
        //for (Object o : newList2) {
        //    newList1.remove(o);
        //}
        //System.out.println(newList1);

        // 10*.Сортировка списка.
        
        // 11*.Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
    }
}

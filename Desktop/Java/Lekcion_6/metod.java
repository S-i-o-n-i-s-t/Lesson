package Lekcion_6;

import java.util.TreeMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class metod {
    // Реализовать множество (set) с помощью TreeMap. 
    // Создать метод add, добавляющий элемент в ваше множество. 
    private Map<Integer, Object> treeMap = new TreeMap<>();
    private static final Object OBJECT = new Object();

    public void metodAdd(int x){
        treeMap.put(x, OBJECT);
    }
    public String metodReadd(){
        return treeMap.keySet().toString();
    }
    // Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел. 
    // Объявить и инициализировать TreeSet использующий ваш компаратор.     
    private Set<Integer> treeSet = new TreeSet<Integer>();
    
    public void metodAddSet(int x){
        treeSet.add(x);
    }
    public void printSet(){
        System.out.println(treeSet);
    }
    public void metodReversSet(){
        List<Integer> list = new ArrayList<Integer>(treeSet);
        Collections.reverse(list);       // Так как TreeSet, достаточно перевернуть.
        System.out.println(list);  
    }
}


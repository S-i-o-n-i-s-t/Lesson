package Lekcion_5;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;


public class Dz_5{
    public static void main(String[] args) {
        // Создать словарь HashMap. Обобщение <Integer, String>.
        Map<Integer, String> map = new HashMap<>();

        // Заполнить тремя ключами (индекс, цвет), добавить ключь, если не было!)
        map.put(2, "Grin");
        map.put(4, "Red");
        map.put(6, "Orange");
        System.out.println(map);
        
        
        // Изменить значения дописав восклицательные знаки. *Создать TreeMap, заполнить аналогично.
        Set<Integer> keySet = map.keySet(); 
        for (int i: keySet){
            map.compute(i, (k, v) -> v = v+"!");
        }
        System.out.println(map);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("monday", 52);
        treeMap.put("Tuesday", 45);
        treeMap.put("Wednesday", 56);
        System.out.println(treeMap);
        Set<String> keySetTM = treeMap.keySet();
        for (String i: keySetTM){
            treeMap.compute(i, (k, v) -> v = v+10);
        }
        System.out.println(treeMap);
        
        
        // *Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой.
        
        
        // **Сравнить время прямого и случайного перебора тысячи элементов словарей.
    }
    static String cls() {return "purimer";};
}
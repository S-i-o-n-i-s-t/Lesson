package Lekcion_6;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

class treeSet {
    static metod plenty = new metod();
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++){
            int random = new Random().nextInt(100);
            plenty.metodAddSet(random);  
        }
        plenty.printSet(); 
        plenty.metodReversSet();
        // Добавить несколько эллементов в сет и вывести в консоль.
        Set<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 0; i < 10 ; i++){
            int random = new Random().nextInt(100);
            treeSet.add(random);  
        }
        System.out.println(treeSet);
        
    
    }
}

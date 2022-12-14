
package Lekcion_6;
import java.util.Random;
public class treeMap {
    static metod plenty = new metod();

    public static void main(String[] args) {
         
        for (int i = 0; i < 10 ; i++){
            int random = new Random().nextInt(100);
            plenty.metodAdd(random);    
        }
        System.out.println(plenty.metodReadd());
    }
}

package JavaBasic.Lesson11.operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int x = 10;
        int y = - x;

        System.out.println(x + "," + y);

        // инкремент ++

        int z = 100;
        z++;
        System.out.println(z);

        /* существуют два вида записи инкремента : префикс и постинкремент
        z ++  и ++z
         */

        // декремент --

        z--;

        System.out.println(z);




    }
}

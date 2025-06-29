package JavaBasic.Proba.MaxNumber;

import java.util.Random;

public class SearchMaxNumber {
    public static void main(String[] args) {

        Random random = new Random();

        int numberA = random.nextInt(101);
        int numberB;
        do {numberB = random.nextInt(101);
        }
        while (numberB == numberA);
        int numberC;
        do { numberC = random.nextInt(101);
        }
        while (numberC == numberA || numberC == numberB);

        int numberD;
        do { numberD = random.nextInt(101);

        }
        while (numberD == numberA || numberD == numberB || numberD == numberC);

        System.out.println(numberA);
        System.out.println(numberB);
        System.out.println(numberC);
        System.out.println(numberD);

        int max = numberA;
        if (numberB > max)max=numberB;
        if (numberC > max)max = numberC;
        if (numberD > max)max = numberD;

        System.out.println(" Максимальное число : "  + max);




    }
}

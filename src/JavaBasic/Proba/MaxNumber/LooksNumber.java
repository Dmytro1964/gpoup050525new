package JavaBasic.Proba.MaxNumber;

public class LooksNumber {
    public static void main(String[] args) {

        int A = (int)(Math.random()*101);
        int B;
        do { B = (int)(Math.random()*101);
        }
        while (B == A);
        int C;
        do {C = (int)(Math.random()*101);
        }
        while (C == A || C == B);
        int D;
        do { D = (int) (Math.random()*101);
        }
        while (D == A || D == B || D== C);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);

        int[]number = {A,B,C,D};
        int max = number[0];
        for (int i =1; i< number.length; i++){
            if (number[i]> max){
                max = number[i];
            }

        }
        System.out.println(" Максимальное число : " + max);


    }
}

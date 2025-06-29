package JavaBasic.Test.Test06;

public class Random {
    public static void main(String[] args) {

        java.util.Random random = new java.util.Random();

        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        int d = random.nextInt(101);

        System.out.println("Случайные числа:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int max = a;

        if(b > max){
            max = b;}
            if (c>max){
                max = c;
            }
            if (d> max){
                max = d;
            }
            System.out.println(" Max = " + max);
        }
    }


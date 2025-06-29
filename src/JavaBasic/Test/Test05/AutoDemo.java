package JavaBasic.Test.Test05;

public class AutoDemo {
    public static void main(String[] args) {

        Maker Toyota = new Maker("Toyota", "Japan");
        Maker  Honda = new Maker( " Honda", "Japan");

        Auto auto1 = new Auto("Prado", Toyota, "waite");
        Auto auto2 = new Auto("Civic",Honda, "blue");
        Auto auto3 = new Auto("Camry", Toyota, "red");

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
    }
}

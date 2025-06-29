package JavaBasic.Proba.Auto;

public class AutoDemo {
    public static void main(String[] args) {

        Brand brand1 = new Brand("Toyota","Japan");
        Brand brand2 = new Brand("Porsche","Germany");

        Auto auto1 = new Auto("Prado",brand1,"grin");
        Auto auto2 = new Auto("Cayenne",brand2,"red");
        Auto auto3 = new Auto("Panamera Turbo ",brand2, "black");

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);

    }
}

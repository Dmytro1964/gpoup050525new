package JavaBasic.Test.Test05;

public class PublicCatalogDemo {
    public static void main(String[] args) {

        Category electronics = new Category( "Электроника", " Гаджеты ");
        Category clothes = new Category(" Одежда ", "Детская одежда");

        Product product1 = new Product("laptop",electronics, 1299.0, 45);
        Product product2 = new Product("Магнитофон", electronics,1600.0, 22);
        Product product3 = new Product("Panama", clothes, 12.5,78);

        System.out.println(product1);
        System.out.println( product2);
        System.out.println(product3);

        product1.setQuantity(14);
        product2.setQuantity(21);
        product3.setQuantity(77);

        System.out.println(product1);
        System.out.println( product2);
        System.out.println(product3);

        


        };
        


    }


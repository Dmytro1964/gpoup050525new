package JavaBasic.Proba.LastSymbol;

public class LastSymbol {
    public static void main(String[] args) {

        String myString = new String("I study Basic Java!");

        printLastChar(myString);
    }
       public static void printLastChar(String input){

        char LastChar = input.charAt(input.length()-1);
        System.out.println(LastChar);

       }
}

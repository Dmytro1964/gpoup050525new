package JavaBasic.Proba.Cycles;

public class WordsO {
    public static void main(String[] args) {

        String[]words6 =  {"Молоко", "Кефир", "Сыр", "Хлеб", "Творог"};
        int countO = 0;


        for (int i=0; i< words6.length; i++){
        if (words6[i].toLowerCase().contains("о"))
        {
            System.out.print( words6[i] + ",");
            countO ++;

        }

        }
        System.out.println( " \n Количество такиж слов " + countO);
    }
}

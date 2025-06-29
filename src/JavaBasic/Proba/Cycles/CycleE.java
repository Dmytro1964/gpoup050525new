package JavaBasic.Proba.Cycles;

public class CycleE {
    public static void main(String[] args) {

        String[]words7 = { "Хлеб", "Молоко", "Сахар", "Вода", "Кефир", "Мясо"};
        int count = 0;
        for( int i = 0 ; i < words7.length; i ++){
            if (words7[i].toLowerCase().contains("е")){
                System.out.println( " Все слова с буквой е  : " + words7[i]);
              ;
                count++;
            }


            }
        System.out.println( "\n Общее количество слов с буквой е : " + count);
        }

    }


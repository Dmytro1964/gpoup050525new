package Lesson11.operators;

public class RelationalOperators {
    public static void main(String[] args) {

            //операторы сравнения

        int x = 5;
        int y = 10;

        // Мы утверждаем, что левая часть x равна ( эквивалентна) правой части и результат
        // сравнения сохраняем в переменной boolean resultEqual

        boolean resultEqual = (x == y);
        System.out.println(resultEqual);

        boolean resultNotEqual = (x != y);
        System.out.println(resultNotEqual);

        boolean resultGreater = (x > y);
        System.out.println(resultGreater);

        boolean resultGreaterOrEqual = (x >= y);
        System.out.println(resultGreaterOrEqual);

        boolean resultLess = (x < y);
        System.out.println(resultLess);

        boolean resultLessOrEqual = (x <= y);
        System.out.println(resultLessOrEqual);




    }
}

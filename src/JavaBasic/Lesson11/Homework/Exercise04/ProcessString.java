package JavaBasic.Lesson11.Homework.Exercise04;

public class ProcessString {

    public static void main(String[] args) {
        // 1. Создаём строку через new
        String myString = new String("I study Basic Java!");

        System.out.println("I study Basic Java!");

        // 2. Вызываем метод, передаём строку
        processString(myString);
    }

    // Метод, который принимает строку
    public static void processString(String input) {

        // 3. Последний символ строки
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        // 4. Проверка, содержит ли строка "Java"
        boolean containsJava = input.contains("Java");
        System.out.println("Содержит 'Java'? " + containsJava);

        // 5. Замена символов 'a' на 'o'
        String replaced = input.replace('a', 'o');
        System.out.println("После замены 'a' на 'o': " + replaced);

        // 6. Преобразование к верхнему регистру
        String upper = input.toUpperCase();
        System.out.println("В верхнем регистре: " + upper);

        // 7. Преобразование к нижнему регистру
        String lower = input.toLowerCase();
        System.out.println("В нижнем регистре: " + lower);

        // 8. Вырезаем подстроку "Java"
        int start = input.indexOf("Java");

        if (start != -1) { // проверяем, что "Java" действительно найдена
            int end = start + "Java".length();
            String substring = input.substring(start, end);
            System.out.println("Вырезанная строка: " + substring);
        } else {
            System.out.println("Слово 'Java' не найдено.");
        }
    }
}
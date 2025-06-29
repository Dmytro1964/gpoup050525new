package JavaBasic.Lesson12.Homework.Task4;

import java.util.Random;

public class GradeFeedback {
    public static void main(String[] args) {
        // создаем генератор случайных чисел
        Random random = new Random();
        // от 0 до 12 включительно
        int grade = random.nextInt(13);
        // начальное оставшееся время в минутах
        int tvTime = 45;
        System.out.println(" Оценка ребенка : " + grade);

        switch (grade) {
            case 12:
            case 11:
            case 10:
                System.out.println(" Молодец. Отлично!");
                tvTime = tvTime + 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Молодец, но можно лучще . ");
                tvTime = tvTime + 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Не очень ");
                tvTime = tvTime + 15;
                break;
            case 3:
                System.out.println(" Плохо, не стараешся ");
                tvTime = tvTime - 30;
                break;
            // для оценок 0, 1, 2
            default:
                System.out.println(" Очень плохо. Ты наказан ");
                tvTime = 0;
                break;}
                // Убеждаемся, что итоговое время не отрицательное

                if (tvTime < 0) {
                    tvTime = 0;
                }

                System.out.println(" Оставшееся ТВ время : " + tvTime + " минут ");


        }

    }



package JavaBasic.Lesson18.Lotereya;

import JavaBasic.Lesson17.Homework.UserInputStatic;

import java.util.Random;

public class SourceTicketNumber {

   private Random random = new Random();

    public int receiveTicketNumber( boolean isRandom, int sizeLotteryNumber, int idTicket, int currentIndex) {

        // данный метод будет возвращать очередной номер для заполнения нашего билета

        if (isRandom) {
            return receiveFromRandom(sizeLotteryNumber);
        } else {
         return    receiveFromUserInput(idTicket, currentIndex);}

    }
    private int receiveFromRandom(int sizeLotteryNumber){
        // Данный метод будет возвращать рандомное значение от 1 до sizeLotteryNumber
        return random.nextInt(1, sizeLotteryNumber +1);

    }
    private int receiveFromUserInput(int idTicket, int currentIndex){
        // Данный метод будет возвращать значение которое ввел Пользователь
        return UserInputStatic.nextInt("Введите для билета N " + idTicket + " Значение для числа N " + currentIndex + ":");



    }

}

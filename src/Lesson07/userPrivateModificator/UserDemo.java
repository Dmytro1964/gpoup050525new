package Lesson07.userPrivateModificator;

public class UserDemo {
    public static void main(String[] args) {

        User user = new User("Ruslan", "ruslan@gmail.com","pass123456");
        user.printUserInfo();

        String newEmail = "ruslannewcompany@gmail.com";

        user.changeEmail(newEmail);
        user.printUserInfo();



    }
}

package BackEndKurs.Lesson01.HomeWork.User;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User("ivan123", "Password1!", "ivan@example.com");

        System.out.println("Логин: " + user.getLogin());
        System.out.println("Email: " + user.getEmail());

        // Попытка сменить пароль с неправильным старым паролем
        user.changePassword("wrongOldPassword", "NewPassword1!");

        // Попытка сменить пароль с новым паролем, не соответствующим требованиям
        user.changePassword("Password1!", "short");

        // Успешная смена пароля
        user.changePassword("Password1!", "NewPassword1!");
    }
}



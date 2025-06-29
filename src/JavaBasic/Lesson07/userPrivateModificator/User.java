package JavaBasic.Lesson07.userPrivateModificator;

public class User {

    private String name;
    private String email;
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public void changeEmail(String newEmail){
       this.email = newEmail;
    }

    public void printUserInfo(){
        System.out.println(" Информация о пользователе :");
        System.out.println( "Имя пользователя  : " + name);
        System.out.println("Email пользователя : " + email);

    }
}

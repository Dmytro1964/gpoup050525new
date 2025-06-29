package BackEndKurs.Lesson01.HomeWork.User;

public class User {
    private String login;
    private String password;
    private String email;


    public User(String login, String password, String email) {
        this.login = login;
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Пароль не соответствует требованиям безопасности.");
        }
        this.email = email;
    }


    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Метод для изменения пароля:
    // меняет пароль только если старый пароль введен верно
    // и новый пароль валиден по требованиям
    public boolean changePassword(String oldPassword, String newPassword) {
        if (!password.equals(oldPassword)) {
            System.out.println("Старый пароль введён неверно.");
            return false;
        }

        if (!isValidPassword(newPassword)) {
            System.out.println("Новый пароль не соответствует требованиям безопасности.");
            return false;
        }

        password = newPassword;
        System.out.println("Пароль успешно изменён.");
        return true;
    }

    // Проверка безопасности пароля
    // - минимум 8 символов
    // - содержит хотя бы одну заглавную букву
    // - содержит хотя бы одну цифру
    // - содержит хотя бы один специальный символ (!@#$%^&* и т.д.)
    private boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if ("!@#$%^&*()-_+=<>?/{}~|".indexOf(c) >= 0) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasDigit && hasSpecial;
    }
}


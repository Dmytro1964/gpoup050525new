package BackEndKurs.Lesson01.HomeWork.BankAccount;

public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Начальный баланс не может быть отрицательным. Установлен 0.");
        }
    }

    // Метод для внесения средств (депозит)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Внесено: " + amount + ". Новый баланс: " + balance);
        } else {
            System.out.println("Сумма для внесения должна быть положительной.");
        }
    }

    // Метод для снятия средств
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Снято: " + amount + ". Остаток: " + balance);
            } else {
                System.out.println("Недостаточно средств для снятия.");
            }
        } else {
            System.out.println("Сумма для снятия должна быть положительной.");
        }
    }

    // Метод для получения текущего баланса
    public double getBalance() {
        return balance;
    }
}



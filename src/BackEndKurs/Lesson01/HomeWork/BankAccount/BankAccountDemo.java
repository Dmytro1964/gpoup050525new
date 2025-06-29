package BackEndKurs.Lesson01.HomeWork.BankAccount;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000); // создаём счет с 1000 на балансе

        account.deposit(500);   // Внесём 500
        account.withdraw(200);  // Снимем 200
        account.withdraw(2000); // Попытка снять больше, чем есть

        System.out.println("Текущий баланс: " + account.getBalance());
    }
}



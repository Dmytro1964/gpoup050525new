package Proba;

public class WorkerDemo {
    public static void main(String[] args) {
        Worker worker =new Worker("Dmitriy","dmitriy@gmail.com","pass12345");
        worker.printWorkerName();

        String newEmail = "dmitriyneycompany@gmail.com";
        worker.changeEmail(newEmail);
        worker.printWorkerName();




    }
}

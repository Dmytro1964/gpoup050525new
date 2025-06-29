package JavaBasic.Proba;

public class Worker {

    private String workerName;
    private String email;
    private String password;

    public Worker(String workerName, String email, String password) {
        this.workerName = workerName;
        this.email = email;
        this.password = password;
    }
    public void changeEmail(String newEmail){
        this.email = newEmail;

    }
    public void printWorkerName(){
        System.out.println(" Информация о работнике :" );
        System.out.println(" Имя работника  : " + workerName );
        System.out.println(" Email работника  : " + email);
    }

    public static class WorkerDemo {
        public static void main(String[] args) {

            Worker worker = new Worker("Dmitriy","dmitriy@gmail.com", "pass123");

            worker.printWorkerName();

            String newEmail = " dmitriynew@gmail.com";

            worker.changeEmail(newEmail);

            worker.printWorkerName();






        }
    }
}


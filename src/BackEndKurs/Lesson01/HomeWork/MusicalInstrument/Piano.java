package BackEndKurs.Lesson01.HomeWork.MusicalInstrument;

public class Piano extends MusicalInstrument {

    public Piano() {
        super("Пианино");
    }

    @Override
    public void playNote() {
        System.out.println("Пианино играет: Динь-динь!");
    }
}

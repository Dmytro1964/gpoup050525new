package BackEndKurs.Lesson01.HomeWork.MusicalInstrument;

public class Violin extends MusicalInstrument {

    public Violin() {
        super("Скрипка");
    }

    @Override
    public void playNote() {
        System.out.println("Скрипка играет: Скрип-скрип!");
    }
}

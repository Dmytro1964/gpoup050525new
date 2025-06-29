package BackEndKurs.Lesson01.HomeWork.MusicalInstrument;

public class MusicalInstrumentDemo {
    public static void main(String[] args) {

        MusicalInstrument[] instruments = {
                new Guitar(),
                new Piano(),
                new Violin()
        };

        for (MusicalInstrument instrument : instruments) {
            instrument.displayInfo();
            instrument.playNote();
            System.out.println();
        }
    }
}
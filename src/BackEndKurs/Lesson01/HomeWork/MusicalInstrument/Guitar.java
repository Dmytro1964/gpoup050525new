package BackEndKurs.Lesson01.HomeWork.MusicalInstrument;


    public class Guitar extends MusicalInstrument {

        public Guitar() {
            super("Гитара");
        }

        @Override
        public void playNote() {
            System.out.println("Гитара играет: Тринь-тринь!");
        }
    }


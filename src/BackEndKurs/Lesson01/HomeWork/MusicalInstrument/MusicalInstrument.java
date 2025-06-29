package BackEndKurs.Lesson01.HomeWork.MusicalInstrument;

public abstract class MusicalInstrument {
    protected String name;

    public MusicalInstrument(String name) {
        this.name = name;
    }

    // Абстрактный метод для воспроизведения ноты
    public abstract void playNote();

    // Общий метод для отображения имени инструмента
    public void displayInfo() {
        System.out.println("Инструмент: " + name);
    }
}

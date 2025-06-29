package BackEndKurs.Lesson01.HomeWork.SystemConfiguration;

public class SystemConfigurationDemo {
    public static void main(String[] args) {

        // Создание конфигурации
        SystemConfiguration config = new SystemConfiguration("INFO", "/var/logs/app.log");

        // Вывод текущих параметров
        System.out.println("Текущий уровень логирования: " + config.getLogLevel());
        System.out.println("Путь к лог-файлу: " + config.getLogFilePath());

        // Попытка задать недопустимый уровень
        config.setLogLevel("VERBOSE"); // ошибка

        // Установка допустимого уровня
        config.setLogLevel("DEBUG");   // успех

        // Попытка задать пустой путь
        config.setLogFilePath("   "); // ошибка

        // Установка нового корректного пути
        config.setLogFilePath("/logs/new_log.txt");
    }
}



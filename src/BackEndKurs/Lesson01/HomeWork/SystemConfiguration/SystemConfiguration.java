package BackEndKurs.Lesson01.HomeWork.SystemConfiguration;

public class SystemConfiguration {

    // Допустимые уровни логирования
    private static final String[] ALLOWED_LOG_LEVELS = {"INFO", "DEBUG", "ERROR", "WARN"};

    private String logLevel;
    private String logFilePath;

    // Конструктор
    public SystemConfiguration(String logLevel, String logFilePath) {
        if (isValidLogLevel(logLevel)) {
            this.logLevel = logLevel;
        } else {
            throw new IllegalArgumentException("Недопустимый уровень логирования.");
        }

        if (isValidPath(logFilePath)) {
            this.logFilePath = logFilePath;
        } else {
            throw new IllegalArgumentException("Недопустимый путь к лог-файлу.");
        }
    }

    // Геттеры
    public String getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }

    // Сеттер с валидацией для logLevel
    public void setLogLevel(String logLevel) {
        if (isValidLogLevel(logLevel)) {
            this.logLevel = logLevel;
            System.out.println("Уровень логирования изменен на: " + logLevel);
        } else {
            System.out.println("Ошибка: недопустимый уровень логирования.");
        }
    }

    // Сеттер с валидацией для logFilePath
    public void setLogFilePath(String logFilePath) {
        if (isValidPath(logFilePath)) {
            this.logFilePath = logFilePath;
            System.out.println("Путь к лог-файлу обновлён: " + logFilePath);
        } else {
            System.out.println("Ошибка: путь к лог-файлу некорректен.");
        }
    }

    // Проверка допустимых уровней логирования
    private boolean isValidLogLevel(String level) {
        for (String allowed : ALLOWED_LOG_LEVELS) {
            if (allowed.equalsIgnoreCase(level)) {
                return true;
            }
        }
        return false;
    }

    // Примитивная проверка пути — можно усложнить при необходимости
    private boolean isValidPath(String path) {
        return path != null && !path.trim().isEmpty();
    }
}


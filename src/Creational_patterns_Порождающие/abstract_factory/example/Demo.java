package Creational_patterns_Порождающие.abstract_factory.example;//Абстрактная фабрика — это порождающий паттерн проектирования,
// который решает проблему создания целых семейств связанных продуктов, без указания конкретных классов продуктов.
//
//Абстрактная фабрика задаёт интерфейс создания всех доступных типов продуктов,
// а каждая конкретная реализация фабрики порождает продукты одной из вариаций.
// Клиентский код вызывает методы фабрики для получения продуктов, вместо самостоятельного создания с помощью оператора new.
// При этом фабрика сама следит за тем, чтобы создать продукт нужной вариации.


//

import Creational_patterns_Порождающие.abstract_factory.example.app.Application;
import Creational_patterns_Порождающие.abstract_factory.example.factories.GUIFactory;
import Creational_patterns_Порождающие.abstract_factory.example.factories.MacOSFactory;
import Creational_patterns_Порождающие.abstract_factory.example.factories.WindowsFactory;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {

    /**
     * Приложение выбирает тип и создаёт конкретные фабрики динамически исходя
     * из конфигурации или окружения.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
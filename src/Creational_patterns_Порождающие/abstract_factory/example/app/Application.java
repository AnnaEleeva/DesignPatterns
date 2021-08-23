package Creational_patterns_Порождающие.abstract_factory.example.app;

import Creational_patterns_Порождающие.abstract_factory.example.buttons.Button;
import Creational_patterns_Порождающие.abstract_factory.example.checkboxes.Checkbox;
import Creational_patterns_Порождающие.abstract_factory.example.factories.GUIFactory;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

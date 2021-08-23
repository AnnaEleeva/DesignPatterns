package Creational_patterns_Порождающие.abstract_factory.example.factories;

import Creational_patterns_Порождающие.abstract_factory.example.buttons.Button;
import Creational_patterns_Порождающие.abstract_factory.example.buttons.WindowsButton;
import Creational_patterns_Порождающие.abstract_factory.example.checkboxes.Checkbox;
import Creational_patterns_Порождающие.abstract_factory.example.checkboxes.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
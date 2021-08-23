package Creational_patterns_Порождающие.abstract_factory.example.factories;

import Creational_patterns_Порождающие.abstract_factory.example.buttons.Button;
import Creational_patterns_Порождающие.abstract_factory.example.checkboxes.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

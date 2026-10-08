package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZooTest {

    @Test
    public void testAddAnimal() {
        Zoo zoo = new Zoo();
        Lion lion = new Lion("Симба", 5, 150.0, 1, 10);

        zoo.addAnimal(lion);

        Assertions.assertEquals(1, zoo.animals.size());
    }

    @Test
    public void testRemoveAnimal() {
        Zoo zoo = new Zoo();
        Penguin penguin = new Penguin("Пин", 2, 5.0, 3, 20);
        zoo.addAnimal(penguin);

        zoo.removeAnimalByName("Пин");

        Assertions.assertEquals(0, zoo.animals.size());
    }

    @Test
    public void testExpensesCalculation() {
        Python python = new Python("Каа", 4, 20.0, 2, 15);
        python.addExpense(100.0);
        python.addExpense(200.0);

        Assertions.assertEquals(200.0, python.getTodayExpense(), 0.01);
        Assertions.assertEquals(300.0, python.getTotalExpense(), 0.01);
    }
}

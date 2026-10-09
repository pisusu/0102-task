package org.example;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion simba = new Lion("Симба", 5, 150.0, 1, 10);
        Python kaa = new Python("Каа", 3, 25.0, 2, 30);
        Penguin pin = new Penguin("Pin", 6, 150, 2, 300);
        Penguin kazak = new Penguin("DAUN", 1488, 67,52, 42);
        Panter gazan = new Panter("Gazan", 67, 200, 45, 365);
        Monkey chupep = new Monkey("Chupep", 6, 56, 2, 560);
        Tiger amnam = new Tiger("Amnam", 3, 250, 3, 340);

        simba.addExpense(500);
        simba.addExpense(600); // Текущий день
        kaa.addExpense(100);

        System.out.println("\n--- Добавленые или существующие животные");
        zoo.addAnimal(simba);
        zoo.addAnimal(pin);
        zoo.addAnimal(kazak);
        zoo.addAnimal(gazan);
        zoo.addAnimal(amnam);

        System.out.println("\n--- Удаленые или не найденые животные");
        zoo.removeAnimalByName("kaa");
        zoo.removeAnimalByName("Chupep");

        System.out.println("\n--- Все животные ---");
        zoo.showAllAnimals();

        System.out.println("\nРасходы за сегодня: " + zoo.getTodayExpensesAll());
        System.out.println("Расходы за всё время: " + zoo.getTotalExpensesAll());
    }
}

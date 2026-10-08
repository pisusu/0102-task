package org.example;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion simba = new Lion("Леон", 5, 150.0, 1, 10);
        Python kaa = new Python("Снейк", 3, 25.0, 2, 30);

        simba.addExpense(500);
        simba.addExpense(600); // Текущий день
        kaa.addExpense(100);

        zoo.addAnimal(simba);
        zoo.addAnimal(kaa);

        System.out.println("\n--- Все животные ---");
        zoo.showAllAnimals();

        System.out.println("\nРасходы за сегодня: " + zoo.getTodayExpensesAll());
        System.out.println("Расходы за всё время: " + zoo.getTotalExpensesAll());
    }
}

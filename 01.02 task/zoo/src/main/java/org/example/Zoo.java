package org.example;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Животное '" + animal.name + "' добавлено.");
    }

    public void showAllAnimals() {
        if (animals.isEmpty()) {
            System.out.println("В зоопарке пока нет животных.");
            return;
        }
        for (Animal a : animals) {
            a.printInfo();
        }
    }

    public void removeAnimalByName(String name) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).name.equalsIgnoreCase(name)) {
                System.out.println("Животное '" + animals.get(i).name + "' удалено.");
                animals.remove(i);
                return;
            }
        }
        System.out.println("Животное " + name + " удалено.");
    }

    public double getTodayExpensesAll() {
        double total = 0;
        for (Animal a : animals) {
            total += a.getTodayExpense();
        }
        return total;
    }

    public double getTotalExpensesAll() {
        double total = 0;
        for (Animal a : animals) {
            total += a.getTotalExpense();
        }
        return total;
    }
}

package org.example;

import java.util.ArrayList;

public class Animal {
    public String name;
    public int age;
    public double weight;
    public int enclosureNumber;
    public int daysInZoo;

    public ArrayList<Double> expenses = new ArrayList<>();

    public Animal(String name, int age, double weight, int enclosureNumber, int daysInZoo) {
        if (name == null || name.isEmpty()) {
            System.out.println("Ошибка: кличка не может быть пустой!");
        }
        if (age < 0) {
            System.out.println("Ошибка: возраст не может быть отрицательным!");
        }
        if (weight <= 0) {
            System.out.println("Ошибка: вес должен быть больше 0!");
        }
        if (enclosureNumber <= 0) {
            System.out.println("Ошибка: номер вольера должен быть больше 0!");
        }
        if (daysInZoo < 0) {
            System.out.println("Ошибка: дни не могут быть отрицательными!");
        }

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.enclosureNumber = enclosureNumber;
        this.daysInZoo = daysInZoo;
    }

    public void addExpense(double money) {
        if (money < 0) {
            System.out.println("Ошибка: расход на еду не может быть отрицательным!");
        } else {
            expenses.add(money);
        }
    }

    public double getTodayExpense() {
        if (expenses.isEmpty()) {
            return 0;
        }
        return expenses.get(expenses.size() - 1);
    }

    public double getTotalExpense() {
        double sum = 0;
        for (double e : expenses) {
            sum += e;
        }
        return sum;
    }

    public void printInfo() {
        System.out.println("Вид: " + getClass().getSimpleName() +
                " | Кличка: " + name +
                " | Возраст: " + age +
                " | Вес: " + weight + " кг" +
                " | Вольер №" + enclosureNumber +
                " | Дней в зоопарке: " + daysInZoo);
    }
}

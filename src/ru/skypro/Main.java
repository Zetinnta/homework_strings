package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задача 1

        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println();
        // Задача 2

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println();
        // Задача 3

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + fullName);

    }
}
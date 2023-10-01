package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        WLService service = new WLService();
        int income = 100000;// заработал
        int expenses = 60000;// обязательные месячные траты
        int threshold = 150000;
        int worklist = service.calculate(income, expenses, threshold);
        System.out.println("Количество месяцев отдыха: " + worklist);
    }
}
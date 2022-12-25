public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Собака " + dog + ",кошка " + cat + ", бумага " + paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Собака " + dog + ",кошка " + cat + ", бумага " + paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Собака " + dog + ",кошка " + cat + ", бумага " + paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var friend = 19.0;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов " + totalWeight + "кг!");
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе " + weightDifference + "кг!");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var weightDifference1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе " + weightDifference1 + "кг!");
        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе " + weightDifference2 + "кг!");

    }
    public static void task8 () {
        System.out.println("Задача номер 8");
        var totalHours = 640;
        var personHours = 8;
        var totalNumber = totalHours / personHours;
        System.out.println("Всего работников в компании " + totalNumber + " человек");
        totalNumber = totalNumber + 94;
        totalHours = totalNumber * personHours;
        System.out.println("Если в компании работает " + totalNumber + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками»");
    }

}
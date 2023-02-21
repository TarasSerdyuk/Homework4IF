public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 17;
        if (age >= 18) System.out.println("он совершеннолетний");
        else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        short T = 1;
        if (5 > T) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 61;
        if (60 < speed) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte age = 17;
        if ((age >= 2) && (age <= 6)) {
            System.out.println("Если возраст человека равен " + age + " ему нужно ходить в детский сад");
        }
        if ((age >= 7) && (age <= 18)) {
            System.out.println("Если возраст человека равен " + age + " ему нужно ходить в школу");
        }
        if ((age > 18) && (age <= 24)) {
            System.out.println("Если возраст человека равен " + age + " ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte age = 17;
        if (age < 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else {
            if (age >= 5 && age <= 14) {
                System.out.println("можно кататься на аттракционе в сопровождении взрослого");
            }
            if (age > 14) {
                System.out.println("можно кататься на аттракционе без сопровождения взрослого");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte capasity = 102;
        byte seating = 60;
        byte passenger = 50;
        if (passenger > capasity) {
            System.out.println("вагон полность забит");
        } else {
            if (passenger > seating) {
                System.out.println("в вагоне только стоячие места");
            } else {
                int seaInATrainCar = seating - passenger;
                System.out.println("в вагоне " + seaInATrainCar + " сидячих места");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}
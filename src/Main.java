// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Домашнее задание №3");
        System.out.println("Переменные. Урок 2");
        //Задание 1
        task1();
        System.out.println(".....");
        //Задание 2
        task2();
        System.out.println(".....");
        //Задание 3
        task3();
        System.out.println(".....");
        //Задание 4
        task4();
        System.out.println(".....");
        //Задание 5
        task5();
        System.out.println(".....");
        //Задание 6
        task6();
        System.out.println(".....");
        //Задание 7
        task7();
        System.out.println(".....");
        //Задание 8
        task8();
        System.out.println("_________");
        System.out.println("Домашка закончилась. Всем спасибо, все свободны.");
    }

    private static void task8() {
        System.out.println("Задание 8");
        //Инициализация
        float masha = 67760F;
        float denis = 83690F;
        float kristina = 76230F;
        int percent = 10;
        //Решение
        float mashaNew = masha * percent/100;
        float denisNew = denis * percent/100;
        float kristinaNew = kristina * percent/100;
        float mashaBonus = (mashaNew-masha)*12;
        float denisBonus = (denisNew-denis)*12;
        float kristinaBonus = (kristinaNew-kristina)*12;
        //Вывлд
        System.out.println("Маша теперь получает "+String.format("%.2f", mashaNew)+
                " рублей. Годовой доход вырос на "+String.format("%.2f", mashaBonus)+" рублей");
        System.out.println("Денис теперь получает "+String.format("%.2f", denisNew)+
                " рублей. Годовой доход вырос на "+String.format("%.2f", denisBonus)+" рублей");
        System.out.println("Денис теперь получает "+String.format("%.2f", kristinaNew)+
                " рублей. Годовой доход вырос на "+String.format("%.2f", kristinaBonus)+" рублей");

    }

    private static void task7() {
        System.out.println("Задание 7");
        //Инициализация
        float boxerWeight = 7.0F;
        float miniWeight1 = 0.250F;
        float maxiWeight2 = 0.5F;
        //Решение
        int miniDey = (int) (boxerWeight/miniWeight1);
        int maxiDey = (int) (boxerWeight/maxiWeight2);
        int sredDey = (miniDey+maxiDey)/2;
        //Вывод
        System.out.println("И так...");
        System.out.println("Вес боксера можно чбросить за " + miniDey +
                " дней, или за " + maxiDey +
                " дней, будем расчитывать на среднее количество дней " + sredDey);
    }

    private static void task6() {
        System.out.println("Задание 6");
        //Инициализация
        int bananWeightGr = 80;
        int bananaCount = 5;
        int milkWeightMl = 200;
        int milkGrIn100Ml = 105;
        int milkCount =2;
        int plombirWeightGr = 100;
        int plombirCount = 2;
        int egeWeightGr = 70;
        int egeCount = 4;
        //Решение
        int milkWeightGr = milkWeightMl / 100 * milkGrIn100Ml;
        int totalWeightGr = bananaCount*bananWeightGr +
                milkCount*milkWeightGr +
                plombirCount*plombirWeightGr +
                egeCount*egeWeightGr;
        //Вывод
        System.out.println("И так...");
        System.out.println("Вес спортзавтрака: " + String.format("%.3f",((float) totalWeightGr/1000)) +
                "кг, или " + totalWeightGr + " грамм.");
    }

    private static void task5() {
        System.out.println("Задание 5");
        //Инициализация
        int totalPaint = 120;
        int paint2ClassWhite = 2;
        int paint2ClassBrown = 4;
        //Решение
        int totalClass = totalPaint/(paint2ClassBrown+paint2ClassWhite);
        int totalBrown = totalClass*paint2ClassBrown;
        int totalWhite = totalClass*paint2ClassWhite;
        // Вывод
        System.out.println("И так...");
        System.out.println("В школе, где "+totalClass+" классов, нужно "+totalWhite+
                " банок белой краски и "+totalBrown+" банок коричневой краски");
    }

    private static void task4() {
        System.out.println("Задание 4");
        //Инициализация исходных данных
        int speed = 16/2;
        //Решение
        int rezult20m = speed*20;
        int rezult1D = speed*60*24;
        int rezult3D = rezult1D*3;
        int rezult1M = rezult1D*30;
        // Вывод
        System.out.println("И так, производительность");
        System.out.println(" за 20 минут: " + rezult20m);
        System.out.println(" за 1 сутки: " + rezult1D);
        System.out.println(" за 3 дня: " + rezult3D);
        System.out.println(" за 1 месяц: " + rezult1M);

    }

    private static void task3() {
        System.out.println("Задание 3");
        //Инициализация исходных данных
        byte tLP = 23;
        byte tAS = 27;
        byte tEA = 30;
        int paper = 490;
        int paper2student = 0;
        //Решение
        int studentAll = (tAS + tEA + tLP);
        paper2student = paper / studentAll;
        //Вывод
        System.out.println("На каждого ученика рассчитано "+ paper2student +" листов бумаги");
        System.out.println("И останутся запосных листов " + (paper - (studentAll * paper2student)));
    }

    public static void task2() {
        System.out.println("Задание 2");
        //Инициализация по типу.
        float var1 = 27.12F;
        long var2 = 987678965549L;
        float var3 = 2.786F;
        short var4 = 569;
        short var5 = -159;
        short var6 = 27897;
        byte var7 = 67;
        //Решение

        //Вывод
        System.out.println("""
                Дано следующие значения:\s
                    27.12
                    987 678 965 549
                    2.786
                    569
                    -159
                    27897
                    67
                Надо выставить типы""");
        System.out.println("Значение 27.12 - Flost ="+var1);
        System.out.println("Значение 987 678 965 549 - Long ="+var2);
        System.out.println("Значение 2.786 - Float ="+var3);
        System.out.println("Значение 569 - Short ="+var4);
        System.out.println("Значение -159 - Short ="+var5);
        System.out.println("Значение 27897 - Short ="+var6);
        System.out.println("Значение 67 - Byte ="+var7);
    }

    public static void task1() {
        System.out.println("Задание 1");
        int varInt = 10;
        byte varByte = 80;
        short varShort = 32500;
        long varLong = 987654321;
        float varFloat = 3.75F;
        double varDouble = -1.6E+300;
        System.out.println("Обьявленны переменные:");
        System.out.println("varInt = " + varInt);
        System.out.println("varByte = " + varByte);
        System.out.println("varShort = " + varShort);
        System.out.println("varLong = " + varLong);
        System.out.println("varFloat = " + varFloat);
        System.out.println("varDouble = " + varDouble);
    }

}
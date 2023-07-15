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
        //Решение
        float mashaNew = (float) (masha * 1.1);
        float denisNew = (float) (denis * 1.1);
        float kristinaNew = (float) (kristina * 1.1);
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
        float bananW = 0.08F;
        float milkW = 0.105F;
        float plombirW = 0.100F;
        float egeW = 0.007F;
        //Решение
        float totalW = 5*bananW + 2*milkW + 2*plombirW + 4*egeW;
        //Вывод
        System.out.println("И так...");
        System.out.println("Вес спортзавтрака: " + String.format("%.3f", totalW) + "кг, или " + String.format("%.0f", totalW*1000) + " грамм.");
    }

    private static void task5() {
        System.out.println("Задание 5");
        //Инициализация
        int totalCol = 120;
        int p2pColW = 2;
        int p2pColB = 4;
        //Решение
        int totalClass = totalCol/(p2pColB+p2pColW);
        int totalB = totalClass*p2pColB;
        int totalW = totalClass*p2pColW;
        // Вывод
        System.out.println("И так...");
        System.out.println("В школе, где "+totalClass+" классов, нужно "+totalW+
                " банок белой краски и "+totalB+" банок коричневой краски");
    }

    private static void task4() {
        System.out.println("Задание 4");
        //Инициализация
        int speed = 16;
        //Решение
        int rezult20m = speed/2*20;
        int rezult1D = speed/2*60*24;
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
        //Инициализация
        byte tLP = 23;
        byte tAS = 27;
        byte tEA = 30;
        int paper = 490;
        int p2p =0;
        //Решение
        int tAll = (tAS + tEA + tLP);
        p2p = paper / tAll;
        //Вывод
        System.out.println("На каждого ученика рассчитано "+ p2p +" листов бумаги");
        System.out.println("И останутся запосных листов " + (paper - (tAll * p2p)));
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
        System.out.println("Дано следующие значения: \n" +
                "    27.12\n" +
                "    987 678 965 549\n" +
                "    2.786\n" +
                "    569\n" +
                "    -159\n" +
                "    27897\n" +
                "    67\n" +
                "Надо выставить типы");
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
public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte countCore = 12;
        short typeSystem = 64;
        int hdd = 2;
        long ramVideo = 32L;
        float ram = 32.0F;
        double cpuСlock = 3.99;
        char seriesStation = 'P';
        boolean isStation = true;
        System.out.println("Количество ядер процессора: " + countCore + "\n" +
                "Разрядность системы: " + typeSystem + "\n" +
                "Обьем HDD: " + hdd + "Tb\n" +
                "Видео память: " + ramVideo + "Gb\n" +
                "ОЗУ: " + ram + "Gb\n" +
                "Тактовая частота процессора: " + cpuСlock + " GHz\n" +
                "Серия Lenovo ThinkStation: " + seriesStation + "\n" +
                "Является рабочей станцией?: " + isStation);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double penPrice = 100;
        double bookPrice = 200.00;
        double discount = 11.00;
        double sumGoods = penPrice + bookPrice;
        double sumDiscount = (sumGoods / 100.00) * discount;
        double discountPrice = sumGoods - sumDiscount;
        System.out.println("Общая стоимость товаров (ручка, книга): " + sumGoods + "руб.\n" +
                "Сумма скидки на товары: " + sumDiscount + "руб.\n" +
                "Сумма товаров с учетом скидки: " + discountPrice + "руб.");

        System.out.println("\n3. Вывод слова JAVA\n" +
                "    J     a     v     v    a\n" +
                "    J    a a     v   v    a a\n" +
                " J  J   aaaaa     V V    aaaaa\n" +
                "  JJ   a     a     V    a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte bt = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
        System.out.println("Тип byte: " + bt + " (++b) -> " + ++bt + " (--b) -> " + --bt + "\n" +
                "Тип short: " + s + " (++s) -> " + ++s + " (--s) -> " + --s + "\n" +
                "Тип int: " + i + " (++i) -> " + ++i + " (--i) -> " + --i + "\n" +
                "Тип long: " + l + " (++l) -> " + ++l + " (--l) -> " + --l);

        System.out.println("\n5. Перестановка значений переменных");
        //с помощью третьей переменной
        int a = 2;
        int b = 5;
        int tmp = a;
        System.out.println("С помощью третьей переменной\n" +
                String.format("Исходные значения переменных: first = %d, second = %d\n", a, b) +
                String.format("Новые значения переменных: first = %d, second = %d", 
            a = b, b = tmp));
        
        //с помощью арифметических операций
        System.out.println("С помощью арифметических операций\n" +
                String.format("Исходные значения переменных: first = %d, second = %d", a, b));
        a += b;
        b = a - b;
        a -= b;
        System.out.println(String.format("Новые значения переменных: first = %d, second = %d", a, b));
        
        //с помощью побитовой операции ^
        System.out.println("С помощью побитовой операции ^\n" +
                String.format("Исходные значения переменных: first = %d, second = %d", a, b));
        a ^= b;
        b = a ^ b;
        a ^= b;
        System.out.println(String.format("Новые значения переменных: first = %d, second = %d", a, b));

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$'; //36
        char asterisk = '*'; //42
        char atSign = '@'; //64
        char verticalBar = '|'; //124
        char tilde = '~'; //126
        System.out.println((int) dollar + " " + dollar + "\n" +
                (int) asterisk + " " + asterisk + "\n" +
                (int) atSign + " " + atSign + "\n" +
                (int) verticalBar + " " + verticalBar + "\n" +
                (int) tilde + " " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.printf("%7c%c%n", slash, backSlash);
        System.out.printf("%6c%3c%n", slash, backSlash);
        System.out.printf("%5c%c%c%2c%c%n", slash,underscore, leftParenthesis, rightParenthesis, backSlash);
        System.out.printf("%4c%7c%n", slash, backSlash);
        System.out.printf("%3c%c%c%c%c%c%c%c%c%c%n", slash, underscore, underscore, underscore, underscore, 
                slash, backSlash, underscore, underscore, backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = (number / 100);
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sumDigits = hundreds + tens + ones;
        int productDigits = hundreds * tens * ones;
        System.out.println("Число " + number + " содержит:\n" +
                "    сотен - " + hundreds + "\n" +
                "    десятков - " + tens + "\n" +
                "    единиц - " + ones + "\n" +
                "Сумма его цифр = " + sumDigits + "\n" +
                "Произведение = " + productDigits);

        System.out.println("\n9. Вывод времени");
        int totalSecond = 86399;
        int hours = totalSecond / 3600;
        int minutes = (totalSecond % 3600) / 60;
        int seconds = totalSecond % 60;
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }
}
public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte countCore = 12;
        short systemType = 64;
        int hdd = 2;
        long vram = 32L;
        float ram = 32.0F;
        double cpuСlock = 3.99;
        char seriesStation = 'P';
        boolean isStation = true;
        System.out.println("Количество ядер процессора: " + countCore + "\n" +
            "Разрядность системы: " + systemType + "\n" +
            "Обьем HDD: " + hdd + "Tb\n" +
            "Видео память: " + vram + "Gb\n" +
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

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println(    "    J     a     v     v    a\n" +
            "    J    a a     v   v    a a\n" +
            " J  J   aaaaa     V V    aaaaa\n" +
            "  JJ   a     a     V    a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Тип byte: " + maxByte + " (++maxByte) -> " + ++maxByte + " (--maxByte) -> " + --maxByte);
        System.out.println("Тип short: " + maxShort + " (++maxShort) -> " + ++maxShort + " (--maxShort) -> " + --maxShort);
        System.out.println("Тип int: " + maxInt + " (++maxInt) -> " + ++maxInt + " (--maxInt) -> " + --maxInt);
        System.out.println("Тип long: " + maxLong + " (++maxLong) -> " + ++maxLong + " (--maxLong) -> " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        //с помощью третьей переменной
        int a = 2;
        int b = 5;
        int tmp = a;
        System.out.println("С помощью третьей переменной");
        System.out.printf("Исходные значения переменных: first = %d, second = %d\n", a, b);
        System.out.printf("Новые значения переменных: first = %d, second = %d\n", a = b, b = tmp);
        
        //с помощью арифметических операций
        System.out.println("С помощью арифметических операций");
        System.out.printf("Исходные значения переменных: first = %d, second = %d\n", a, b);
        a += b;
        b = a - b;
        a -= b;
        System.out.printf("Новые значения переменных: first = %d, second = %d\n", a, b);
        
        //с помощью побитовой операции ^
        System.out.println("С помощью побитовой операции ^");
        System.out.printf("Исходные значения переменных: first = %d, second = %d\n", a, b);
        a ^= b;
        b = a ^ b;
        a ^= b;
        System.out.printf("Новые значения переменных: first = %d, second = %d\n", a, b);

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
        System.out.println("Число " + number + " содержит:");
        System.out.println("    сотен - " + hundreds);
        System.out.println("    десятков - " + tens);
        System.out.println("    единиц - " + ones);
        System.out.println("Сумма его цифр = " + sumDigits);
        System.out.println("Произведение = " + productDigits);

        System.out.println("\n9. Вывод времени");
        int totalSecond = 86399;
        int hours = totalSecond / 3600;
        int minutes = (totalSecond % 3600) / 60;
        int seconds = totalSecond % 60;
        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
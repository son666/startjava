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
        System.out.println("Количество ядер процессора: " + countCore);
        System.out.println("Разрядность системы: " + typeSystem);
        System.out.println("Обьем HDD: " + hdd + "Tb");
        System.out.println("Видео память: " + ramVideo + "Gb");
        System.out.println("ОЗУ: " + ram + "Gb");
        System.out.println("Тактовая частота процессора: " + cpuСlock + " GHz");
        System.out.println("Серия Lenovo ThinkStation: " + seriesStation);
        System.out.println("Является рабочей станцией?: " + isStation);
        System.out.println("");

        System.out.println("2. Расчет стоимости товара со скидкой");
        double penPrice = 100.00;
        double bookPrice = 200.00;
        double discount = 11.00;
        double sumProductPrice = penPrice + bookPrice;
        double discountPrice = (sumProductPrice / 100.00) * discount;
        double sumDiscountProductPrice = sumProductPrice - discountPrice;
        System.out.println("Общая стоимость товаров (ручка, книга): " + sumProductPrice + "руб.");
        System.out.println("Сумма скидки на товары: " + discountPrice + "руб.");
        System.out.println("Сумма товаров с учетом скидки: " + sumDiscountProductPrice + "руб.");
        System.out.println("");

        System.out.println("3. Вывод слова JAVA");
        System.out.println(String.format("    J     a     v     v    a"));
        System.out.println(String.format("    J    a a     v   v    a a"));
        System.out.println(String.format(" J  J   aaaaa     V V    aaaaa"));
        System.out.println(String.format("  JJ   a     a     V    a     a"));
        System.out.println("");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte b = 127;
        short s = 32_767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
        System.out.println("Тип byte: " + b + " (++b) -> " + ++b + " (--b) -> " + --b);
        System.out.println("Тип short: " + s + " (++s) -> " + ++s + " (--s) -> " + --s);
        System.out.println("Тип int: " + i + " (++i) -> " + ++i + " (--i) -> " + --i);
        System.out.println("Тип long: " + l + " (++l) -> " + ++l + " (--l) -> " + --l);
        System.out.println("");

        System.out.println("5. Перестановка значений переменных");
        //с помощью третьей переменной
        int first = 2;
        int second = 5;
        int tmp = first;
        System.out.println("С помощью третьей переменной");
        System.out.println(String.format("Исходные значения переменных: first = %d, second = %d", first, second));
        System.out.println(String.format("Новые значения переменных: first = %d, second = %d", 
            first = second, second = tmp));
        
        //с помощью арифметических операций
        System.out.println("С помощью арифметических операций");
        System.out.println(String.format("Исходные значения переменных: first = %d, second = %d", first, second));
        first = first + second;
        second = first - second;
        first = first - second;
        System.out.println(String.format("Новые значения переменных: first = %d, second = %d", first, second));
        
        //с помощью побитовой операции ^
        System.out.println("С помощью побитовой операции ^");
        System.out.println(String.format("Исходные значения переменных: first = %d, second = %d", first, second));
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
        System.out.println(String.format("Новые значения переменных: first = %d, second = %d", first, second));
        System.out.println("");

        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$'; //36
        char asterisk = '*'; //42
        char atsign = '@'; //64
        char verticalBar = '|'; //124
        char tilde = '~'; //126
        System.out.println("36 " + dollar);
        System.out.println("42 " + asterisk);
        System.out.println("64 " + atsign);
        System.out.println("124 " + verticalBar);
        System.out.println("126 " + tilde);
        System.out.println("");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underScore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println(String.format("      %c%c       ", slash, backSlash));
        System.out.println(String.format("     %c  %c       ", slash, backSlash));
        System.out.println(String.format("    %c%c%c %c%c       ", slash, underScore, leftParenthesis, 
            rightParenthesis, backSlash));
        System.out.println(String.format("   %c      %c       ", slash, backSlash));
        System.out.println(String.format("  %c%c%c%c%c%c%c%c%c%c       ", slash, underScore, underScore, underScore, 
            underScore, slash, backSlash, underScore, underScore, backSlash));
        System.out.println("");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sumDigitNumber = hundreds + tens + ones;
        int multiplyDigitNumber = hundreds * tens * ones;
        System.out.println("Число " + number + " содержит:");
        System.out.println("    сотен - " + hundreds);
        System.out.println("    десятков - " + tens);
        System.out.println("    единиц - " + ones);
        System.out.println("Сумма его цифр = " + sumDigitNumber);
        System.out.println("Произведение = " + multiplyDigitNumber);
        System.out.println("");

        System.out.println("9. Вывод времени");
        int totalSecond = 86399;
        int hours = totalSecond / 3600;
        int minutes = (totalSecond % 3600) / 60;
        int seconds = totalSecond % 60;
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }
}
package com.zufrost.learn;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        /*byte
                int
                        short
                                long
                                        float
                                                double
                                                        char
                                                                boolean*/
        int x;
        int y, z, w;
        int time = x = y = z = 1;
        byte b = 1;
        short c = 1;
        long k = 1;
        double d = 1;
        float f = 1;
        char ch = 1;
        boolean flag = true;

        // Отметьте 3 ошибочных объявления переменной типа double, Double
        System.out.println("double");
        double d1 = 0.0f;
        System.out.println(d1);

        Double d2 = new Double(.0f);
        System.out.println(d2);

//        Double d3 = 0.0f;

//        Double d4 = new Double("1L");

        Double d5 = 0.d;
        System.out.println(d5);

//        Double d6 = 1L;

//   Отметьте 2 ошибочных объявления переменной типа int, Integer.
        System.out.println("integer");
        int i1 = Integer.parseInt("14");
        System.out.println(i1);

        Integer i2 = 85;
        System.out.println(i2);

        //int i3 = Integer.decode('12');

        int i4 = Integer.valueOf("21");
        System.out.println(i4);

        //int i5 = Integer.valueOf(null);

        int i6 = new Integer("15");
        System.out.println(i6);

// Какие из следующих строк скомпилируются и выполнятся без ошибки? Выберите 3 строки.

        System.out.println("Какие из следующих строк скомпилируются и выполнятся без ошибки? Выберите 3 строки");
//        System.out.println(new Integer(null));

//        System.out.println(new String(null));

        System.out.println(new String("null"));

//        System.out.println((char[])null);

        System.out.println((true ? null : 0));

        System.out.println((String)null);




    }

    //Сколько памяти будут занимать примитивные типы в классе?
    public class Memory {
        String cityOfFlat = "Minsk";
        char entrance = '1'; // 2
        boolean isInTheCenter = true; //1 !!!! хотя во всех источниках 2 или 4 байта. https://ru.wikibooks.org/wiki/Java/%D0%A2%D0%B8%D0%BF%D1%8B_%D0%B4%D0%B0%D0%BD%D0%BD%D1%8B%D1%85

        /*Логический тип
        Тип 	Размер (бит) 	Значение
        boolean 	8 (в массивах), 32 (не в массивах используется int) 	true (истина) или false (ложь)*/

        Object country = new Object();
        double square = 104.79; //8
        int countOfFloors = 9; //4
        byte appartmentsCount = 3; //1
    }
}

package com.company;

public class DemoAdder
{
    //寫一個lib做任意型態的加減法：
    // byte    : 8bit (1byte)
    // short   : 16bit(2byte)
    // int     : 32bit(4byte)
    // long    : 64bit(8byte)
    // float   : 32bit
    // double  : 64bit(8byte)
    // boolean :  1bit
    // char    : 16bit(2byte)
    public void show()
    {
        /* byte */
        byte addedByte = 127; byte addByte = 64;
        Adder<Byte> adderByte = new Adder<>(addedByte, addByte);
        System.out.println("Byte = " + adderByte.getAdd());

        /* short */
        Short addedShort = 12743; Short addShort = 6434;
        Adder<Short> adderShort = new Adder<>(addedShort, addShort);
        System.out.println("Short = " + adderShort.getAdd());

        /* int */
        int addedInt = 20; int addInt = 30;
        Adder<Integer> adderInt = new Adder<>(addedInt, addInt);
        System.out.println("Integer = "  +adderInt.getAdd());

        /* long */
        long addedLong = 444444; long addLong = 111111;
        Adder<Long> adderLong = new Adder<>(addedLong, addLong);
        System.out.println("Long = " + adderLong.getAdd());

        /* float */
        float addedFloat = 44.33f; float addFloat = 11.22f;
        Adder<Float> adderFloat = new Adder<>(addedFloat, addFloat);
        System.out.println("Float = " + adderFloat.getAdd());

        /* double */
        double addedDouble = 1234.45678; double addDouble = 1234.45678;
        Adder<Double> adderDouble = new Adder<>(addedDouble, addDouble);
        System.out.println("Double = " + adderDouble.getAdd());

        /* boolean */
        boolean addedBoolean = false; boolean addBoolean = false;
        Adder<Boolean> adderBoolean = new Adder<>(addedBoolean, addBoolean);
        System.out.println("Boolean = " + adderBoolean.getAdd());

        /* char */
        char addedChar = 'A';  //65
        char addChar = 'B';    //66
        Adder<Character> adderCharacter = new Adder<>(addedChar, addChar);
        System.out.println("Character = " + adderCharacter.getAdd());

//        Byte = 191
//        Short = 19177
//        Integer = 50
//        Long = 555555
//        Float = 55.550003
//        Double = 2468.91356
//        Boolean = 0
//        Character = 131
    }
}

package com.msa4java.edu.enumeration;

public class EnumMain {
    public static void main(String[] args) {
        Week day = Week.MONDAY;
        System.out.println(day); // MONDAY
        System.out.println(day.name()); // MONDAY
        System.out.println(day.getKrDay()); // 월요일
    }
}

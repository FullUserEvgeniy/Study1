package com.company;
class Main {
    \\ метод с переменным числом аргументов
    static void vaTest(int ... v){ 
        System.out.println("Количество аргументов: "+v.length);
        System.out.println("Содержимое: ");
        for (int i=0;i<v.length;i++) System.out.println("arg "+i+": "+v[i]);
        System.out.println();
    }
    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,3,5);
        vaTest();
    }
}

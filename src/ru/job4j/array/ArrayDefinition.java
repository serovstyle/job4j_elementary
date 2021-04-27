package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Alexey";
        names[1] = "Sergey";
        names[2] = "Inokentiy";
        names[3] = "Svyatoslav";
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Array length = " + ages.length);
        System.out.println("Array length = " + surnames.length);
        System.out.println("Array length = " + prices.length);
    }
}

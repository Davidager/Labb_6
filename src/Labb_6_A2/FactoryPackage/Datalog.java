package Labb_6_A2.FactoryPackage;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by David on 14-Dec-16.
 */
public class Datalog extends Human{
    private int year;

    public String toString() {
        return super.toString() + ", D" + String.valueOf(year).substring(2);
    }

    Datalog(int age, String name, int year) {
        super(age, name, year);
        if ((year < 1983) | (year > 2016)) {
            throw new IllegalArgumentException("Det finns inga dataloger som börjat " + year);
        } else if ((2016 - age) + 15 > year) { // Måste vara minst 15 för att kunna börja plugga
            throw new IllegalArgumentException("Dataloger kan inte vara / ha varit yngre än 14 år");
        }
        this.year = year;
    }

    Datalog() {
        int age = ThreadLocalRandom.current().nextInt(15, 101);  //  slumpar tillåten ålder (mellan 15 och 100)
        setAge(age);
        setNameRandom();
        year = ThreadLocalRandom.current().nextInt((2016 - age) + 66, 2017);   // slumpar tillåten årgång (med hänsyn till ålder)
        setYear(year);
    }
}

package Labb_6_A2.FactoryPackage;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Created by David on 03-Nov-16.
 */
public class Fysiker extends Human {
    private int year;

    public String toString() {
        return super.toString() + ", F" + String.valueOf(year).substring(2);
    }

    Fysiker(int age, String name, int year) {
        super(age, name, year);
        if ((year < 1932) | (year > 2016)) {
            throw new IllegalArgumentException("Det finns inga fysiker som börjat " + year);
        } else if ((2016 - age) + 15 > year) { // Måste vara minst 15 för att kunna börja plugga
            throw new IllegalArgumentException("Fysiker kan inte vara / ha varit yngre än 14 år");
        }
        this.year = year;
    }

    Fysiker() {
        int age = ThreadLocalRandom.current().nextInt(15, 101);  //  slumpar tillåten ålder (mellan 15 och 100)
        setAge(age);
        setNameRandom();
        year = ThreadLocalRandom.current().nextInt((2016 - age) + 15, 2017);   // slumpar tillåten årgång (med hänsyn till ålder)
        setYear(year);
    }

}
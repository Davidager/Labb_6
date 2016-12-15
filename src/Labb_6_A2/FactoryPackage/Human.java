package Labb_6_A2.FactoryPackage;

/**
 * Created by David on 10-Dec-16.
 */

public abstract class Human implements Comparable<Human> {
    private int age;
    private String name;
    private int year;


    private static String[] nameArray = {"Wilma", "William", "Maja", "Lucas", "Ella", "Elias", "Emma", "Oscar", "Julia",
            "Hugo", "Alice", "Viktor", "Alva", "Filip", "Linnea", "Erik", "Ida", "Emil", "Ebba", "Isak", "Elin", "Anton"};

    Human(int age, String name, int year) {
        this.age = age;
        this.name = name;
        this.year = year;
    }

    Human() {
        //this((int)(Math.random() * 100), generateRandomName(), ThreadLocalRandom.current().nextInt((2016 - age) + 15, 2017));
    }

    public static Human create(String name, String year, int age) {
        String letter = year.substring(0,1);
        int yearEnding = Integer.parseInt(year.substring(1,3));
        if (letter.equals("D")) {
            if (yearEnding < 50) {   // för att få rätt sekel
                return new Datalog(age, name, 20*100 + yearEnding);
            } else {
                return new Datalog(age, name, 19*100 + yearEnding);
            }
        } else if (letter.equals("F")) {
            if (yearEnding < 30) {   // för att få rätt sekel
                return new Fysiker(age, name, 20*100 + yearEnding);
            } else {
                return new Fysiker(age, name, 19*100 + yearEnding);
            }
        } else {
            System.out.println("Wrong letter!!");
            System.exit(0);
            return null;
        }
    }

    private static String generateRandomName() {
        return nameArray[(int)(Math.random()*nameArray.length)];
    }

    public String toString() {
        return "namn: " + name + ", ålder: " + String.valueOf(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getYear()  {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareTo(Human otherHuman) {
        int otherAge = otherHuman.getAge();
        int thisAge = this.getAge();
        if (thisAge == otherAge) {   // sorterar efter årskurs om åldrarna är samma
            return year - otherHuman.getYear();
        } else {
            return thisAge - otherAge;
        }

    }

    public void setName(String newName) {
        name = newName;
    }

    public void setNameRandom() {
        name = generateRandomName();
    }

    public String getName() {
        return name;
    }

}

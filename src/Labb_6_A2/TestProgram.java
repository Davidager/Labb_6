package Labb_6_A2;

import Labb_6_A2.FactoryPackage.*;
import Labb_6_A2.FactoryPackage.Human;

/**
 * Created by David on 14-Dec-16.
 */
public class TestProgram {
    public static void main(String[] args) {
        Human testfys = Human.create("Kalle", "F89", 50);
        System.out.println(testfys);

        Human testdat = Human.create("Alle", "D97", 66);
        System.out.println(testdat);

        /*new Fysiker();
        new Datalog();

        new Human() {
        }*/
    }
}

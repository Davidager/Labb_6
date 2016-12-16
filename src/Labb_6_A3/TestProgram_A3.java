package Labb_6_A3;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by David on 15-Dec-16.
 */
public class TestProgram_A3 {
    int N = 500000;   // 500000 bra
    int counter;
    Random rand;
    List testList;
    int[] aArray;
    int[] bArray;


    public TestProgram_A3() {
        //BuilderList myBuilderList = new BuilderList<>();
        ArrayList myArrayList = new ArrayList<>();
        LinkedList myLinkedList = new LinkedList<>();
        BuilderList2 my2B = new BuilderList2<>();
        rand = new Random();
        aArray = index_a_Function();
        bArray = index_b_Function();

        testMethod(my2B);
        //testMethod(myBuilderList);
        testMethod(myArrayList);
        testMethod(myLinkedList);

    }

    public int[] index_a_Function() {
        int[] retList = new int[N+1];
        for (int i = 0; i < N+1; i++) {
            retList[i] = rand.nextInt(i+1);
        }
        return retList;
    }

    public int[] index_b_Function() {
        int[] retList = new int[N+1];
        for (int i = 0; i< N+1 ; i++) {
            retList[i] = rand.nextInt(N+1);
        }
        return retList;
    }

    public void testMethod (List testList) {
        System.out.println(testList.getClass());
        this.testList = testList;
        long startTime1 = System.nanoTime();
        //counter = 0;
        /*for (int i = 0; i < N + 1; i++) {
            testList.add(, 0);
            //counter++;
        }*/
        for (int index : aArray) {
            testList.add(0, 0);
        }
        System.out.println(System.nanoTime()-startTime1);

        long startTime2 = System.nanoTime();
        for (int index : bArray) {
            testList.get(index);
        }
        long stopTime = System.nanoTime() - startTime2;
        System.out.println(stopTime);
    }

    private static String[] nameArray = {"Wilma", "William", "Maja", "Lucas", "Ella", "Elias", "Emma", "Oscar", "Julia",
            "Hugo", "Alice", "Viktor", "Alva", "Filip", "Linnea", "Erik", "Ida", "Emil", "Ebba", "Isak", "Elin", "Anton"};

    private String generateRandomName() {
        return nameArray[rand.nextInt(nameArray.length)];
    }

    public static void main(String[] args) {
        new TestProgram_A3();
    }
}

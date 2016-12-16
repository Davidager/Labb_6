package Labb_6_A1;

/**
 * Created by David on 10-Dec-16.
 */
public class FrameA1_1 {
    public static void main(String[] args) {
        BagContainer resvaska = new BagContainer("resväska", 5);
        BagContainer neccessar = new BagContainer("neccessär", 0.3);
        BagContainer linsburk = new BagContainer("linsburk", 0.05);
        BagContainer datorvaska = new BagContainer("datorväska", 0.4);
        BagContainer pase = new BagContainer("påse", 0.01);
        BagItem schampoflaska = new BagItem("schampoflaska", 0.35);
        BagItem linser = new BagItem("lins", 0.003);
        BagItem skjorta = new BagItem("skjorta", 0.2);
        BagItem dator = new BagItem("dator", 4);
        BagItem bowlingklot = new BagItem("bowlingboll", 7);
        BagItem penna = new BagItem("penna", 0.1);
        BagItem suddigum = new BagItem("suddigum", 0.05);

        resvaska.add(neccessar);
        resvaska.add(datorvaska);
        resvaska.add(skjorta);
        resvaska.add(bowlingklot);

        neccessar.add(pase);
        neccessar.add(schampoflaska);

        pase.add(linsburk);
        linsburk.add(linser);

        datorvaska.add(dator);
        datorvaska.add(penna);
        datorvaska.add(suddigum);

        System.out.println(resvaska);
        System.out.println(resvaska.getWeight());
        System.out.println();

        for (BagComponent item : resvaska) {
            System.out.println(item.getName());
        }
        System.out.println();

        BagComponentRegistry registry = new BagComponentRegistry();
        BagContainer resvaska2 = (BagContainer)registry.createBagComponent("resväska");
        BagContainer resvaska3 = (BagContainer)registry.createBagComponent("resväska");
        BagContainer refResvaska = (BagContainer)registry.getReferenceComponent("resväska");

        System.out.println(resvaska2);
        System.out.println(refResvaska == resvaska2);
        System.out.println(resvaska2.getChild(0));
        System.out.println(resvaska2.getChild(0) == refResvaska.getChild(0));
        System.out.println(resvaska2.getChild(0).getChild(0) == refResvaska.getChild(0).getChild(0));

        System.out.println();
        System.out.println(resvaska3 == resvaska2);


    }
}

package Labb_6_A1;

/**
 * Created by David on 10-Dec-16.
 */
public class Frame {
    public static void main(String[] args) {
        BagContainer resvaska = new BagContainer("resväska", 5);
        BagContainer neccessar = new BagContainer("neccessär", 0.3);
        BagContainer linsburk = new BagContainer("linsburk", 0.05);
        BagContainer datorvaska = new BagContainer("datorväska", 0.4);
        BagContainer pase = new BagContainer("påse", 0.01);
        BagItem schampoo = new BagItem("schampoo", 0.35);
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
        neccessar.add(schampoo);

        pase.add(linsburk);
        linsburk.add(linser);

        datorvaska.add(dator);
        datorvaska.add(penna);
        datorvaska.add(suddigum);

        System.out.println(resvaska);
        System.out.println(resvaska.getWeight());
    }
}

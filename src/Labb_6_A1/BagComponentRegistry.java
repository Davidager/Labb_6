package Labb_6_A1;

import java.util.Hashtable;

/**
 * Created by David on 14-Dec-16.
 */
public class BagComponentRegistry {
    private Hashtable<String, BagComponent> map = new Hashtable<>();

    public BagComponentRegistry() {
        setupRegistry();
    }

    public BagComponent createBagComponent(String type) {
        return map.get(type).clone();
    }

    public BagComponent getReferenceComponent(String type) {
        return map.get(type);
    }

    private void setupRegistry(){
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

        map.put("resväska", resvaska);
        map.put("neccessär", neccessar);
        map.put("linsburk", linsburk);
        map.put("datorväska", datorvaska);
        map.put("påse", pase);
        map.put("schampoflaska", schampoflaska);
        map.put("linser", linser);
        map.put("skjorta", skjorta);
        map.put("dator", dator);
        map.put("bowlingklot", bowlingklot);
        map.put("penna", penna);
        map.put("suddigum", suddigum);

    }

}

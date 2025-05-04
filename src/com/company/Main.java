package com.company;

import java.io.File;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public class Varos{
        public String orszag;
        public String rovid;
        public Integer orszglakossag;
        public String fovaros;
        public Integer fovaroslakossag;
        public Varos(String sor){
            String[] s = sor.split(";");
            orszag = s[0];
            rovid = s[1];
            orszglakossag = Integer.parseInt(s[2]);
            fovaros = s[3];
            fovaroslakossag = Integer.parseInt(s[4]);
        }
    }
    public ArrayList<Varos> orszag_varosok = new ArrayList();

    public Main(){
        //0.feladat
        betolt("fovaros.csv");
        System.out.printf("0) Összesen %d ország adata lett beolvasva.\n",orszag_varosok.size());
        //1.feladat

        ArrayList<Integer> legnagyobbak = new ArrayList<Integer>();
        ArrayList<Varos> Budapest = new ArrayList<Varos>();
        for (Varos x:orszag_varosok
             ) {
                legnagyobbak.add(x.orszglakossag);
                if(x.fovaros.equals("Budapest")){
                    Budapest.add(x);
            }
        }
        Collections.sort(legnagyobbak);
        Collections.reverse(legnagyobbak);
        System.out.println(legnagyobbak.get(0));
        int bps = 0;
        for (Varos x:orszag_varosok
             ) {
            if(legnagyobbak.get(0) == x.orszglakossag){
                System.out.println("1) Az ország, ahol a legtöbben élnek:"+x.orszag+","+x.orszglakossag+" fő");
            }
            if(x.fovaroslakossag<Budapest.get(0).fovaroslakossag){
                bps++;
            }
        }
        for (Varos x:orszag_varosok
        ) {
            if (legnagyobbak.get(1) == x.orszglakossag) {
                System.out.println("\n\tA második legnagyobb népesség:" + x.orszag + "," + x.orszglakossag + " fő");
            }
        }
        //2.feladat
        System.out.printf("\n 2) Összesen %d fővárosban élnek kevesebben, mint Budapesten!",bps);
        //3.feladat
        ArrayList<String> Countrys = new ArrayList<String>();
        for (Varos x :orszag_varosok
             ) {
            if(x.rovid.contains("C")){
                Countrys.add(x.rovid);
            }
        }
        System.out.println("\n3) Országjel, amiben szerepel 'C' betű:"+Countrys);
        //4.feladat
        int ossz = 0;
        for (Varos x:orszag_varosok
             ) {
            if(x.orszglakossag<20000000){
                ossz+=x.fovaroslakossag;
            }
        }
        System.out.println("4) A 20 millió főnél kisebb országok fővárosainak össznépessége:"+ossz+" Fő");
        //5.feladat
        TreeMap<Integer, Integer> stat = new TreeMap();
        for (Varos orszag : orszag_varosok) {
            int kat = orszag.fovaroslakossag / 5000000;
            if (!stat.containsKey(kat)) stat.put(kat, 1);
            else stat.put(kat, stat.get(kat)+1);
        }
        System.out.printf("5) Fővárosok népesség szerint csoportosítva (5 millió fő):\n");
        for (Integer kat : stat.keySet()) {
            System.out.printf("   %,10d - %,10d: %d\n", kat*5000000, (kat+1)*5000000-1, stat.get(kat));
        }
        // 6. feladat
        PrintWriter ki = null;
        try {
            ki = new PrintWriter(new File("nagyok.txt"), "utf-8");
            for (Varos orszag : orszag_varosok) if (orszag.orszglakossag > 200000000) ki.printf("%s (%d millió)\r\n", orszag.orszag,
                    orszag.orszglakossag/1000000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ki != null) ki.close();
        }
        System.out.printf("6) Nagy népességű országok a nagyok.txt fájlban!\n");
    }



    public void betolt(String fajl){
        Scanner be = null;
        try {
            be = new Scanner(new File(fajl),"utf-8");
            be.nextLine();
            while (be.hasNextLine()){
                orszag_varosok.add(new Varos(be.nextLine()));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(be!=null) be.close();
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}

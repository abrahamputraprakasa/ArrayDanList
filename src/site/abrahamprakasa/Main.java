package site.abrahamprakasa;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //deklarasi (declaration)
        int[] angka;

        //instantiation
        angka = new int[5];

        //inisialisasi (initialize)
        angka[0] = 1;
        angka[1] = 2;
        angka[2] = 3;
        angka[3] = 4;
        angka[4] = 5;


        //declaration + instantiation and initialization
        int[] angka2 = {30, 5, 70, 2, 100, 2, 99, 103, 40};
        int[] angka3 = {30, 5, 70, 1, 100, 2, 99, 103, 40};
//        Arrays.sort(angka2);
//        for (int i : angka2) {
//            System.out.println(i);
//        }

//        int hasil = Arrays.compare(angka2, angka3);
//        System.out.println("hasil compare: " + hasil);

        int[] angka4 = new int[10];
        angka4[0] = 2;
        Arrays.fill(angka4, 5);

//        for (int i : angka4) {
//            System.out.println(i);
//        }


        Baju[] arrayBaju = new Baju[3];

        arrayBaju[0] = new Baju();
        arrayBaju[1] = new Baju();
        arrayBaju[2] = new Baju();
        arrayBaju[0].setWarna("Hitam");
        arrayBaju[1].setWarna("Putih");
        arrayBaju[2].setWarna("Merah");
        arrayBaju[0].setUkuran('L');
        arrayBaju[1].setUkuran('S');
        arrayBaju[2].setUkuran('M');

//        for (Baju baju : arrayBaju) {
//            System.out.println(baju.getUkuran() + " " + baju.getWarna());
//        }


        List<Integer> listAngka = new ArrayList<>();
        listAngka.add(99);
        listAngka.add(3);
        listAngka.add(10);
        listAngka.add(1);
        listAngka.add(4);
        listAngka.add(100);
        listAngka.remove(2);

        //sorting ascending
//        Collections.sort(listAngka);

        //sorting descending
        Collections.sort(listAngka, Collections.reverseOrder());

//        for (Integer i : listAngka) {
//            System.out.println(i);
//        }

//        Iterator<Integer> it = listAngka.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        System.out.println("memiliki nilai 1: " + listAngka.contains(1));
//
//        System.out.println("nilai 100 ada pada index: " + listAngka.indexOf(100));


        Baju bajuA = new Baju();
        Baju bajuB = new Baju();
        Baju bajuC = new Baju();
        bajuA.setWarna("Hitam");
        bajuB.setWarna("Putih");
        bajuC.setWarna("Merah");
        bajuA.setUkuran('L');
        bajuB.setUkuran('S');
        bajuC.setUkuran('M');

        List<Baju> listBaju = new ArrayList<>();
        listBaju.add(bajuA);
        listBaju.add(bajuB);
        listBaju.add(bajuC);

        int index = 0;
        for (Baju b : listBaju) {
            if (b.getWarna().equals("Putih") && b.getUkuran() == 'S'){
                System.out.println("Baju S warna Putih ada di index ke " + index);
            }
            index++;
        }

//        System.out.println("Baju L Hitam ada di index ke : " + listBaju.indexOf(bajuA));

    }
}

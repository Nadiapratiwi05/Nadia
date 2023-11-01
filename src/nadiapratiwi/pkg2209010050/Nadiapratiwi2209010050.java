
package nadiapratiwi.pkg2209010050;

import java.util.Scanner;


public class Nadiapratiwi2209010050 {


    public static void main(String[] args) {
       int angka1;
        int angka2;
        int hasil;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil = " + hasil);

         System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil = " + hasil);


        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // Pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil = " + hasil);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // Sisa Bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil = " + hasil);
        
        // OPERATOR PEMBANDING
        
        float nilaiA = 12;
        float nilaiB = 4;
        boolean hasil2;

        // apakah A lebih besar dari B?
        hasil2 = nilaiA > nilaiB;
        System.out.println(hasil2);

        // apakah A lebih kecil dari B?
        hasil2 = nilaiA < nilaiB;
        System.out.println(hasil2);

        // apakah A lebih besar samadengan B?
        hasil2 = nilaiA >= nilaiB;
        System.out.println(hasil2);

        // apakah A lebih kecil samadengan B?
        hasil2 = nilaiA <= nilaiB;
        System.out.println(hasil2);

        // apakah nilai A sama dengan B?
        hasil2 = nilaiA == nilaiB;
        System.out.println(hasil2);

        // apakah nilai A tidak samadengan B?
        hasil2 = nilaiA != nilaiB;
        System.out.println(hasil2);

        
        // OPERATOR BITWISE
        int a = 60;    /* 60 = 0011 1100 */
        int b = 13;    /* 13 = 0000 1101 */
        int c = 0;

        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 215 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;     /* 215 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);

    }
    
}

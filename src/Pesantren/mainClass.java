package Pesantren;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        int tahun;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan tahun : "); tahun = input.nextInt();
        
        if (tahun % 400 == 0) {
            System.out.println("Tahun " + tahun + " Merupakan tahun kabisat");
        } else {
            System.out.println("Tahun " + tahun + " Merupakan bukan tahun kabisat");
        }
    }
}

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {

        //girilen 3 sayıyı büyükten küçüğe sıralayınız

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz: ");
        a = input.nextInt();

        System.out.print("2.Sayıyı Giriniz: ");
        b = input.nextInt();

        System.out.print("3.Sayıyı Giriniz: ");
        c = input.nextInt();

        if (a > b && a > c) {
            System.out.println("A en büyük sayıdır.");
        } else {
            if (b > a && b > c) {
                System.out.println("B en büyük sayıdır.");
            } else {
                System.out.println("C en büyük sayıdır.");
            }
        }

        System.out.println("----Diğer yazımı-----");

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        }else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println(" b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        }else if ((c > a) && (c > b)) {
            if (a > b) {
                System.out.println("c > a > b");
            } else {
                System.out.println("c > b > a");
            }
        }
        System.out.println("---------------------------------");


        //girilen 3 sayıyı küçükten büyüğe sıralayınız

        int k, l, m;

        System.out.print("1.Sayıyı Giriniz: ");
        k = input.nextInt();

        System.out.print("2.Sayıyı Giriniz: ");
        l = input.nextInt();

        System.out.print("3.Sayıyı Giriniz: ");
        m = input.nextInt();

        if ((k < l) && (k < m)) {
            System.out.println("K en küçük sayıdır.");
        } else {
            if ((l < k) && (l < m)) {
                System.out.println("L en küçük sayıdır.");
            } else {
                System.out.println("M en küçük sayıdır.");
            }
        }

        System.out.println("-----DİĞER YAZIMI-----");

        if ((k < l) && (k < m)) {
            if (l < m) {
                System.out.println("k < l < m");
            } else {
                System.out.println("k < m < l");
            }
        }else if ((l < k) && (l < m)) {
            if (k < m) {
                System.out.println("l < k < m");
            } else {
                System.out.println("l < m < k");
            }
        }else if ((m < k) && (m < l)) {
            if (k < l) {
                System.out.println("m < k < l");
            } else {
                System.out.println("m < l < k");
            }
        }
    }
}

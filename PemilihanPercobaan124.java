import java.util.Scanner;

public class PemilihanPercobaan124 {

    public static void main(String[] args) {

        Scanner input24 = new Scanner(System.in);

        System.out.println("masukan angka: ");
        int angka = input24.nextInt();
        String hasil;
        hasil = (angka%2 == 0)? "bilangan genap" : "bilangan ganjil";
        System.out.println("angka "+ angka +" "+ hasil);
        }       
}

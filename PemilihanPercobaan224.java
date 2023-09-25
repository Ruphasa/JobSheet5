import java.util.Scanner;

public class PemilihanPercobaan224 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.println("Nilai UAS   : ");
        float UAS = input24.nextFloat();
        System.out.println("Nilai UTS   : ");
        float UTS = input24.nextFloat();
        System.out.println("Nilai Quis  : ");
        float Quis = input24.nextFloat();
        System.out.println("Nilai Tugas : ");
        float Tugas = input24.nextFloat();
        float total = (UAS*0.4F)+(UTS*0.3F)+(Quis*0.2F)+(Tugas*0.1F);
        String message = total < 65 ? "Remidi":"Tidak remidi";
        System.out.println("Nilai Akhir = "+total+" Sehingga "+message);
    }
}
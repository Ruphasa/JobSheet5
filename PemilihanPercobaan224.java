import java.util.Scanner;

public class PemilihanPercobaan224 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        String nilaiHuruf;
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
        if (total <= 39) {
            nilaiHuruf = "E";
            System.out.println("Kamu berada di grade "+nilaiHuruf);
        }else if(total <= 50){
            nilaiHuruf = "D";
            System.out.println("Kamu berada di grade "+nilaiHuruf);
        }else if(total<=60){
            nilaiHuruf = "C";
            System.out.println("Kamu berada di grade "+nilaiHuruf);
        }else if(total<=65){
            nilaiHuruf = "C+";
            System.out.println("Kamu berada di grade "+nilaiHuruf);
        }else if(total<=73){
            nilaiHuruf = "B";
            System.out.println("Kamu berada di grade "+nilaiHuruf);
        }else if(total<=80){
            nilaiHuruf = "B+";
            System.out.println("Kamu berada di grade "+nilaiHuruf);
        }else if(total<=100){
            nilaiHuruf = "A";
            System.out.println("Kamu berada di grade "+nilaiHuruf);
        }
    }
}
import java.util.Scanner;
public class PemilihanPercobaan324 {
    public static void main(String[] args) {
        double angka1, angka2, hasil;
        char operator;
        
        Scanner input24 = new Scanner(System.in);

        System.out.println("Masukan angka pertama: ");
        angka1 = input24.nextDouble();
        System.out.println("Masukan angka kedua: ");
        angka2 = input24.nextDouble();
        System.out.println("masukan operator(+ - * /):");
        operator = input24.next().charAt(0);

        switch(operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1+" + "+angka2+" = "+hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1+" - "+angka2+" = "+hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1+" * "+angka2+" = "+hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1+" / "+angka2+" = "+hasil);
                break;
        }
    }
}

package Latihan3;
import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berat Badan (kg) : ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Tinggi Badan (m) : ");
        double tinggiBadan = input.nextDouble();

        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        String kriteria;
        if (imt <= 18.4) {
            kriteria = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kriteria = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kriteria = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        System.out.printf("Nilai IMT : %.2f%n", imt);
        System.out.println("Kriteria : " + kriteria);

        input.close();
    }
}
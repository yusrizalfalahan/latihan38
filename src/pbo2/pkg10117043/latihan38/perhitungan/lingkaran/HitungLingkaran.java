/*
 * NAMA       : YUSRIZAL FALAHAN
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi program menghitung lingkaran
 */
package pbo2.pkg10117043.latihan38.perhitungan.lingkaran;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HitungLingkaran {

    double PHI = 3.14159265358979323846;
    double nKeliling, nDiameter, nJarijari, nLuas;

    public void Hitung(double parDiameter, double parKeliling, double parJari, double parLuas) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Masukan nilai diameter lingkaran : ");           
            try {
                parDiameter = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Nilai diameter tidak sesuai");
            }
        } while (parDiameter == 0);
        
        parJari = parDiameter / 2;
        parLuas = (float) (PHI * (parJari * parJari));
        parKeliling = (PHI * parDiameter);
        
        DecimalFormat DF = new DecimalFormat("#.##");
        System.out.printf("Jari-jari Lingkaran \t= %s%n", DF.format(parJari));
        System.out.printf("Luas Lingkaran \t\t= %s%n", DF.format(parLuas));
        System.out.printf("Keliling Lingkaran \t= %s%n", DF.format(parKeliling));
    }
}

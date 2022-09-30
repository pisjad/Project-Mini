import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        float angkaSatu, angkaDua, hasilOperasi;
        int pilihanOperasi;
        Scanner input = new Scanner(System.in);

        System.out.println("==================== Kalkulator Sederhana =====================");
        System.out.print("Masukkan angka pertama = ");
        angkaSatu = input.nextFloat();
        System.out.println("Pilihan operasi bilangan");
        System.out.println("1. Tambah [+]");
        System.out.println("2. Kurang [-]");
        System.out.println("3. Kali [X]");
        System.out.println("4. Bagi [:]");
        System.out.print("Pilih operasi [1/2/3/4] = ");
        pilihanOperasi = input.nextInt();
        System.out.println("Masukkan angka kedua = ");
        angkaDua = input.nextFloat();

        System.out.println("");
        System.out.println("======================== Hasil Operasi ========================");

        if (pilihanOperasi == 1) {
            System.out.printf("Hasil dari %.2f + %.2f = ", angkaSatu, angkaDua);
            System.out.print(angkaSatu + angkaDua);
        } else if (pilihanOperasi == 2) {
            System.out.printf("Hasil dari %.2f - %.2f = ", angkaSatu, angkaDua);
            System.out.print(angkaSatu - angkaDua);
        } else if (pilihanOperasi == 3) {
            System.out.printf("Hasil dari %.2f X %.2f = ", angkaSatu, angkaDua);
            System.out.print(angkaSatu * angkaDua);
        } else if (pilihanOperasi == 4) {
            System.out.printf("Hasil dari %.2f : %.2f = ", angkaSatu, angkaDua);
            System.out.print(angkaSatu / angkaDua);
        }

    }
}
import java.util.Scanner;

public class SIAKAD17 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama;
        byte NIM;
        


        String Nama = "Siti Aisyah";
        boolean Sudah = true;
        char jenisKelamin = 'P';
        byte UmurSaya = 18;
        double $beratbadan= 48, tinggibadan = 1.55;
        System.out.println("Nama saya adalah " + Nama);
        System.out.println("Apakah sudah mengerjakan tugas?" + Sudah);
        System.out.println("Saya adalah seorang:" + jenisKelamin);
        System.out.println("Umur saya saat ini:" + UmurSaya);
        System.out.println(String.format("Berat badan saya adalah %s kg, dengan tinggi badan saya adalah %s", $beratbadan, tinggibadan));

    }
}

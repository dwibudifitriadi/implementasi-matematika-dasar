package matematikatapikode.aritmatika;
import matematikatapikode.hanyaGaris.garis;
import matematikatapikode.helper.helper;
public class persen {
    static private garis garis = new garis();
    public void mulai(){
        garis.garis();
        helper.promptMateri("Persen", persen::materipersen);
        helper.promptMateri("Mencari Nilai Asli", persen::mencariNilaiAsli);
        helper.promptMateri("Mencari Persen", persen::mencariPersen);
    }

    private static void materipersen(){
        garis.garis();
        System.out.println("# Persen");
        System.out.println("""
            Cara menghitung diskon :
            nilai_diskon = harga / 100 x persen
            Jadi kalo kita mau menghitung 20% dari 100.000 kita bisa tulis :
            
            nilai_diskon = 100.000 / 100 x 20% = 20.000
            
            Karena dibagi 100, jadi kita bisa kurangi dua nol dari 100.000 jadi 1.000 dan dikalikan 20 jadi 20.000.
            Kalo diubah ke kodingan, kita bisa tulis seperti ini :
            
            int harga = 100000;
            int diskon = 20;
            int nilai_diskon = (harga/100)*diskon; 
            
            """);
        int harga = 100000;
        int diskon = 20;
        int nilai_diskon = (harga/100)*diskon; 
        System.out.println("Hasilnya adalah "+nilai_diskon);
    }
    private static void mencariNilaiAsli(){
        garis.garis();
        System.out.println("# Mencari Nilai Asli");
        System.out.println("""
                Kalo sebelumnya kita menghitung persen dari nilai asli, sekarang kita akan mencari nilai asli dari diskon tersebut. Caranya tinggal dibalik aja rumus yang tadi jadi seperti ini :
                
                nilai = nilai_diskon / diskon x 100
                
                Misalnya kita punya nilai diskon sebesar 20.000 dan kita mau cari nilai aslinya, kita bisa tulis :
                
                nilai = 20.000 / 20% x 100 = 100.0000
                
                Kalo diubah ke kodingan, kita bisa tulis seperti ini :
                
                int nilai_diskon = 20000;
                int diskon = 20;
                int harga = (nilai_diskon/diskon)*100;""");
        int nilai_diskon = 20000;
        int diskon = 20;
        int harga = (nilai_diskon/diskon)*100;
        System.out.println("Hasilnya adalah :"+harga);
    }
    private static void mencariPersen(){
        System.out.println("# Mencari Persen");
        System.out.println("""
                Kalo sebelumnya kita menghitung persen dari nilai asli, sekarang kita akan mencari nilai diskon dari nilai tersebut. Rumusnya kita ubah jadi:
                
                persen = nilai_diskon / nilai x 100

                Misalnya kita punya nilai asli sebesar 100000 dan nilai diskon 20000 lalu kita mau cari persennya, kita bisa tulis seperti ini :

                persen = 20000 / 100000 x 100 = 20%

                Kalo diubah ke kodingan, kita bisa tulis seperti ini :
                int harga = 100000;
                int nilai_diskon = 20000;
                int persen = (nilai_diskon/harga)*100;
                """);
                int harga = 100000;
                int nilai_diskon = 20000;
                int persentase = (nilai_diskon/harga)*100;
                System.out.println("Hasilnya adalah "+persentase);
        
    }
}

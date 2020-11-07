package if1.pkg10119030.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;

/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program : Program Pebandingan Dua Buah Nilai.
*/
public class PerbandinganDuaBuahNilai {
    static final Scanner scan = new Scanner(System.in);
    int nilai1, nilai2;
    
    private void masukkanNilai(){
    System.out.print("====Program Perbandingan Nilai====\n");
    System.out.print("Masukkan Nilai Pertama : ");
    nilai1 = scan.nextInt();
    System.out.print("Masukkan Nilai Kedua : ");
    nilai2 = scan.nextInt();
    }
    
    private String perbandinganNilai(){
        return (nilai1 > nilai2) ? nilai1+" Lebih besar dari "+nilai2 :
            (nilai1 < nilai2) ? nilai1+" Lebih kecil dari "+nilai2 :
                nilai1+" sama dengan "+nilai2;
    }
    
    private void ulangPerbandingan(){
        System.out.print("\n Ulangi Aktifitas ? (Ya/Tidak) : ");
        if(scan.next().equals("Ya")){
            System.out.print("\n");
            startMethod();
        }
    }
    private void tampilPerbandingan(String hasil){
        System.out.println("\n Hasil : "+hasil);
    }
    
    private void startMethod(){
        masukkanNilai();
        tampilPerbandingan(perbandinganNilai());
        ulangPerbandingan();
    }
public static void main(String[] args){
        PerbandinganDuaBuahNilai data = new PerbandinganDuaBuahNilai();
        data.startMethod();
        System.out.println("(Developed by : Rendy Dermawan)");
    }
}


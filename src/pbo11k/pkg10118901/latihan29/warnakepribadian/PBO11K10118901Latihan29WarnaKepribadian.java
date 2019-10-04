/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan29.warnakepribadian;
import java.util.*;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Program untuk mengetahui kepribadian dengan warna kesukaan
 */
public class PBO11K10118901Latihan29WarnaKepribadian {
    public static final String NORMAL = "\u001b[0m";
    public static final String MERAH = "\u001b[31m";
    public static final String HIJAU = "\u001b[32m";
    public static final String KUNING = "\u001b[33m";
    public static final String BIRU = "\u001b[34m";
    public static final String UNGU = "\u001b[35m";
    public static final String BIRUMUDA = "\u001B[36m";
    public static final String PUTIH = "\u001B[37m";
    public static final String BG_HITAM = "\u001B[40m";
    public static final String BG_MERAH = "\u001B[41m";
    public static final String BG_HIJAU = "\u001B[42m";
    public static final String BG_KUNING = "\u001B[43m";
    public static final String BG_BIRU = "\u001B[44m";
    public static final String BG_BIRUMUDA = "\u001B[46m";
    public static final String BG_UNGU = "\u001B[45m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static Scanner input = new Scanner(System.in);
    public static void tc(String warna,String teks) {
        System.out.print(warna+teks+ NORMAL);
    }
    public static void tcln(String warna,String teks) {
        System.out.println(warna+teks+ NORMAL);
    }
    public static void bgtcln(String warna,String teks, String bg) {
        System.out.println(bg+warna+"\t"+teks+"\t\t"+NORMAL);
    }
    public static void merah(){
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani mengambil keputusan,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah ditahap puncak toleransi, kemarahannya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangatan dan cinta");
    }
    public static void hijau(){
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjungjung tinggi suatu nilai toleransi dan kepercayaan");
    }
    public static void kuning(){
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyak dan tidak stabil,");
        System.out.println("10. Cenderung penakut");
    }
    public static void biru(){
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang orang,");
        System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai");
    }
    public static void ungu(){
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu,");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius, sebab seringkali menutupi perasaanya,");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh");
    }
    public static void display(String d){
        System.out.print("Warna Favoritmu adalah ");;
        
        switch(d) {
            case "MERAH" :
                tcln(MERAH,d);
                merah();
                break;
            case "HIJAU" : 
                tcln(HIJAU,d);hijau();break;
            case "KUNING" :
                tcln(KUNING,d);kuning();break;
            case "BIRU" : tcln(KUNING,d);kuning();break;
            case "UNGU" : tcln(UNGU,d);ungu();break;
        }
//        String hasil = d.toLowerCase();
//        if (hasil.equals("merah"))
//            merah();
//        else if (hasil.equals("hijau"))
//            hijau();
//        else if (hasil.equals("kuning"))
//            kuning();
//        else if (hasil.equals("biru"))
//            biru();
//        else if (hasil.equals("ungu"))
//            ungu();
    }
    public static void main(String[] args) {
        String pilih,nama;
        tc(MERAH,"YUK");
        tc(HIJAU," CEK");
        tc(KUNING," KEPRIBADIANMU");
        tc(BIRUMUDA," DARI");
        tc(UNGU," WARNA");
        tcln(BIRU," FAVORITMU");
        System.out.println("");
        bgtcln(PUTIH,"MERAH",BG_MERAH);
        bgtcln(PUTIH,"HIJAU",BG_HIJAU);
        bgtcln(PUTIH,"KUNING",BG_KUNING);
        bgtcln(PUTIH,"BIRU",BG_BIRU);
        bgtcln(PUTIH,"UNGU",BG_UNGU);
        System.out.println("");
        System.out.print("PILIH WARNA FAVORITMU : ");
        pilih = input.next().toUpperCase();
        System.out.print("NAMA KAMU : ");
        nama = input.next().toUpperCase();
        System.out.println("");
        if ((pilih.equals("MERAH")) || (pilih.equals("HIJAU")) || (pilih.equals("KUNING")) || (pilih.equals("BIRU")) || (pilih.equals("UNGU"))) {
            System.out.println("======HASIL TEST KEPRIBADIAN "+nama+"=====");
            display(pilih);
        } else {
            System.out.println("======HASIL TEST KEPRIBADIAN "+nama+"=====");
            System.out.println("Oops.. Belum teridentifikasi");
        }
        
    }
    
}

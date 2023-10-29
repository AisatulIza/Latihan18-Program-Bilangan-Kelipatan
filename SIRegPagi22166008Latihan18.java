package pkgLatihan18;
/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Deskripsi : Program ini adalah program yang menampilkan bilangan kelipatan 3,5 yang dimulai dari 3,5 sampai 35 menggunakan perulangan for
*/
public class SIRegPagi22166008Latihan18 {
  public static void main(String[] args) {
    System.out.println("====Bilangan kelipatan====");
    //variabel
    double i;
    //Struktur perulangan for 
    for (i = 3.5; i <= 35.0; i += 3.5) 
    if (i % 3.5==0)
    //output bilangan kelipatan
    System.out.println(i);
  }
}

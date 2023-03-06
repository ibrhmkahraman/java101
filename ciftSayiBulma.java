import java.util.Scanner;

public class ciftSayiBulma {
    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
         int i,k,toplam = 0,sayac = 0;
         double ortalama;
         System.out.println("sayı giriniz : ");
         k = inp.nextInt();
         //if(k >= 12) gibi bir kural eklenmedi sebebi 0 da 3 ve 4 e yani 12 ye tam bölünebilir ve sonucu 0 dır
         for (i = 0; i <= k; i++) {
             //bir sayı 3 ve 4 de aynı anda kalansız bölünüyorsa 12 ye tam bölünebilir matematikte EKOK kuralı
             //EKOK a*b şeklinde bulunamaz 4 ile 6 nın da EKOK u 12 dir
             if (i % 12 == 0) {
                 toplam += i;
                 sayac++;
                 System.out.print( i + ", ");
             }
         }
         ortalama = toplam / sayac;
         System.out.println("\nortalaması " + ortalama);
    }
}

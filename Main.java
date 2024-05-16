import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        /*


        Döngülerde Kullanılan İki Anahtar Kelime.  ( Break ve Continue )


        *****  Break key word
        Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesi ile karşışatığı zaman çalışmasını durdurur.
        Böylelikle döngü hiç bir koşula bağlı kalmadan sonlanmış olur.

        break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa ve içteki döngüde break kullanılmışsa
        yalnızda içerdeki döngü sonlanır.


       ******* Continue Key Word

        Döngü herhangi bir yerde ve harhangi bir zamanda break ifadesiyle karşılaştığı zaman geri kalan işlemleri yapmadan direk
        döngü bloğunun başına döner.
         */



        int i = 0 ;

        while ( i<20) {

            if (i ==10) {   // i =10 oldugunda döngü duracak devam etmeyecek.
                break;


            }

            System.out.println("İ=" + i );
            i++;
        }

         // Asagıda Baska Bir Örnek ve break kullanım seklini görelim;




        // Kullanıcan Bir Sayı,/İslem Alalım. -1 olmadıgı sürece döngü hep devam etsin.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz..:");

        while (true) {

            int islem = scanner.nextInt();
            if (islem == -1) {

                System.out.println("Döngüden Çıkılıyor..");
                break;
            }
            System.out.println("İşlem..:" + islem);
        }



        // Continue Key Word........... *************

        for ( int a = 0 ; a <10 ; a++) {

            if ( a == 3 || a ==5) {
                continue;           // a 3 veya 5 oldugunda döngüyü durdur. 3 ve 5 i yazdırma , diğerleri yazdırıp devam edecek.
            }

            System.out.println("a = " + a );
        }

        //Continue 2.Örnek  While loop u ile

        int x =0;
        while ( x <10) {

            if ( x==3  || x==5) {
                x++;                     // x i arttırma islemini yapmazsak, sonsuz döngü olur.
                continue;
            }
            System.out.println("x= " + x);
            x++;
        }


    }
}

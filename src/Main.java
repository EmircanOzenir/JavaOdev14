import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double perKM=0.10, normalTutar, yasIndirimi, yasIndirimliTutar, gidisDonusTutari, gidisDonusOrani=0.8;
        Scanner input = new Scanner(System.in);
        System.out.print("Gideceginiz Mesafeyi KM Cinsinden Giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Lutfen Yasinizi Giriniz: ");
        yas = input.nextInt();
        System.out.print("1- Tek Yon\n2- Gidis Donus\nYolculuk Tipinizi Seciniz: ");
        yolculukTipi = input.nextInt();
        if(yas<12) {
            yasIndirimi=0.5;
        } else if (yas<24) {
            yasIndirimi=0.9;
        } else if (yas>65) {
            yasIndirimi=0.7;
        } else {
            yasIndirimi = 1;
        }
        normalTutar = (mesafe*perKM);
        yasIndirimliTutar = (normalTutar*yasIndirimi);

        if(!((mesafe>0) && (yas>0) && ((yolculukTipi==1) || (yolculukTipi==2)))) {
            System.out.print("Hatali Veri Girdiniz!");
        } else if (yolculukTipi==1) {
            gidisDonusTutari=yasIndirimliTutar;
            System.out.print("Toplam Tutar: " + gidisDonusTutari);
            System.out.print(" TL");
        } else if (yolculukTipi==2) {
            gidisDonusTutari=((yasIndirimliTutar*gidisDonusOrani)*2);
            System.out.print("Toplam Tutar: " + gidisDonusTutari);
            System.out.print(" TL");
        }
    }
}

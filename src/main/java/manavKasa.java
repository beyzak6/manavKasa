import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armutFiyat = 2.14 ;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.println("Armut kaç kilo : ");
        double armut = scanner.nextDouble();

        System.out.println("Elma kaç kilo : ");
        double elma = scanner.nextDouble();

        System.out.println("Domates kaç kilo : ");
        double domates = scanner.nextDouble();

        System.out.println("Muz kaç kilo : ");
        double muz = scanner.nextDouble();

        System.out.println("Patlıcan kaç kilo : ");
        double patlican = scanner.nextDouble();

        double toplamTutar = (armut*armutFiyat) + (elma*elmaFiyat) + (domates*domatesFiyat) + (muz*muzFiyat) + (patlican*patlicanFiyat);

        System.out.println("Toplam tutar : " + toplamTutar + "TL");

        scanner.close();


    }
}

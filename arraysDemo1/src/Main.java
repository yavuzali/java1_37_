public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Ali";
        String ogrenci2 = "Yasin";
        String ogrenci3 = "Akif";
        String ogrenci4 = "Nisa";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------------------------");

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Ali";
        ogrenciler[1] = "Yasin";
        ogrenciler[2] = "Akif";
        ogrenciler[3]="Nisa";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("---------------------");

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
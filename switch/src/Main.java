public class Main {
    public static void main(String[] args) {
        char grade = 'L';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel: Gectiniz.");
                break;

            case 'B':
                System.out.println("Cok Güzel :Gectiniz.");
                break;

            case 'C':
            case 'D':
                System.out.println("Iyi : Gectiniz.");
                break;


            case 'F':
                System.out.println("Malesef kaldin MALL");
                break;

            default:
                System.out.println("Maalesef Gecersiz bir not girdiniz");
        }
    }
}
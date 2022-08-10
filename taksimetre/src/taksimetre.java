import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acilis = 10;
        int dusuk = 20;

        System.out.println("Gidilen KM giriniz:");
        double km = input.nextDouble();

        double ucret = acilis+(km*2.2);

        double result = (ucret <= 20) ? (dusuk):(ucret);

        System.out.println("Borcunuz:" + result);
    }
}

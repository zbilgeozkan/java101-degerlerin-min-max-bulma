import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lim, min, max, num;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        lim = input.nextInt();

        System.out.print("Lütfen 1. sayıyı giriniz: ");
        num = input.nextInt();
        min = num;
        max = num;

        for (int i = 2; i <= lim; i++) {
            System.out.print("Lütfen " + i + ". sayıyı giriniz: ");
            num = input.nextInt();

            if (num < min) {
                min = num;
            }
            else if (num > max) {
                max = num;
            }

        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);

    }
}
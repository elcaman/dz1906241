import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int oneBonusMile = 20;
        int ticketCost, accruedMiles;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите стоимость билета: ");
        ticketCost = input.nextInt();

        accruedMiles = ticketCost / oneBonusMile;

        System.out.println("Количество бонусных миль за ваш билет: " + accruedMiles);
    }
}
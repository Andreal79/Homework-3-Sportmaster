import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int purchaseAmount = 150_001;
        int amountPerPurchase;
        int divider = 1_000;
        int border = 15_000;
        System.out.print("Введите сумму Вашей покупки в рублях: ");
        amountPerPurchase = input.nextInt();
        System.out.println("Сумма Вашей покупки: " + amountPerPurchase + " рублей");

        int bonuses;
        if (purchaseAmount <= border) {
            bonuses = (amountPerPurchase / divider) * 50;
            System.out.println("Сумма начисленных бонусов составит: " + bonuses);
        }
        else if (purchaseAmount > border && purchaseAmount <= 150_000) {
            bonuses = (amountPerPurchase / divider) * 70;
            System.out.println("Сумма начисленных бонусов составит: " + bonuses);
        }
        else {
            bonuses = (amountPerPurchase / divider) * 100;
            System.out.println("Сумма начисленных бонусов составит: " + bonuses);
        }

    }
}


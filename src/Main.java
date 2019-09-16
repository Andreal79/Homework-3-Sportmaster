import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int purchaseAmount = 150_001;
        int amountPerPurchase;
        int bonuses;
        int deliteli = 1_000;
        int border = 15_000;
        System.out.print("Введите сумму Вашей покупки в рублях: ");
        amountPerPurchase = input.nextInt();
        System.out.println("Сумма Вашей покупки: " + amountPerPurchase + " рублей");

        if (purchaseAmount <= border) {
            bonuses = (amountPerPurchase / deliteli) * 50;
            System.out.println("Сумма начисленных бонусов составит: " + bonuses);
        }
        else if (purchaseAmount > border && purchaseAmount <= 150_000) {
            bonuses = (amountPerPurchase / deliteli) * 70;
            System.out.println("Сумма начисленных бонусов составит: " + bonuses);
        }
        else {
            bonuses = (amountPerPurchase / deliteli) * 100;
            System.out.println("Сумма начисленных бонусов составит: " + bonuses);
        }

    }
}


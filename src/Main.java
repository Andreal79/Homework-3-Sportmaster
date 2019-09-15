public class Main {
    public static void main(String[] args) {
        int purchaseAmount = 16_500; // сумма всех покупок
        int amountPerPurchase = 1_900; // сумма одной покупки
        int bonuses; // объявляем переменную начисленных бонусов
        int deliteli = 1_000;
        int border = 15_000;
        if (purchaseAmount <= border) {
            bonuses = (amountPerPurchase / deliteli) * 50;
            System.out.println(bonuses);
        }
        else if (purchaseAmount > border && purchaseAmount <= 150_000) {
            bonuses = (amountPerPurchase / deliteli) * 70;
            System.out.println(bonuses);
        }
        else {
            bonuses = (amountPerPurchase / deliteli) * 100;
            System.out.println(bonuses);
        }

    }
}


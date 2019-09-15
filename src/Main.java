import java.util.Scanner; // вызываем инструменты ввода с клавиатуры (эту вещь нашел нашел в интернете и применил в задаче)
public class Main {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);  //создаём инструмент пользовательского ввода с клавиатуры
        int purchaseAmount = 150_001; // создаем переменную - сумма всех покупок
        int amountPerPurchase; // объявляем переменную - сумма одной покупки
        int bonuses; // объявляем переменную  - начисленные бонусы
        int deliteli = 1_000;
        int border = 15_000;
        System.out.print("Введите сумму Вашей покупки в рублях: ");  //выводим на консоль сообщение о вводе
        amountPerPurchase = vvod.nextInt();  //вводим значение в созданную переменную
        System.out.println("Сумма Вашей покупки: " + amountPerPurchase + " рублей"); //выводим отформатированное сообщение
        // содержащее значение введённой переменной

// далее рассчитываем сумму начсиленных бонусов

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


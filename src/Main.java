public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для входных данных
        int initialBalance = 100; // начальная сумма на счету
        int topUpAmount = 1_100; // сумма пополнения

        // Пороговое значение для получения бонусов
        int bonusThreshold = 1_000;
        // Количество рублей для одного бонусного рубля
        int rublesPerBonus = 100;

        // Переменная для хранения количества бонусных рублей
        int bonus = 0;

        // Проверяем, превысила ли сумма пополнения пороговое значение
        if (topUpAmount > bonusThreshold) {
            // Рассчитываем количество бонусных рублей
            bonus = topUpAmount / rublesPerBonus;
        }

        // Рассчитываем итоговый счёт
        int finalBalance = initialBalance + topUpAmount + bonus;

        // Выводим результат на экран
        System.out.println("Итоговая сумма на счету клиента: " + finalBalance + " рублей.");
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
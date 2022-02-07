package JavaCore1.module1.sptint4.theme21.task2101.task02;

import java.util.HashMap;
import java.util.Map;

public class Practicum {
    // Создадим хеш-таблицу для хранения заказов.
    // В качестве ключа будет имя клиента.
    // В качестве значения — количество заказов от этого клиента.
    private Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Practicum pizzeria = new Practicum();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    // Начинаем принимать заказы! 🍕
    private void openPizzeria() {
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Рафаэль");
        newOrder("Леонардо");
        newOrder("Микеланджело");
        newOrder("Шреддер");
        newOrder("Донателло");
    }

    private void newOrder(String clientName) {
        // Сохраните новый заказ в хеш-таблицу. При обновлении счётчика заказов
        // не забудьте учесть заказы, которые уже были сделаны ранее.
        int count = orders.getOrDefault(clientName, 0);
        orders.put(clientName, ++count);
    }

    private void printStatistics() {
        // Выведите собранную статистику в консоль и посчитайте общее количество заказов.
        //
        // Формат для вывода данных в консоль:
        //     Заказов от Микеланджело: 15
        //     Заказов от Леонардо: 4
        //     Всего заказов: 19
        int sum = 0;
        for (Map.Entry<String, Integer> order : orders.entrySet()) {
            System.out.println("Заказов от " + order.getKey() + ": " + order.getValue());
            sum += order.getValue();
        }
        System.out.println("Всего заказов: " + sum);
    }
}
/*
Ваш лучший друг решил открыть свою пиццерию и доставлять пиццу на дом. Он хочет автоматизировать все процессы,
но для этого нужно собрать подробную аналитику по заказам. Давайте поможем ему в этом! Нужно найти самых активных
клиентов — тех, кто заказывает пиццу чаще всего.

Для того чтобы получить текущее количество заказов клиента, лучше всего подойдёт метод getOrDefault(Object key, V defaultValue).
Для добавления заказа используйте метод put(K key, V value).
Посчитать статистику проще всего в цикле, выполнив итерацию по всем записям. Для этого используйте метод entrySet().
 */

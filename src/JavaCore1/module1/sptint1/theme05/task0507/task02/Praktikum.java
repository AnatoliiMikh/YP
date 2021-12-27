package JavaCore1.module1.sptint1.theme05.task0507.task02;

public class Praktikum {
    public static void main(String[] args) {
        OrdersManager ordersManager = new OrdersManager();

        ordersManager.printAllOrders();
        System.out.println("Всего заказов на сумму: " + ordersManager.getOrdersSum());

        String maxOrderCustomerName = ordersManager.getMaxOrderCustomerName();
        System.out.println("Самая большая сумма заказов у " + maxOrderCustomerName);
        ordersManager.printCustomerOrders(maxOrderCustomerName);

        ordersManager.removeUnprofitableOrders();
    }
}
/*
В хеш-таблице customersOrders класса OrdersManager собрана информация о клиентах
зоомагазина (это ключи) и их заказах. Дополните код методов:

В printAllOrders() и getOrdersSum(), которые печатают список всех заказов и их возвращают
общую сумму, вызовите нужные методы HashMap.
В методе printCustomerOrders(String customerName) перед печатью заказов конкретного клиента
добавьте проверку наличия его имени в таблице. Это нужно, чтобы избежать ошибки ссылки на null.
Метод getMaxOrderCustomerName() должен возвращать имя клиента, который потратил в зоомагазине
больше всего. Переменные для хранения имени клиента и максимальной суммы заказов мы объявили
и инициализировали за вас. Числовое переменной присвоили 0, а строковой — пустую строку "".
Вам нужно дописать логику работы метода. Вы уже не раз искали максимум в массивах или списках.
Здесь получится очень похоже!
Метод removeUnprofitableOrders должен удалять из таблицы клиентов, сумма заказов которых
строго меньше 5000.

    Для получения ключей из таблицы вам понадобится метод keySet().
Для получения всех значений в таблице вам понадобится метод values().
Для проверки имени клиента воспользуйтесь методом containsKey(customerName).
Чтобы найти клиента с наибольшей суммой заказов, пройдите по всем клиентам и посчитайте
их суммы заказов — это можно сделать с помощью вложенных циклов for. Внутри второго цикла
сравнивайте суммы заказов и сохраняйте наибольшую и имя клиента. Так вы получите искомый результат.
Чтобы найти клиентов, , чьи заказы < 5000, , сначала с помощью короткой формы цикла for
пройдите по ключам таблицы: for(String name : orders.keySet()). Затем в цикле получите
сумму заказа клиента. Если она меньше 5000 — добавьте имя этого клиента в список.
С помощью ещё одного for пройдите по полученному списку с именами клиентов, чьи заказы
меньше 5000 for (String name : names), и через метод remove удалите их из таблицы.

 */
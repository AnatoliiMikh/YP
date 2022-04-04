package JavaCore2.module2.sprint6.theme7.task0702;

import java.time.LocalDate;
        import java.time.LocalTime;


class Practicum {
    public static void main(String[] args) {
        LocalDate secretDate = LocalDate.of(2020, 1, 10);
        LocalTime secretTime = LocalTime.of(12, 30);

        int result = decode(secretDate, secretTime);
        System.out.println(result);
    }

    private static int decode(LocalDate secretDate, LocalTime secretTime) {
        // объедините secretDate и secretTime
        ... newTime = ...

        // вычтите 2 месяца, 25 дней и 100 минут
        ... secretMoment = ...
        // найдите произведение порядкового номера дня в году и часов из secretMoment
        return ... * ...;
    }
}
/*
🦉 Игорь придумал «Шифр Игоря» — это как шифр Цезаря, только Игоря. И без букв.
В его шифре числа кодируются с помощью даты и времени. Игорь написал метод по декодированию,
но случайно стёр его и теперь не может восстановить пароль от архива с домашней работой.
К счастью, входные данные у него сохранились. Помогите Игорю восстановить пароль от важного архива!
Инструкция по декодированию:

Объединить экземпляр даты и экземпляр времени в экземпляр LocalDateTime.
От полученного момента времени вычесть 2 месяца, 25 дней и 100 минут.
В полученном результате перемножить порядковый номер дня в году и число часов.

Объединить LocalDate и LocalTime можно с помощью метода LocalDateTime.of(...).
Вычесть необходимое количество месяцев поможет метод minusMonths(...),
дней — minusDays(...), минут — minusMinutes(...).
Порядковый номер дня в году и часы вернут методы getDayOfYear() и getHour() соответственно.
 */

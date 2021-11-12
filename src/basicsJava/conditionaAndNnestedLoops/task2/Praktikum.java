package basicsJava.conditionaAndNnestedLoops.task2;

class Praktikum {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            // В тренировке должно выполниться 5 кругов
            System.out.println("Круг " + i);
            // Выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
            // Если да, то присесть 5 раз
            if  (i % 2 == 0){
                for (int j = 1; j <= 5; j++) {
                    System.out.println("  Приседаем " + j);
                }
            } else {
                // Иначе нужно отжаться 3 раза
                for (int j = 1; j <= 3; j++) {
                    System.out.println("  Отжимаемся " + j);
                }
            }
            // Независимо от номера круга качаем пресс 7 раз
            for (int j = 1; j <=7; j++) {
                System.out.println("  Качаем пресс " + j);
            }
            // Небольшое подбадривание в конце каждого круга
            System.out.println("Хороший темп, так держать!");
        }
        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}
/*
Условие задачи:
С помощью вложенных циклов и условных выражений разработайте программу силовой тренировки в зале.
В тренировке должно быть 5 кругов. На нечётных нужно делать по 3 отжимания, на чётных — 5 приседаний,
в конце каждого круга нужно 7 раз покачать пресс.
Для того чтобы узнать, является ли круг чётным, вам нужно будет проверить остаток от его деления на 2.
Если число чётное, то оно разделится без остатка (он равен нулю), если нечётное — с остатком.
Определить это в Java можно с помощью символа %. Например, остаток выражения 5 % 3 равен двум,
а у 4 % 2 — нулю. Для проверки, равен ли остаток нулю, используйте оператор ==.
Результат вашей программы должен получится таким:
Круг 1
  Отжимаемся 1
  Отжимаемся 2
  Отжимаемся 3
  Качаем пресс 1
  Качаем пресс 2
  Качаем пресс 3
  Качаем пресс 4
  Качаем пресс 5
  Качаем пресс 6
  Качаем пресс 7
Хороший темп, так держать!
Круг 2
  Приседаем 1
  Приседаем 2
  Приседаем 3
  Приседаем 4
  Приседаем 5
  Качаем пресс 1
  Качаем пресс 2
  Качаем пресс 3
  Качаем пресс 4
  Качаем пресс 5
  Качаем пресс 6
  Качаем пресс 7
Хороший темп, так держать!
...
Отлично позанимались сегодня! Вы - молодец!

ПОДСКАЗКА:
В вашей программе должно быть четыре цикла: один внешний — для кругов (их 5) и три вложенных — приседания (5 раз),
отжимания (3 раза) и пресс (7 раз).
На чётных кругах мы приседаем, а на нечётных отжимаемся. Чтобы этого добиться,
нужно использовать условное выражение if...else.
Является ли круг чётным, проверяется с помощью следующего выражения i % 2 == 0, где i — номер круга.
 */
import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Запрос имени пользователя с консоли
        System.out.print("Пожалуйста, введите ваше имя: ");
        String userName = scanner.nextLine();

        //Приветствие пользователя по имени
        System.out.println("Привет, " + userName + "!");

        //Вывод таблицы синусов от 0 до 45 градусов с шагом 5 градусов
        System.out.println("Таблица синусов:");
        System.out.println("----------------");
        System.out.println("|  Угол  |    Синус    |");
        System.out.println("----------------");
        for (int angle = 0; angle <= 45; angle += 5) {
            double radians = Math.toRadians(angle);
            double sine = Math.sin(radians);
            System.out.printf("| %2d градуса |   %.4f   |\n", angle, sine);
        }
        System.out.println("----------------");
    }
}

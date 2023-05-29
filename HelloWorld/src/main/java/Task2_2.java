package education;

public class Task2_2 {
    public static void main(String[] args) {
        // Создание объекта студента
        Student student = new Student("Ахмед", 20, "IT");

        // Назначение задания студенту
        Task task = new Task("Задание по программированию", "Написать программу на Java");

        // Поставить оценку студенту за задание
        Mark mark = new Mark(student, task, 90);

        // Вывод информации о студенте, задании и оценке
        System.out.println("Информация о студенте:");
        System.out.println("Имя: " + student.getName());

    }
}
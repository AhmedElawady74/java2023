import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task4_1 {
    public static void main(String[] args) {
        // Использование Lombok-аннотаций для классов
        Student student = Student.builder()
                .name("Ахмед")
                .age(20)
                .major("IT")
                .build();

        Task task = Task.builder()
                .title("Задание по программированию")
                .description("Написать программу на Java")
                .build();

        Mark mark = Mark.builder()
                .student(student)
                .task(task)
                .score(90)
                .build();

        // Вывод информации о студенте, задании и оценке
        System.out.println("Информация о студенте:");
        System.out.println("Имя: " + student.getName());
        // Дополнительный код для вывода информации о задании и оценке
        // ...
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Student {
    private String name;
    private int age;
    private String major;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Task {
    private String title;
    private String description;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Mark {
    private Student student;
    private Task task;
    private int score;
}

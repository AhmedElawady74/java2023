public class Task3_2 {
    public static void main(String[] args) {
        // Использование конструкторов и методов классов
        Student student = new Student.Builder()
                .setName("Ахмед")
                .setAge(20)
                .setMajor("IT")
                .build();

        Task task = new Task.Builder()
                .setTitle("Задание по программированию")
                .setDescription("Написать программу на Java")
                .build();

        Mark mark = Mark.createMark(student, task, 90);

        // Вывод информации о студенте, задании и оценке
        System.out.println("Информация о студенте:");
        System.out.println("Имя: " + student.getName());
        // Дополнительный код для вывода информации о задании и оценке
        // ...
    }
}

public class Student {
    private String name;
    private int age;
    private String major;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.major = builder.major;
    }

    // Методы getter для полей name, age и major

    public static class Builder {
        private String name;
        private int age;
        private String major;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setMajor(String major) {
            this.major = major;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}

public class Task {
    private String title;
    private String description;

    private Task(Builder builder) {
        this.title = builder.title;
        this.description = builder.description;
    }

    // Методы getter для полей title и description

    public static class Builder {
        private String title;
        private String description;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Task build() {
            return new Task(this);
        }
    }
}

public class Mark {
    private Student student;
    private Task task;
    private int score;

    private Mark(Student student, Task task, int score) {
        this.student = student;
        this.task = task;
        this.score = score;
    }

    // Методы getter для полей student, task и score

    public static Mark createMark(Student student, Task task, int score) {
        // Логика создания объекта Mark с использованием фабричного метода
        return new Mark(student, task, score);
    }
}

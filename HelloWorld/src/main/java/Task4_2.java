import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Math {
    public int fact(int n) {
        // реализация метода fact
    }

    public int sign(int x) {
        // реализация метода sign
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
    private String name;
    private int age;
    private String major;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Task {
    private String name;
    private String description;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Mark {
    private int value;
    private String subject;

    public static Mark createMark(int value, String subject) {
        // реализация фабричного метода createMark
    }
}

public class Task4_2 {
    public static void main(String[] args) {
        // Здесь можно написать код для демонстрации функциональности классов
    }
}
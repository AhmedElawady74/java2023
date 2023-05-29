import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2_1 {
    
    public static int fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static int sign(int n) {
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    
    // Тесты для метода fact
    @Test
    public void testFactWithPositiveNumber() {
        int result = Task2_1.fact(5);
        Assertions.assertEquals(120, result);
    }
    
    @Test
    public void testFactWithZero() {
        int result = Task2_1.fact(0);
        Assertions.assertEquals(1, result);
    }
    
    @Test
    public void testFactWithNegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Task2_1.fact(-5);
        });
    }
    
    // Тесты для метода sign
    @Test
    public void testSignWithPositiveNumber() {
        int result = Task2_1.sign(10);
        Assertions.assertEquals(1, result);
    }
    
    @Test
    public void testSignWithNegativeNumber() {
        int result = Task2_1.sign(-10);
        Assertions.assertEquals(-1, result);
    }
    
    @Test
    public void testSignWithZero() {
        int result = Task2_1.sign(0);
        Assertions.assertEquals(0, result);
    }
    
    public static void main(String[] args) {
        // Запуск тестов
        org.junit.jupiter.api.TestRunner.run(Task2_1.class);
    }
}

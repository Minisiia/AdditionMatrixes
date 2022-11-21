import java.util.Random;

public class AdditionMatrixes {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] result = new int[3][3];
        System.out.println("Перший масив:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(10); // заповнюємо масив цілими числами від 0 до 10
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Другий масив:");
        for (int k = 0; k < matrix1.length; k++) {
            for (int l = 0; l < matrix1[k].length; l++) {
                matrix2[k][l] = random.nextInt(10); // заповнюємо масив цілими числами від 0 до 10
                System.out.print(matrix2[k][l] + " ");
            }
            System.out.println();
        }
        System.out.println("Третій масив - результат додавання:");
        for (int n = 0; n < result.length; n++) {
            for (int m = 0; m < result[n].length; m++) {
                result[n][m] = matrix1[n][m] + matrix2[n][m];
                System.out.print(result[n][m] + " ");
            }
            System.out.println();
        }
    }
}

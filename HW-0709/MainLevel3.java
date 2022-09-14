/*
Написать программу, которая выводит на экран таблицу умножения (таблицу Пифагора).
 Естественно, использовать циклы.
 */

public class Main {
    public static void main(String[] args) {

        int row = 5;
        int col = 10;

        System.out.printf("     ");
        for (int j=1; j<=col; j+=1){
        System.out.printf("%5d", j);}

        System.out.println();
        System.out.println("-------------------------------------------------------------");

        for (int i = 1; i <= row; i += 1) {
            System.out.printf("%3d| ", i);
            for (int j = 1; j <= col; j += 1) {

                System.out.printf("%5d", i*j);
            }
            System.out.println();
        }
    }
}
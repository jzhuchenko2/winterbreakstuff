import java.util.Scanner;
public class Zhuchenko_6_1 {
    private static int a, b, c, d, f;
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("        Get Grade Counts");
        System.out.print("\nEnter number of letter grade A: ");
        a = keyboard.nextInt();
        System.out.print("Enter number of letter grade B: ");
        b = keyboard.nextInt();
        System.out.print("Enter number of letter grade C: ");
        c = keyboard.nextInt();
        System.out.print("Enter number of letter grade D: ");
        d = keyboard.nextInt();
        System.out.print("Enter number of letter grade F: ");
        f = keyboard.nextInt();

        System.out.println();
        System.out.println("0   10   20   30   40   50   60   70   80   90   100%");
        System.out.println("|    |    |    |    |    |    |    |    |    |    |");
        System.out.println("**************************************************");
        int totalGrades = a+b+c+d+f;
        int Acent = (a*100/totalGrades);
        int Bcent = (b*100/totalGrades);
        int Ccent = (c*100/totalGrades);
        int Dcent = (d*100/totalGrades);
        int Fcent = (f*100/totalGrades);
        for(int i = 0;i<=Acent/2;i++){
        System.out.print("*");
        }
        System.out.println(" A");
        for(int i = 1;i<=Bcent/2;i++){
        System.out.print("*");
        }
        System.out.println(" B");
        for(int i = 1;i<=Ccent/2;i++){
        System.out.print("*");
        }
        System.out.println(" C");
        for(int i = 1;i<=Dcent/2;i++){
        System.out.print("*");
        }
        System.out.println(" D");
        for(int i = 0;i<=Fcent/2;i++){
        System.out.print("*");
        }
        System.out.println(" F");
        keyboard.close();
    }
}

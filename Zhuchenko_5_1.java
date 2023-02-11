import java.util.Scanner;
public class Zhuchenko_5_1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the initial velocity: ");
        double vel = keyboard.nextInt();
        double height = 0;
        int bounce = 0;
        while (bounce < 5) {
            for(int time=0; time <= 30 && bounce < 5; time++)
            {
                if(time >= 1)
                {
                height = height + vel;
                vel = vel - 32.0;
                }
                if(height < 0)
                {
                    height = height * -0.5;
                    vel = vel * -0.5;
                    System.out.println("BOUNCE!");
                    bounce++;
                }
                System.out.println("time: "+time+" "+"height: "+height);
                    }
                    keyboard.close();
                }
            }}
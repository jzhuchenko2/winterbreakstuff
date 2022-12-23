import java.util.Scanner;
public class Zhuchenko_4_1 {
    private static final int MAX_SECONDS = 60 * 60 * 12;
    public static void main(String[] args) {
        System.out.println("Format:  HH:MM:SS <AM/PM>");
        System.out.println("Enter two times: ");
        Scanner keyboard = new Scanner(System.in);
        String time1 = keyboard.nextLine();
        String time2 = keyboard.nextLine();
        printElapsed(time1, time2); 
        keyboard.close();    
    }
    private static int toSeconds(String timeOfDay) {
        String[] words = timeOfDay.split(" ");
        String[] time = words[0].split(":");
        boolean morning = words[1].equalsIgnoreCase("AM");
        int hours = Integer.parseInt(time[0]);                                                                                                    
        int minutes = Integer.parseInt(time[1]);                                                                                                             
        int seconds = Integer.parseInt(time[2]);                                                                                                                      
        seconds += (minutes * 60);                                                                                                                               
        seconds += (hours * 60 * 60);                                                                                                                                        
        if (!morning) seconds += MAX_SECONDS;                                                                                                                                       
        return seconds;                                                                                                                                                 
    }                                                                                                                                                    
    private static void printElapsed(String time1, String time2) {                                                                                                                                                              
        int seconds1 = toSeconds(time1);
        int seconds2 = toSeconds(time2);                                                                                                                                                                                    
        boolean time1Morning = time1.split(" ")[1].equalsIgnoreCase("AM");                                                                                                                                                                                             
        boolean time2Morning = time2.split(" ")[1].equalsIgnoreCase("AM");                                                                                                                                                                                                      
        int secondsElapsed = seconds2 - seconds1;                                                                                                                                                                                                                
        if (!time1Morning && time2Morning) {
            secondsElapsed = (MAX_SECONDS - seconds1) + seconds2;        
        }
        int minutes = secondsElapsed / 60;         
        int seconds = secondsElapsed - (minutes * 60);         
        System.out.printf("The time elapsed is %d minutes and %d seconds\n", minutes, seconds);     
    }
}
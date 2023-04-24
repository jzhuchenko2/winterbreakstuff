import java.util.Scanner;
import java.util.Date;
import java.io.*;

public class WordChoice extends User {
    public String word;
    private Date day_rating;
    private int char_limit;
    User es = new User();

    public static void get_confirmation() {
        Confirmation.showcase_word();
    }
    public static void submit_word() {
        System.out.println("Press one to submit!");
        
    }
    public static void language_choice() {
        System.out.println("Welcome! \n Go ahead and input your word for today!");
        
    }


    /*public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word=word;
    }
    public Date getDay_rating() {
        return day_rating;
    }
    public void get_confirmation() {
        System.out.println("Thanks for paying idiot, now fix me");
    }
    public void submit_word() {
        System.out.println("Hurry!!!");
    }
    public void Choice(){
        System.out.println("Press (1) if you would like a confirmation!");
        Scanner sc = new Scanner(System.in);
              int choice = sc.nextInt();
              
              
         switch(choice){        
               case 1: Confirmation C = new Confirmation();
               C.Choice();
                break;
         }*/
}

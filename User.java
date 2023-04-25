import java.io.*;
import java.util.Scanner;

public class User {
    private String name;
    private int account_id;

    static void input_word() {
        System.out.println("Welcome! \n Go ahead and input your word for today!");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
    }
    
      public static void main(String[] args) {
        input_word();
        WordChoice.get_confirmation();
        WordChoice.submit_word();
        WordChoice.language_choice();
        Confirmation.showcase_word();


    }




    /*public static void main(String[] args) {
        System.out.println("Welcome!\n Go ahead and input your word for today! \n Enter your choice: 1) Input your singular word for the day ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        static void input_word(){
            System.out.println("Welcome!\n Go ahead and input your word for today! \n Enter your choice: 1) Input your singular word for the day ");
        }
        System.out.println("Your word choice for today is: " + word);
        /*int choice = sc.nextInt();

            do{
                switch(choice){
                    case 1: WordChoice W = new WordChoice();
                        W.Choice();
                    break;
                }
            }*/
}

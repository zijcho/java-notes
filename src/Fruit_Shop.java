import java.util.Scanner;

/**
 * Project:         java-notes
 * File Name:       Fruit_Shop.java
 * Created by:      Zi C.
 * Created on:      04-Jul-17
 * Last Modified:
 * Description:
 */
class Fruit_Shop {
    // Global variable for quitting.
    private boolean quit = false;
    private boolean buying = false;

    // private Cart cart; - this is yet to be implemented in a class

    // Main function to be run, has a loop that continues until quit.
    void main(){
        greet(0);
        while (!quit) {
            System.out.print("What would you like to do? ");

            Scanner sc = new Scanner(System.in);
            String i = sc.nextLine();
            receive_input(i);
        }

        greet(1);
    }

    // 'System' messages
    private void greet(int flag){
        if (flag == 0){
            String greeting = "Hello there, welcome to the fruit shop.";
            System.out.println(greeting);
        }

        if (flag == 1){
            String greeting = "Exiting the fruit shop...";
            System.out.println(greeting);
        }
    }

    // Handling of string input.
    private void receive_input(String inputString){
        switch (inputString.toLowerCase()) {
            case "quit":    quit = true;

            // placeholders, but a cart will be instantiated, and enable the other functions to used as input.
            case "shop":    ;
            case "add":     ;
            case "remove":  ;
            case "checkout":    ;
        }
    }
}

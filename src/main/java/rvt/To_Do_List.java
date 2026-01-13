package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class To_Do_List {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> ToDo = new ArrayList<>();
    while(true){
            System.out.print("\n\n(Quit = 'quit')\n(Print the To Do list = 'print')\n(Add to list = 'add')\nPlease input an action: ");
            String action = scanner.nextLine();
            System.out.println();
            clearScreen();

            String Action = action.toLowerCase();



            if ("add".equals(Action)){
                while (true){
                    System.out.print("\n(Type 'stop' to stop adding tasks)\nInput the task: ");
                    String ADD = scanner.nextLine();
                    

                    if ("stop".equals(ADD)){
                        clearScreen();
                        System.out.print("\n\nYou have stopped adding tasks.\n");
                        System.out.println("\n---------------------------------------------");

                        break;
                    }
                    else {
                        ToDo.add(ADD);
                    }
                }
            }

            else if ("print".equals(Action)){
                System.out.println("\n\n---------------------------------------------\n");
                for (int i = 0; i < ToDo.size(); i++) {
                    System.out.println(ToDo.get(i));
                }
                System.out.println("\n---------------------------------------------");
            }

            else if("quit".equals(Action)){
                break;
            }

        }
    }

    public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }
}

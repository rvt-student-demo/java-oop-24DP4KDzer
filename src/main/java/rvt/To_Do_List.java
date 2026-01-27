package rvt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class To_Do_List {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> ToDo = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("data/test.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String cleaned = line.replaceFirst("^\\d+\\.\\s*", "");
                ToDo.add(cleaned);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }        
    while(true){
            System.out.print("\n\n(Quit = 'quit')\n(Print the To Do list = 'print')\n(Add to list = 'add')\n(Save = 'save')\n(To clear tasks from saved file = 'clear')\nPlease input an action: ");
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


            else if("save".equals(Action)){
                fileManager(ToDo);
            }

            else if("clear".equals(Action)){
                clearFile(scanner, ToDo);
            }

        }
    }

    public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    }


    public static void fileManager(ArrayList<String> ToDo){
        try (PrintWriter pWriter = new PrintWriter(new FileWriter("data/test.csv", false))){
            for (int i = 0; i < ToDo.size(); i++) {
                    pWriter.println(1+i + ". " + ToDo.get(i));
                }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    


    public static void clearFile(Scanner scanner, ArrayList<String> ToDo){
        try (PrintWriter pw = new PrintWriter(new FileWriter("data/test.csv", false))){

        }
        catch (IOException e){
            e.printStackTrace();
        }
        spaces();
        System.out.print("Do you want to clear specialized items \nfrom the saved 'TODO' List? (Y = Yes/ N = No): ");
        String listClear = scanner.nextLine();
        if ("Y".equals(listClear)){
            spaces();
            System.out.println("Your List -" + ToDo);
            spaces();
            System.out.println("(Type a number)\nWhich item would u like to remove?: ");
            int item = scanner.nextInt();

            ToDo.remove(item - 1); 

            clearScreen();

            System.out.println("You removed "+ item + " item" + "\nYour ToDo list looks like this - " + ToDo);
            
            

            System.out.print("Press Enter to continue...");
            String darb = scanner.nextLine();

            spaces();
        }
        else{
            
        }
    }



    public static void spaces(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}

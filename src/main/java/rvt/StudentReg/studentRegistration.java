package rvt.StudentReg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentRegistration {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> vardi = new ArrayList<>();
        while (true){
            System.out.print("Input Your\n'Name' 'Surname'\n'Email' 'Phone'\nSeparated by ','\n>>> ");
            String input = scanner.nextLine();
            if (input.equals("stop")){
                System.out.println("You have stopped adding names");
                break;
            }
            System.out.println("Your Data Has Been Added \n(Type 'stop' if you want to stop adding names)");
            vardi.add(input);
        }

        vardi.add("Janis, Vercumnieks, janisjanis@gmail.com, 27272727");
        vardi.add("Gatis, Strazdins, gstrazdins@gmail.com, 67232121");
        

        System.out.printf("+-----------------+-----------------+------------------------------+---------------------+%n");
        System.out.printf("| %-15s | %-15s | %-30s | %-17s |\n", "Name", "Surname", "Email", "Phone");
        System.out.printf("+-----------------+-----------------+------------------------------+---------------------+%n");
        

       for (String student : vardi){
        String[] parts = student.split(",");

        if (parts.length == 4){
            System.out.printf("| %-15s | %-15s | %-30s | %-17s |\n",
                        parts[0].trim(),
                        parts[1].trim(),
                        parts[2].trim(),
                        parts[3].trim());
        }
       }

        System.out.printf("+-----------------+-----------------+------------------------------+---------------------+%n");
        
    }
    
}

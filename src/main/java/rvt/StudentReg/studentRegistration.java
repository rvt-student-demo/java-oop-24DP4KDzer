package rvt.StudentReg;

import java.util.Scanner;

public class studentRegistration {
    public static void main(String[] args){
        System.out.printf("+-----------------+-----------------+---------------------+--------------------+%n");
        System.out.printf("| %-15s | %-15s | %-19s | %-18s |\n", "Name", "Surname", "Email", "Phone");
        System.out.printf("+-----------------+-----------------+---------------------+--------------------+%n");
        String[] names = {"Janis, Petersons, Janitis@gmail.com, 371+ 27734151", "Gatis, Strazdins, Gatis@gmail.com, 371+ 63713121", "Davis, Vrecumnieks, Davitis@gmail.com, 371+ 12121111"};

        for (int i = 0; i < names.length; i++){
            String parts[] = names[i].split(",");
            System.out.printf("| %-15s | %-15s | %-19s | %-18s |\n", parts[0], parts[1], parts[2], parts[3] );
        }

        System.out.printf("+-----------------+-----------------+---------------------+--------------------+%n");
        
    }
    
}

package rvt;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) {
        try (PrintWriter pWriter = new PrintWriter("data/test.csv")) {
            pWriter.println("1,Izpildit majas darbu");
            pWriter.println("2,Sakopt istabu");

            //pWriter.close(); ja pēc "try" ir apaļās iekavas ar objektu tad nav vajadzīga šī līnija


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

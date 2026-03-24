package rvt.IOU;

public class IOweYou {
    public static void main(String[] args) {
        I_OU iou = new I_OU();
        iou.setSum("Alice", 50.0);
        iou.setSum("Bob", 30.0);

        System.out.println("Alice owes: " + iou.getSum("Alice"));
        System.out.println("Bob owes: " + iou.getSum("Bob"));
        System.out.println("Charlie owes: " + iou.getSum("Charlie")); 
    }   
}

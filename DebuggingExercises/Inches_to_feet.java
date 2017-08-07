import javax.swing.*;

public class Inches_to_feet {
    public static void main(String[] args){
        String costString = JOptionPane.showInputDialog(null, "Enter Inches",
                JOptionPane.INFORMATION_MESSAGE);
        int inches = Integer.parseInt(costString);
        int feet = inches / 12;
        int leftover = inches % 12;
        System.out.println(feet + " feet and " + leftover + " inches");
    }
}

import javax.swing.*;

public class Nautical_mile {
    public static void main(String[] args){
        String nautical_mile_string = JOptionPane.showInputDialog(null, "Enter Nautical miles",
                JOptionPane.INFORMATION_MESSAGE);
        double nautical_mile = Integer.parseInt(nautical_mile_string);
        double km = nautical_mile * 1.852;
        double mile = nautical_mile * 1.15078;
        System.out.println(nautical_mile + " Nautical miles = " + km + " KMs / " + mile + " Miles");
    }
}

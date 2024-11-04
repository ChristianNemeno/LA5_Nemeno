package FoodOrder;

import SimpleCalculator.SimpleCalculator;

import javax.swing.*;

public class FoodOrder extends JFrame {


    private JPanel pMain;

    public static void main(String[] args) {
        FoodOrder s = new FoodOrder();
        s.setTitle("Food Ordering App");
        s.setContentPane(s.pMain);
        s.setSize(400,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
    }

}

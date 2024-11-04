package FoodOrder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame {


    private JPanel pMain;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JButton bntOrder;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    JCheckBox[] foods = {cPizza,cBurger,cFries,cSoftDrinks,cTea,cSundae};
    int[] prices = {100,80,65,55,50,40};
    JRadioButton[] discounts = {rbNone,rb5,rb10,rb15};
    double[] value = {0.0, .05, .1,.15};

    FoodOrder(){
        bntOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // paras foods total
                double total =0;
                for(int i=0; i<6; i++){
                    if(foods[i].isSelected()){
                        total += prices[i];
                    }
                }
                if(rbNone.isSelected()){
                    String formattedNa = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null,"The total price is Php" + formattedNa);
                }else{
                    for(int i=1; i<4;i++){
                        if(discounts[i].isSelected()){
                            double d = total * value[i];
                            total -= d;
                            String x = String.format("%.2f", total);
                            JOptionPane.showMessageDialog(null,"The total price is Php" + x);
                            break;
                        }
                    }
                }


            }
        });

    }

    public static void main(String[] args) {
        FoodOrder s = new FoodOrder();
        s.setTitle("Food Ordering App");
        s.setContentPane(s.pMain);
        s.setSize(400,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);
    }

}

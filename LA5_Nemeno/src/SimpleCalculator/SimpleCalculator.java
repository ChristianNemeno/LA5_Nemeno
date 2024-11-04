package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JPanel pMain;
    private JTextField answer;
    private JLabel lblResult;

    SimpleCalculator(){

        tfNumber1.setName("tfNumber1");
        tfNumber2.setName("tfNumber2");
        cbOperations.setName("cbOperations");
        btnCompute.setName("btnCompute");


        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());

                char op = ((String)cbOperations.getSelectedItem()).charAt(0);
                int result;

                try{
                switch (op){
                    case '+':
                        result = num1 + num2;
                        answer.setText(String.valueOf(result));
                        break;

                    case '-':
                        result = num1 - num2;
                        answer.setText(String.valueOf(result));
                        break;

                    case '*':
                        result = num1 * num2;
                        answer.setText(String.valueOf(result));
                        break;
                    case '/':

                        result = num1 / num2;


                        answer.setText(String.valueOf(result));
                        break;

                }

                }catch(ArithmeticException exception){
                    JOptionPane.showMessageDialog(null,exception.getMessage());
                }
            }
        });




    }
    public static void main(String[] args) {

        SimpleCalculator s = new SimpleCalculator();
        s.setTitle("Simple Calculator");
        s.setContentPane(s.pMain);
        s.setSize(400,300);
        s.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s.setVisible(true);

    }
}

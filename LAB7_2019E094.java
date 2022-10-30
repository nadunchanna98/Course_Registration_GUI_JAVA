import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class LAB7_2019E094 extends JFrame {

    public JTextField textName;
    public JTextField textRegNo;
    public JTextField textCsCode;
    public JTextField textCs;
    public JTextField textCredit;
    public JTextField textEmail;
    public JTextField textAdvisorName;
    public JButton submitButton;
    private JButton resetButton;
    private JPanel Main;

    public  LAB7_2019E094() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textName.getText();
                String regNo = textRegNo.getText();
                String cs = textCs.getText();
                String csCode = textCsCode.getText();
                String credit = textCredit.getText();
                String email = textEmail.getText();
                String advisorName = textAdvisorName.getText();

                if (name.isEmpty() || regNo.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You Must fill Name* And Registration* Number !!");
                } else {
                    JOptionPane.showMessageDialog(null, "Name: " + name + " \nRegistration Number: " + regNo + " \nCS Code: " + csCode + " \nCS: " + cs + " \nCredit: " + credit + " \nEmail: " + email + " \nAdvisor Name: " + advisorName,"Student Registration Details", JOptionPane.INFORMATION_MESSAGE);
                }
            };
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textName.setText("");
                textRegNo.setText("");
                textCsCode.setText("");
                textCs.setText("");
                textCredit.setText("");
                textEmail.setText("");
                textAdvisorName.setText("");
            }
        });
    };

        public static void main(String[] args) {
            LAB7_2019E094 frame = new LAB7_2019E094();
            frame.setContentPane(frame.Main);
            frame.setVisible(true);
            frame.setSize(800, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}



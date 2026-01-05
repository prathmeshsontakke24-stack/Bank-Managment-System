package Bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton submit, cancel;
    String formno;

    Signup3(String formNumber) {
        super("APPLICATION FORM");
        this.formno = formNumber; // ✅ Correct assignment

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3 :-");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel type = new JLabel("Account Type :");
        type.setFont(new Font("Raleway", Font.BOLD, 18));
        type.setBounds(100, 120, 200, 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(100, 160, 200, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(350, 160, 300, 30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(new Color(252, 208, 76));
        r3.setBounds(100, 200, 200, 30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(new Color(252, 208, 76));
        r4.setBounds(350, 200, 300, 30);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card Number :");
        card.setFont(new Font("Raleway", Font.BOLD, 18));
        card.setBounds(100, 260, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-XXXX");
        number.setFont(new Font("Raleway", Font.BOLD, 18));
        number.setBounds(330, 260, 300, 30);
        add(number);

        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(100, 300, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 18));
        pnumber.setBounds(330, 300, 300, 30);
        add(pnumber);

        JLabel services = new JLabel("Services Required :");
        services.setFont(new Font("Raleway", Font.BOLD, 18));
        services.setBounds(100, 350, 200, 30);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(252, 208, 76));
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBounds(100, 400, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(252, 208, 76));
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        c2.setBounds(350, 400, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(252, 208, 76));
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        c3.setBounds(100, 450, 200, 30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(252, 208, 76));
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBounds(350, 450, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(252, 208, 76));
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        c5.setBounds(100, 500, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(252, 208, 76));
        c6.setFont(new Font("Raleway", Font.BOLD, 14));
        c6.setBounds(350, 500, 200, 30);
        add(c6);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.WHITE);
        submit.setForeground(Color.BLACK);
        submit.setBounds(250, 600, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.setBounds(420, 600, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String atype = null;
            if (r1.isSelected()) atype = "Saving Account";
            else if (r2.isSelected()) atype = "Fixed Deposit Account";
            else if (r3.isSelected()) atype = "Current Account";
            else if (r4.isSelected()) atype = "Recurring Deposit Account";

            Random random = new Random();
            String cardno = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pinno = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String services = "";
            if (c1.isSelected()) services += " ATM Card";
            if (c2.isSelected()) services += " Internet Banking";
            if (c3.isSelected()) services += " Mobile Banking";
            if (c4.isSelected()) services += " Email Alerts";
            if (c5.isSelected()) services += " Cheque Book";
            if (c6.isSelected()) services += " E-Statement";

            try {
                ConnectFile c1 = new ConnectFile();
                // ✅ updated column name pinno
                String q1 = "INSERT INTO signupthree (formno, account_type, card_number, pinno, services) " +
                        "VALUES ('" + formno + "','" + atype + "','" + cardno + "','" + pinno + "','" + services.trim() + "')";
                String q2 = "INSERT INTO login (formno, card_number, pinno) VALUES ('" + formno + "','" + cardno + "','" + pinno + "')";
                c1.statement.executeUpdate(q1);
                c1.statement.executeUpdate(q2);

                JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\nPIN: " + pinno);
                setVisible(false);
                new main_Class(pinno);
               // new Login();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup3(""); // ✅ Testing with sample formno
    }
}

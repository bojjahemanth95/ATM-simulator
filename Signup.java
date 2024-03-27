package BankingSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;


public class Signup extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7,t100;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    //JDateChooser dateChooser;


    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    Signup(){

        setTitle("NEW ACCOUNT APPLICATION FORM");

//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("BankSystem/icons/logo.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l11 = new JLabel(i3);
//        l11.setBounds(20, 0, 100, 100);
//        add(l11);

        l1 = new JLabel("APPLICATION FORM NO. "+first);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));

        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));

        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));

        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));

        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));

        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));

        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));

        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));

        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));

        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));

        l13 = new JLabel("Date");
        l13.setFont(new Font("Raleway", Font.BOLD, 14));

        l14 = new JLabel("Month");
        l14.setFont(new Font("Raleway", Font.BOLD, 14));

        l15 = new JLabel("Year");
        l15.setFont(new Font("Raleway", Font.BOLD, 14));


        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        t100 = new JTextField();
        t100.setFont(new Font("Raleway", Font.BOLD, 14));

        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));

        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));

        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));

        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));

        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));






        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);

        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);

        /**  dateChooser = new JDateChooser();
         //dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
         dateChooser.setForeground(new Color(105, 105, 105));
         dateChooser.setBounds(137, 337, 200, 29);
         add(dateChooser);*/

        setLayout(null);
        l1.setBounds(140,20,600,40);
        add(l1);

        l2.setBounds(290,80,600,30);
        add(l2);

        l3.setBounds(100,140,100,30);
        add(l3);

        t1.setBounds(300,140,400,30);
        add(t1);

        l4.setBounds(100,190,200,30);
        add(l4);

        t2.setBounds(300,190,400,30);
        add(t2);

        l5.setBounds(100,240,200,30);
        add(l5);

        t100.setBounds(300, 240, 400, 30);
        add(t100);

        l6.setBounds(100,290,200,30);
        add(l6);

        r1.setBounds(300,290,60,30);
        add(r1);

        r2.setBounds(450,290,90,30);
        add(r2);

        l7.setBounds(100,340,200,30);
        add(l7);

        t3.setBounds(300,340,400,30);
        add(t3);

        l8.setBounds(100,390,200,30);
        add(l8);

        r3.setBounds(300,390,100,30);
        add(r3);

        r4.setBounds(450,390,100,30);
        add(r4);

        r5.setBounds(635,390,100,30);
        add(r5);



        l9.setBounds(100,440,200,30);
        add(l9);

        t4.setBounds(300,440,400,30);
        add(t4);

        l10.setBounds(100,490,200,30);
        add(l10);

        t5.setBounds(300,490,400,30);
        add(t5);

        l11.setBounds(100,540,200,30);
        add(l11);

        t6.setBounds(300,540,400,30);
        add(t6);

        l12.setBounds(100,590,200,30);
        add(l12);

        t7.setBounds(300,590,400,30);
        add(t7);

       // t100.setBounds(300,590,400,30);
        //add(t100);

        b.setBounds(620,660,80,30);
        add(b);

        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b) {
            String str1=t1.getText();
            String str2=t2.getText();
            String str3=t3.getText();
            String str4=t4.getText();
            String str5=t5.getText();
            String str6=t6.getText();
            String str7=t7.getText();
            String str8= t100.getText();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bank", "root", ""
                );
                Statement statement = connection.createStatement();
                  boolean value  = statement.execute("insert into singup2 values ('"+str1+"','"+str2+"','"+str3+"','"+str4+"','"+str6+"','"+str5+"','"+str7+"');");

                    JOptionPane.showMessageDialog(this, "Successfully Singup", "Notice", JOptionPane.INFORMATION_MESSAGE);

                    Signup2 demo = new Signup2("");
                    demo.setVisible(true);
                    demo.toFront();

                   // JOptionPane.showMessageDialog(this, "Please Enter Valid Account_Number and Pin", "Notice", JOptionPane.INFORMATION_MESSAGE);


                connection.close();
            } catch (Exception es) {
                java.lang.System.out.println(es);
            }
        }
        String formno = first;
        String name = t1.getText();
        String fname = t2.getText();
        String dob = t100.getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }

        String email = t3.getText();
        String marital = null;
        if(r3.isSelected()){
            marital = "Married";
        }else if(r4.isSelected()){
            marital = "Unmarried";
        }else if(r5.isSelected()){
            marital = "Other";
        }

        String address = t4.getText();
        String city = t5.getText();
        String pincode = t6.getText();
        String state = t7.getText();




    }



    public static void main(String[] args){
        new Signup().setVisible(true);
    }
}
//  private void add(JDateChooser dateChooser) {
//     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//}
//
//  private static class JDateChooser {

//    public JDateChooser() {
//  }

//private Object getDateEditor() {
//  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//}
/**
 private void setBounds(int i, int i0, int i1, int i2) {
 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 }

 private void setForeground(Color color) {
 throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 }
 }
 }*/

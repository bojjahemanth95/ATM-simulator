package BankingSystem;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


class deposite1 extends JFrame implements ActionListener
{
    JButton btn1,btn2,btn3;
    JLabel label1,label2,label3;
    JTextField text,text1;
    JFrame frame;
    String str;
    static  int Amount;
    Font f=new Font(Font.SANS_SERIF,Font.BOLD,39);
    deposite1() {

        frame = new JFrame();
        label1 = new JLabel();
        label1.setText("Deposite Money");
        label1.setBounds(309, 29, 500, 59);
        label1.setFont(f);
//        label3

//label 2
        label2=new JLabel();
        label2.setText("Enter Your Amount");
        label2.setBounds(370,238,450,50);
        label2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        this.add(label2);
        this.add(label1);


//        textfied
        text =new JTextField();
        text.setBounds(270,300,400,50);
        text.setFont(new Font(Font.MONOSPACED,Font.BOLD,22));
        text.setHorizontalAlignment(JTextField.CENTER);
        this.add(text);
//  textfied

//        button1
        btn1=new JButton();
        btn1.setText("ENTER");
        btn1.setBounds(330,400,300,40);
        btn1.addActionListener(this);

//        button2
        btn2=new JButton();
        btn2.setText("Back=>");
        btn2.setBounds(400,500,130,50);
        this.add(btn2);
        btn2.setBackground(Color.black);
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);

        this.add(btn1);
        this.setLayout(null);

        this.setBounds(0,0,999,699);
        this.setVisible(true);
    }




    public void actionPerformed(ActionEvent e)
    {
        int num,num1,num2;
        String str2;
        if(e.getSource()==btn1)
        {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bank", "root", "");

                Statement statement = connection.createStatement();




                ResultSet resultSet = statement.executeQuery("select amount from deposit");
                while(resultSet.next())
                {
                    Amount=(resultSet.getInt(1));
                }

                str=text.getText();
                num=Integer.parseInt(str);
                num1=Amount+num;
                str2=Integer.toString(num1);
                statement.execute("update deposit set amount="+num1+"");

                connection.close();
            } catch (Exception es) {
                System.out.println(es);
            }


//            database end

            JOptionPane.showMessageDialog(frame,"Money Deposited","Deposite",JOptionPane.INFORMATION_MESSAGE);

        }
        if(e.getSource()==btn2)
        {
            this.dispose();
            this.toBack();
            setVisible(false);

            new Transactions("").toFront();
//            new atm2().setState(java.awt.Frame.NORMAL);
            this.dispose();

//            new atm2().toFront();
        }
    }
    public static void main(String[] a)
    {
        deposite1 demo=new deposite1();

    }

}

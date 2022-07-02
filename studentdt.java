import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;

public class studentdt extends JFrame implements ActionListener,KeyListener
{
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3,b4;
    JComboBox c1;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    Statement st;
    ResultSet rs;
    Connection con;
    studentdt()
    {
        super("Student Detail");
        setSize(500,500);
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        t4=new JTextField(20);
        t5=new JTextField(20);
        
        b1=new JButton("Save");
        b2=new JButton("Edit");
        b3=new JButton("Delete");
        b4=new JButton("Close");
        
        l1=new JLabel("Sr.No");
        l2=new JLabel("SName");
        l3=new JLabel("Add");
        l4=new JLabel("City");
        l5=new JLabel("Mob No");
        l6=new JLabel("Cna");
        l7=new JLabel("Student Information");
        l8=new JLabel("Sub Name");
        c1=new JComboBox();
      
        
        setLayout(null);
        
         l7.setBounds(190,30,300,70);
       l7.setFont(new Font("Times New Roman",Font.BOLD,30));
       add(l7);
        l1.setBounds(100,100,100,30);
        add(l1);
        t1.setBounds(200,100,200,30);
        add(t1);
        
        l2.setBounds(100,140,100,30);
        add(l2);
        t2.setBounds(200,140,200,30);
        add(t2);
        
        l3.setBounds(100,180,100,30);
        add(l3);
        t3.setBounds(200,180,200,30);
        add(t3);
        
        l4.setBounds(100,220,100,30);
        add(l4);
        t4.setBounds(200,220,200,30);
        add(t4);
        
        l5.setBounds(100,260,100,30);
        add(l5);
        t5.setBounds(200,260,200,30);
        add(t5);
        
        l8.setBounds(100, 310, 100, 30);
        add(l8);
        c1.setBounds(200,300,100,30);
        add(c1);
        
         b1.setBounds(200,340,100,30);
        add(b1);
        b2.setBounds(310,340,100,30);
        add(b2);
        b3.setBounds(200,380,100,30);
        add(b3);
        b4.setBounds(310,380,100,30);
        add(b4);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3309/compapp","root","admin");
            String ab=t1.getText();
            st=con.createStatement();
            rs=st.executeQuery("select ab from branchinfo");
            while(rs.next())
            {
                c1.addItem(String.valueOf(rs.getString(1)));
                
            }
            st.close();
            con.close();
            
        }catch(Exception e1)
        {
            JOptionPane.showMessageDialog(this, e1.getMessage());
        }
        t1.addKeyListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if(e.getSource()==b1)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver"); 
                con=DriverManager.getConnection("jdbc:mysql://localhost:3309/compapp","root","admin");
                Integer rollno=Integer.parseInt(String.valueOf(t1.getText()));
                String name=t2.getText();
                String adds=t3.getText();
                String city=t4.getText();
                String mob=t5.getText();
                String cna=String.valueOf(c1.getSelectedItem());
                
                st=con.createStatement();
                st.executeUpdate("insert into studentdt values(" + rollno + ",'" + name + "','" + adds +"', '" + city +"', '" + mob +"','" + cna + "')");
                JOptionPane.showMessageDialog(this,"Record is inserted");
                //t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                st.close();
                con.close();
                documentlist d1=new documentlist(t1.getText());
            }catch(Exception e1)
            {
                JOptionPane.showMessageDialog(this,e1.getMessage());
            }
                
        }
         else if(e.getSource()==b2)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver"); 
                con=DriverManager.getConnection("jdbc:mysql://localhost:3309/compapp","root","admin");
               Integer rollno=Integer.parseInt(t1.getText());
                String name=t2.getText();
                String adds=t3.getText();
                String city=t4.getText();
                String mob=t5.getText();
                String cna= String.valueOf(c1.getSelectedItem());
                
                st=con.createStatement();
                st.executeUpdate("update studentdt set name='" + name + "',adds='" +  adds +"', city='" + city +"',mob='" + mob + "',cna='" + cna + "' where rollno=" + rollno +"");
                JOptionPane.showMessageDialog(this,"Record is Updated");
                //t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                
                st.close();
                con.close();
                st.close();
                con.close();
                documentlist d1=new documentlist(t1.getText());
                d1.loadData();
                d1.disCmb();
            }catch(Exception e1)
            {
                JOptionPane.showMessageDialog(this,e1.getMessage());
                
            }
        }
         else if(e.getSource()==b3)
         {
             try
             {
                 Class.forName("com.mysql.jdbc.Driver");
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3309/compapp","root","admin");
                 Integer rollno=Integer.parseInt(t1.getText());
                 st=con.createStatement();
                 st.executeUpdate("Delete from studentdt where rollno=" + rollno +"");
                 JOptionPane.showMessageDialog(this,"Record is deleted");
                 t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                 st.close();
                 con.close();
             }catch(Exception e1)
             {
                 JOptionPane.showMessageDialog(this,e1.getMessage());
             }
         }
         else if(e.getSource()==b4)
         {
             dispose();
         }
    }
    
    public static void main(String args[])
    {
        studentdt s1=new studentdt();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3309/compapp","root","admin");
            int rollno=Integer.parseInt(t1.getText());
            st=con.createStatement();
            rs=st.executeQuery("select * from studentdt where rollno=" +rollno +"");
            if(rs.next())
            {
                t1.setText(String.valueOf(rs.getString(1)));
                t2.setText(String.valueOf(rs.getString(2)));
                t3.setText(String.valueOf(rs.getString(3)));
                t4.setText(String.valueOf(rs.getString(4)));
                t5.setText(String.valueOf(rs.getString(5)));
                c1.setSelectedItem(rs.getString(6));
                
            }
            st.close();
            con.close();
            
        }catch(Exception e1)
        {
            //JOptionPane.showMessageDialog(this, e1.getMessage());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}

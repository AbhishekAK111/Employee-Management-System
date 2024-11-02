package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Home extends JFrame implements ActionListener{
    JButton add,view,remove,update;
    public Home(){
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0,1120 ,630);
        add(image);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(620,20,500,40);
        heading.setFont(new Font("serif",Font.BOLD,25));
        heading.setForeground(Color.DARK_GRAY);
        image.add(heading);  
        
         add =new JButton("Add Employee");
        add.setBounds(650, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
         
         view =new JButton("View Details");
        view.setBounds(820, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
         
         update =new JButton("Update Details");
        update.setBounds(650, 130, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
         
         remove =new JButton("Remove Employee");
        remove.setBounds(820, 130, 150, 40);
        remove.addActionListener(this);   
         image.add(remove);
        
        setSize(1120,630);
        setLocation(250,100);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()== add){
          
          setVisible(false);
          new Add();
          
      }else if(ae.getSource()== view){
              setVisible(false);
              new ViewEmp();
              
      }else if(ae.getSource()== update){
          setVisible(false);
          new ViewEmp();
          
      }else{
          setVisible(false);
          new Remove();
          
      }
    }
  public static void main(String[] args){
      new Home();
  }  
}

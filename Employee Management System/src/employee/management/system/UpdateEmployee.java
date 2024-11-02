
package employee.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class UpdateEmployee extends JFrame implements ActionListener{
        
    JTextField tfeducation,tflabelfname,tflabeldesignation,tflabelemail,tflabelsalary,tflabeladdress,tflabelphone;
    JButton add,back;
    JLabel lablempid; 
    String empid;
    UpdateEmployee(String  empid){
            this.empid = empid;
            getContentPane().setBackground(Color.white);
            setLayout(null);
            
            JLabel heading = new JLabel("Update Employee Details");
            heading.setBounds(320, 30, 500, 50);
            heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
            add(heading);
            
            
            JLabel labelname = new JLabel("Name");
            labelname.setBounds(100,150,150,30);
            labelname.setFont(new Font("serif",Font.PLAIN,20));
            add(labelname);
            
            JLabel lblname = new JLabel();
            lblname.setBounds(200,150,200,30);
            add(lblname);
            
             
            JLabel labelfname = new JLabel("Father Name");
            labelfname.setBounds(420,150,150,30);
            labelfname.setFont(new Font("serif",Font.PLAIN,20));
            add(labelfname);
            
            tflabelfname = new JTextField();
            tflabelfname.setBounds(540,150,200,30);
            add(tflabelfname);
            
            
            JLabel labeldob = new JLabel("Birth Date");
            labeldob.setBounds(100,200,150,30);
            labeldob.setFont(new Font("serif",Font.PLAIN,20));
            add(labeldob);
            
            JLabel lbldob =new JLabel();
            lbldob.setBounds(200, 200, 200, 30);
            add(lbldob);
            
           
            JLabel labelsalary = new JLabel("Salary");
            labelsalary.setBounds(420,200,150,30);
            labelsalary.setFont(new Font("serif",Font.PLAIN,20));
            add(labelsalary);
            
             tflabelsalary = new JTextField();
            tflabelsalary.setBounds(540,200,200,30);
            add(tflabelsalary);
            
            JLabel labeladdress = new JLabel("Address");
            labeladdress.setBounds(100,250,150,30);
            labeladdress.setFont(new Font("serif",Font.PLAIN,20));
            add(labeladdress);
            
             tflabeladdress = new JTextField();
            tflabeladdress.setBounds(200,250,200,30);
            add(tflabeladdress);
            
             JLabel labelphone = new JLabel("Phone");
            labelphone.setBounds(420,250,150,30);
            labelphone.setFont(new Font("serif",Font.PLAIN,20));
            add(labelphone);
            
             tflabelphone = new JTextField();
            tflabelphone.setBounds(540,250,200,30);
            add(tflabelphone);
            
             
             JLabel labelemail = new JLabel("Email");
            labelemail.setBounds(100,290,150,30);
            labelemail.setFont(new Font("serif",Font.PLAIN,20));
            add(labelemail);
            
             tflabelemail = new JTextField();
            tflabelemail.setBounds(200,290,200,30);
            add(tflabelemail);
            
            
           
            JLabel labelquali = new JLabel("Qualification");
            labelquali.setBounds(420,290,150,30);
            labelquali.setFont(new Font("serif",Font.PLAIN,20));
            add(labelquali);
            
            
            tfeducation = new  JTextField();
            tfeducation.setBounds(540,290,200,30);
            add(tfeducation);
            
            JLabel labeldesignation = new JLabel("Designation");
            labeldesignation.setBounds(100,330,150,30);
            labeldesignation.setFont(new Font("serif",Font.PLAIN,20));
            add(labeldesignation);
            
             tflabeldesignation = new JTextField();
            tflabeldesignation.setBounds(200,330,200,30);
            add(tflabeldesignation);
            
            JLabel labeladhar = new JLabel("Adhar No");
            labeladhar.setBounds(420,330,150,30);
            labeladhar.setFont(new Font("serif",Font.PLAIN,20));
            add(labeladhar);
            
             JLabel lbladhar = new JLabel();
            lbladhar.setBounds(540,330,200,30);
            add(lbladhar);
            
            JLabel labelempid = new JLabel("Employee ID");
            labelempid.setBounds(100,370,150,30);
            labelempid.setFont(new Font("serif",Font.PLAIN,20));
            add(labelempid);
            
            lablempid = new JLabel();
            lablempid.setBounds(220,370,150,30);
            lablempid.setForeground(Color.red);
            lablempid.setFont(new Font("serif",Font.BOLD,20));
            add(lablempid);
            
            try{
                Conn c = new  Conn();
                String  query ="select * from employee where empid = '"+empid+"'";
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    lblname.setText(rs.getString("name"));
                    tflabelfname.setText(rs.getString("fname"));
                    lbldob.setText(rs.getString("dob"));
                    tflabelsalary.setText(rs.getString("salary"));
                    tfeducation.setText(rs.getString("education"));
                    tflabelphone.setText(rs.getString("phone"));
                    tflabelemail.setText(rs.getString("email"));
                    lbladhar.setText(rs.getString("adhar"));
                    lablempid.setText(rs.getString("empid"));
                    tflabeldesignation.setText(rs.getString("designation"));
                    tflabeladdress.setText(rs.getString("address"));
                
                }
            
            
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            add =new JButton("Update Employee");
            add.setBounds(250, 410, 150, 40);
            add.setBackground(Color.DARK_GRAY);
            add.setForeground(Color.white);
            add.addActionListener(this);
            add(add);
        
            back =new JButton("Back");
            back.setBounds(450, 410, 150, 40);
            back.setBackground(Color.DARK_GRAY);
            back.setForeground(Color.white);
            back.addActionListener(this);
            add(back);
            
            
            setSize(900,700);
            setLocation(300, 50);
            setVisible(true);
            
        }
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == add){
                
                String father =tflabelfname.getText();
                String address =tflabeladdress.getText();
                String phone =tflabelphone.getText();
                String designation =tflabeldesignation.getText();
                String email =tflabelemail.getText();
                String salary =tflabelsalary.getText();
                String education = tfeducation.getText();
                try{
                    Conn c =new Conn();
                    String query = "update  employee set fname = '"+father+"',salary = '"+salary+"',address = '"+address+"', phone = '"+phone+"', email = '"+email+"', education = '"+education+"', designation = '"+designation+"' where empid = '"+empid+"'";
                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Details updaated successfully");
                    setVisible(false);
                    new Home();
                }catch(Exception e){
                    e.printStackTrace();;
                }
                
            }else{
                setVisible(false);
                new Home();
            }
            
            
            
        }
    public static void main(String[] args){
        new UpdateEmployee("");
    }
    
}

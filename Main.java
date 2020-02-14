import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener
{
    private JFrame frame1;   
    private JLabel Label = new JLabel("Select the Player to Start the Game:");
    private JRadioButton button = new JRadioButton("Human"); 
    private JRadioButton button1 = new JRadioButton("Computer");
    private JButton Button = new JButton("Done");


public Main(){
        makeFrame();   
        
    }

 public void makeFrame(){    
        frame1 = new JFrame("Make 15 Game");
   
         frame1.setLayout(null);
         frame1.add( Button );
         frame1.add(Label);
         Button.setBounds(0, 150, 400, 30);
         Label.setSize(380,20);
         Label.setLocation(90,30);
         frame1.add(button);
         frame1.add(button1);
         button.setSize(100,40);
         button.setLocation(80,70);
         button1.setSize(170,40);
         button1.setLocation(190,70);
         Button.addActionListener(this);

         frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
         frame1.setSize(400, 250);
         frame1.setVisible(true);
  }
  
  
 public void actionPerformed(ActionEvent event){
    if(event.getActionCommand().equals("Done")){
        
        Make15Game frame2 = new  Make15Game();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setVisible(false);
     }
     }
    }
 







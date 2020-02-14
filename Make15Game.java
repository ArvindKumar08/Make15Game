import java.awt.event.*; 
import javax.swing.*;
import java.util.*;
   
public class Make15Game implements ActionListener {
    private JFrame frame;
    private JButton bttn1;
    private JButton bttn2;
    private JButton bttn3;
    private JButton bttn4;
    private JButton bttn5;
    private JButton bttn6;
    private JButton bttn7;
    private JButton bttn8;
    private JButton bttn9;
    private JLabel hn;
    private JLabel cn;
    private JTextField hnText;
    private JTextField cnText;
 
    
    private JLabel humanNumbers;
    private JTextField humanNumberText;
    private JLabel computerNumbers;
    private JTextField computerNumberText;

    private List<Integer> initialList = new ArrayList<Integer>();
    
    
    private List<String> numberTakenHuman = new ArrayList<String>(); 
    private List<String> numberTakenComputer = new ArrayList<String>(); 

    
    public Make15Game() { 
        initialiseList();
        makeFrame();
    }
    
    
    // Here we make a list for the CPU to know that there is a desired number of inputs 
    //we set it from 1 to 9 since we only use those numbers
    public void initialiseList(){
        for(int i=1; i<= 9; i++){
            initialList.add(i);
        }
    }
    
    //this is the code which removes a number everytime either the COMPUTER or HUMAN clicks a number
    public void removeElementFromList(int element){
        for(int i = 0; i < initialList.size(); i++ ) {
            if (initialList.get(i) == element) {
                initialList.remove(i);
            }
        }
    }
    
    //This is where the frame has been set for the GUI
    private void makeFrame() { 
        frame = new JFrame("Make 15 Game");

        bttn1 = new JButton("1");
        bttn2 = new JButton("2");
        bttn3 = new JButton("3");
        bttn4 = new JButton("4");
        bttn5 = new JButton("5");
        bttn6 = new JButton("6");
        bttn7 = new JButton("7");
        bttn8 = new JButton("8");
        bttn9 = new JButton("9");
        hn = new JLabel("Human's Choice");
        cn = new JLabel("Computer's Choice");
        hnText = new JTextField();
        cnText = new JTextField();
        
        humanNumbers = new JLabel("you have: ");
        humanNumberText = new JTextField();
        computerNumbers = new JLabel("computer has: ");
        
        computerNumberText = new JTextField();
        
        

        frame.add( bttn1 );
        frame.add( bttn2 );
        frame.add( bttn3 );
        frame.add( bttn4 );
        frame.add( bttn5 );
        frame.add( bttn6 );
        frame.add( bttn7 );
        frame.add( bttn8 );
        frame.add( bttn9 );
        frame.add( hn );
        frame.add( cn );
        frame.add( hnText );
        frame.add( cnText );
        
        frame.add( humanNumbers );
        frame.add( humanNumberText );
        frame.add( computerNumbers );
        frame.add( computerNumberText );
        

      
        frame.setLayout(null);
        bttn1.setBounds (15, 20, 100, 30);
        bttn1.addActionListener(this);
        bttn2.setBounds (120, 20, 100, 30);
        bttn2.addActionListener(this);
        bttn3.setBounds (225, 20, 100, 30);
        bttn3.addActionListener(this);
        bttn4.setBounds (330, 20, 100, 30);
        bttn4.addActionListener(this);
        bttn5.setBounds (15, 60, 100, 30);
        bttn5.addActionListener(this);
        bttn6.setBounds (120, 60, 100, 30);
        bttn6.addActionListener(this);
        bttn7.setBounds (225, 60, 100, 30);
        bttn7.addActionListener(this);
        bttn8.setBounds (330, 60, 100, 30);
        bttn8.addActionListener(this);
        bttn9.setBounds (170, 100, 100, 30);
        bttn9.addActionListener(this);
        hn.setBounds (295, 125, 150, 30);
        cn.setBounds (295, 172, 150, 30);
        hnText.setBounds (300, 150, 100, 30);
        cnText.setBounds (300, 195, 100, 30);
        humanNumbers.setBounds      (15,150,100,30);
        humanNumberText.setBounds   (120,150,100,30);
        computerNumbers.setBounds   (15,190,100,30);
        computerNumberText.setBounds(120,190,100,30);
     

        frame.setSize(500,300); 
        frame.setVisible( true );

        hnText.addActionListener(this);
        
    }
    
    //This if where the CPU catches the clicks of the user 
    //NOTE: for this assesment, ACTION LISTENER IS VERY IMPORTANT 
    public void actionPerformed(ActionEvent evt){
        humanMove(evt);
        computerNaiveMove();
        //smartComputerMove();
    }
    
    
    //This is where the player gets to choose a number
    public void humanMove(ActionEvent evt) {
       if(evt.getSource() == bttn1){
         hnText.setText("1");
         removeElementFromList(1);
         bttn1.setEnabled(false);
         numberTakenHuman.add(bttn1.getText());
         humanNumberText.setText(getContents(numberTakenHuman));
        }
        else if (evt.getSource() == bttn2){
         hnText.setText("2");
         removeElementFromList(2);
         bttn2.setEnabled(false);
         numberTakenHuman.add(bttn2.getText());
         humanNumberText.setText(getContents(numberTakenHuman));
        }
        else if (evt.getSource() == bttn3){
         hnText.setText("3");
         removeElementFromList(3);
         bttn3.setEnabled(false);
         numberTakenHuman.add(bttn3.getText());
         humanNumberText.setText(getContents(numberTakenHuman));
        }
        else if (evt.getSource() == bttn4){
         hnText.setText("4");         
         bttn4.setEnabled(false);
         removeElementFromList(4);
         numberTakenHuman.add(bttn4.getText());
         humanNumberText.setText(getContents(numberTakenHuman));
        }
        else if (evt.getSource() == bttn5){
         hnText.setText("5");   
         removeElementFromList(5);
         bttn5.setEnabled(false);
         numberTakenHuman.add(bttn5.getText());
         humanNumberText.setText(getContents(numberTakenHuman));
        }
        else if (evt.getSource() == bttn6){
         hnText.setText("6");         
         bttn6.setEnabled(false);
         removeElementFromList(6);
         numberTakenHuman.add(bttn6.getText());
         humanNumberText.setText(getContents(numberTakenHuman));
        }
        else if (evt.getSource() == bttn7){
         hnText.setText("7");         
         bttn7.setEnabled(false);
         removeElementFromList(7);
         numberTakenHuman.add(bttn7.getText());
         humanNumberText.setText(getContents(numberTakenHuman));
        }
        else if (evt.getSource() == bttn8){
         hnText.setText("8");         
         bttn8.setEnabled(false);
         removeElementFromList(8);
         numberTakenHuman.add(bttn8.getText());
         humanNumberText.setText(getContents(numberTakenHuman));
        }
        else if (evt.getSource() == bttn9){
         hnText.setText("9");
         removeElementFromList(9);
         bttn9.setEnabled(false);
         numberTakenHuman.add(bttn9.getText());
         humanNumberText.setText(getContents(numberTakenHuman));
        }
        
        checkResult(numberTakenHuman, "Human");
    }
    
    
    //This is where the computer gets to choose a number
    public void computerNaiveMove(){
        int max = initialList.size();
        int min = 0;
        
        int cm;
        
        do {
            Random r = new Random();
            int randomIndex = r.nextInt(initialList.size());
            cm = initialList.get(randomIndex);
        } while(numberTakenHuman.contains(cm) || numberTakenComputer.contains(cm));
            
        if(cm == 1){
            bttn1.setEnabled(false);
            numberTakenComputer.add(bttn1.getText());
            removeElementFromList(1);
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 2){
            bttn2.setEnabled(false);
            numberTakenComputer.add(bttn2.getText());
            removeElementFromList(2);
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 3){
            bttn3.setEnabled(false);
            numberTakenComputer.add(bttn3.getText());
            removeElementFromList(3);
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 4){
            bttn4.setEnabled(false);
            numberTakenComputer.add(bttn4.getText());
            removeElementFromList(4);
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 5){
            bttn5.setEnabled(false);
            numberTakenComputer.add(bttn5.getText());
            removeElementFromList(5);
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 6){
            bttn6.setEnabled(false);
            numberTakenComputer.add(bttn6.getText());
            removeElementFromList(6);
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 7){
            bttn7.setEnabled(false);
            numberTakenComputer.add(bttn7.getText());
            removeElementFromList(7);
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 8){
            bttn8.setEnabled(false);
            numberTakenComputer.add(bttn8.getText());
            removeElementFromList(8);
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 9){
            bttn9.setEnabled(false);
            numberTakenComputer.add(bttn9.getText());
            removeElementFromList(9);
            computerNumberText.setText(getContents(numberTakenComputer));
        }
            
        cnText.setText(""+cm);
        checkResult(numberTakenComputer, "Computer");
        
    }
    
    //This is where the CPU catches the inputs of both human and computer
    public String getContents(List<String> hs){
        String str = "";
        for(String s : hs){
            str += s + ", "; 
        }
        return str;
    }
    
    
    //This is where winner is being checked.
    public void checkResult(List<String> hs, String who){
        int res = 0;
        if(hs.size() >= 3){
            for(int i = hs.size() - 1; i >= (hs.size() - 3); i--){  
                res += Integer.parseInt(hs.get(i));
                if(res ==15){
                    JOptionPane.showConfirmDialog(null, 
                    who + " WON!", "Continue?",JOptionPane.YES_NO_CANCEL_OPTION);
                }
            }
        }
    }
    
    
    //This is my version of "TRYING" to decode the smarter version of the computer.
    public void smartComputerMove(){
        int max = 8;
        int min = 0;
        
        int cm;
        
        do {
            Random r = new Random();
            cm = r.nextInt((max - min) + 1) + 1;
            
        } while(numberTakenHuman.contains(cm) || numberTakenComputer.contains(cm));
            
        if(cm == 1){
            bttn1.setEnabled(false);
            numberTakenComputer.add(bttn1.getText());
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 2){
            bttn2.setEnabled(false);
            numberTakenComputer.add(bttn2.getText());
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 3){
            bttn3.setEnabled(false);
            numberTakenComputer.add(bttn3.getText());
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 4){
            bttn4.setEnabled(false);
            numberTakenComputer.add(bttn4.getText());
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 5){
            bttn5.setEnabled(false);
            numberTakenComputer.add(bttn5.getText());
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 6){
            bttn6.setEnabled(false);
            numberTakenComputer.add(bttn6.getText());
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 7){
            bttn7.setEnabled(false);
            numberTakenComputer.add(bttn7.getText());
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 8){
            bttn8.setEnabled(false);
            numberTakenComputer.add(bttn8.getText());
            computerNumberText.setText(getContents(numberTakenComputer));
        }
        if(cm == 9){
            bttn9.setEnabled(false);
            numberTakenComputer.add(bttn9.getText());
            computerNumberText.setText(getContents(numberTakenComputer));
        }
            
        cnText.setText(""+cm);
        checkResult(numberTakenComputer, "Computer");
        
    
    }


    
   
    
}

    



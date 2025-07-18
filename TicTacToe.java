import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*; 
import javax.swing.*;

public class TicTacToe implements ActionListener{

    //here at the beggining we actually create the panels and stuff
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9]; //this makes an array of 9 JButtons

    boolean player1_turn;

    //this is the contructor and this is basically where we setup values
    TicTacToe(){
        //setting up the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50)); //this sets the background color of the frame\
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textField.setBackground(new Color(25,25,25)); //sets background of the textfeild
        textField.setForeground(new Color(25,255,0)); //sets the text color of the text in the textField
        textField.setFont(new Font("Ink Free", Font.BOLD,75));//sets the font of the text in textField
        textField.setHorizontalAlignment(JLabel.CENTER);  //we use setHorizontalAlignment because we are using BorderLayout
        textField.setText("Tic-TAC-TOE");
        textField.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        button_panel.setLayout(new GridLayout(3,3)); //sets 9 buttons in a grid layout
        button_panel.setBackground(new Color(150,150,150)); 

        //for loop for buttons
        for (int i = 0; i<9;i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false); //this means the buttons dont recieve keyboard functions
            buttons[i].addActionListener(this); //tells java to listen for a click from the buttons
        }

        title_panel.add(textField); //simply adds the textField we created to the panel
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        //here we check each button to see if they have been clicked. if buttons[2] was clicked than that is the only one to be affected
        for(int i =0; i<9;i++){
            if (e.getSource() == buttons[i]){ //this says hey if the button clicked is the same as buttons[i]
                if(player1_turn){
                    if(buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textField.setText("O turn");
                        check();
                    }
                }
                else{
                        if(buttons[i].getText() == ""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textField.setText("X turn");
                        check();
                        }
                }
            }
        }

    }

    public void firstTurn(){

        //allows the title "tic tac toe to show up for 2 seconds"
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }

        //random.nextInt(2) gets a random number either 0 or 1
        if(random.nextInt(2)==0){
            player1_turn = true;
            textField.setText("X Turn");
        }
        else{
            player1_turn = false;
            textField.setText("O Turn");
        }
       }

    public void check(){
        //check x win con this is gonna be alot
        if (
            (buttons[0].getText() == "X")&&
            (buttons[1].getText() == "X")&&
            (buttons[2].getText() == "X")){
            xWins(0,1,2);
            }
            if (
            (buttons[3].getText() == "X")&&
            (buttons[4].getText() == "X")&&
            (buttons[5].getText() == "X")){
            xWins(3,4,5);
            }
            if (
            (buttons[6].getText() == "X")&&
            (buttons[7].getText() == "X")&&
            (buttons[8].getText() == "X")){
            xWins(6,7,8);
            }
            if (
            (buttons[0].getText() == "X")&&
            (buttons[3].getText() == "X")&&
            (buttons[6].getText() == "X")){
            xWins(0,3,6);
            }
            if (
            (buttons[1].getText() == "X")&&
            (buttons[4].getText() == "X")&&
            (buttons[7].getText() == "X")){
            xWins(1,4,7);
            }
            if (
            (buttons[2].getText() == "X")&&
            (buttons[5].getText() == "X")&&
            (buttons[8].getText() == "X")){
            xWins(2,5,8);
            }
            if (
            (buttons[0].getText() == "X")&&
            (buttons[4].getText() == "X")&&
            (buttons[8].getText() == "X")){
            xWins(0,4,8);
            }
            if (
            (buttons[2].getText() == "X")&&
            (buttons[4].getText() == "X")&&
            (buttons[6].getText() == "X")){
            xWins(2,4,6);
            }

        //check o win con
         if (
            (buttons[0].getText() == "O")&&
            (buttons[1].getText() == "O")&&
            (buttons[2].getText() == "O")){
            oWins(0,1,2);
            }
            if (
            (buttons[3].getText() == "O")&&
            (buttons[4].getText() == "O")&&
            (buttons[5].getText() == "O")){
            oWins(3,4,5);
            }
            if (
            (buttons[6].getText() == "O")&&
            (buttons[7].getText() == "O")&&
            (buttons[8].getText() == "O")){
            oWins(6,7,8);
            }
            if (
            (buttons[0].getText() == "O")&&
            (buttons[3].getText() == "O")&&
            (buttons[6].getText() == "O")){
            oWins(0,3,6);
            }
            if (
            (buttons[1].getText() == "O")&&
            (buttons[4].getText() == "O")&&
            (buttons[7].getText() == "O")){
            oWins(1,4,7);
            }
            if (
            (buttons[2].getText() == "O")&&
            (buttons[5].getText() == "O")&&
            (buttons[8].getText() == "O")){
            oWins(2,5,8);
            }
            if (
            (buttons[0].getText() == "O")&&
            (buttons[4].getText() == "O")&&
            (buttons[8].getText() == "O")){
            oWins(0,4,8);
            }
            if (
            (buttons[2].getText() == "O")&&
            (buttons[4].getText() == "O")&&
            (buttons[6].getText() == "O")){
            oWins(2,4,6);
            }

    }

    public void xWins(int a, int b, int c){
        buttons[a].setBackground(new Color(0,255,0));
        buttons[b].setBackground(new Color(0,255,0));
        buttons[c].setBackground(new Color(0,255,0));

        for (int i  = 0; i<9;i++){
            buttons[i].setEnabled(false);
        }        
        textField.setText("X Wins");
        
    }

    public void oWins(int a, int b, int c){

          buttons[a].setBackground(new Color(0,255,0));
        buttons[b].setBackground(new Color(0,255,0));
        buttons[c].setBackground(new Color(0,255,0));

        for (int i  = 0; i<9;i++){
            buttons[i].setEnabled(false);
        }        
        textField.setText("O Wins");
        
    }

    }


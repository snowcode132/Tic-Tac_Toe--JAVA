import javax.swing.*;
public class Main{

    public static void main(String[] args){

        ImageIcon icon =  new ImageIcon("Circle.jpeg");
        JLabel label = new JLabel(icon);
        label.setBounds(50, 50, icon.getIconWidth(), icon.getIconHeight());


        //*******************************************************/
        //top left button
        JButton one_one = new JButton(); //makes button
        one_one.setBounds(100,100,250,100);
        one_one.addActionListener(r ->{
            one_one.setVisible(false);  //sets the button to dissapear when clicked
        });
       
        //top middle button
        JButton one_two = new JButton();
        one_two.setBounds(350,100,250,100);
        one_two.addActionListener(r ->{
            one_two.setVisible(false);
        });
        
        //top right button
         JButton one_three = new JButton();
        one_three.setBounds(600,100,250,100);
        //top left button
        one_three.addActionListener(r ->{
            one_three.setVisible(false);
        });

        JButton two_one = new JButton();
        two_one.setBounds(100,200,250,100);
        two_one.addActionListener(r ->{
            two_one.setVisible(false);
        });

       
        //top middle button
        JButton two_two = new JButton();
        two_two.setBounds(350,200,250,100);
        two_two.addActionListener(r ->{
            two_two.setVisible(false);
        });
        
        //top right button
         JButton two_three = new JButton();
        two_three.setBounds(600,200,250,100);
        two_three.addActionListener(r ->{
            two_three.setVisible(false);
        });

        JButton three_one = new JButton();
        three_one.setBounds(100,300,250,100);
        three_one.addActionListener(r ->{
            three_one.setVisible(false);
        });
       
        //top middle button
        JButton three_two = new JButton();
        three_two.setBounds(350,300,250,100);
        three_two.addActionListener(r ->{
            three_two.setVisible(false);
        });
        
        //top right button
        JButton three_three = new JButton();
        three_three.setBounds(600,300,250,100);
        three_three.addActionListener(r ->{
            three_three.setVisible(false);
        });
        //**********************************************/
        
        //making the window
        JFrame frame = new JFrame();
        frame.setTitle("Tic-Tac-Toe");
        frame.setSize(1000,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(null); //allows us to see the button 
        frame.setVisible(true);
        frame.add(one_one);
        frame.add(one_two);
        frame.add(one_three);
        frame.add(two_one);
        frame.add(two_two);
        frame.add(two_three);
        frame.add(three_one);
        frame.add(three_two);
        frame.add(three_three);

        frame.add(label);
        }


}
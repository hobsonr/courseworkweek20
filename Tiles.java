// packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// event handler class
public class Tiles implements ActionListener
{
  JButton button[] = new JButton[12];

  public Tiles()
  {
    int b; 

    // setting JFrame
    JFrame a = new JFrame();
    a.setTitle("Swingin' Simpsons");
    a.setSize(450,370);
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // adding panel to add content
    JPanel panel = new JPanel();
    a.setContentPane(panel);

    // grid layout
    GridLayout layout = new GridLayout(3,4);
    panel.setLayout(layout);

    // images as jbuttons in an array
    for (b=0; b<12; b++){
      ImageIcon i = new ImageIcon("bart"+b+".jpg");
      button[b] = new JButton(i);
      panel.add(button[b]);
      button[b].addActionListener(this);
      }

    a.setVisible(true); 
    }

    // invoked when action occurs - identify which button has been clicked
    int blankTile = 0;

    public void actionPerformed(ActionEvent click){
      for (int b=0; b<12; b++){
        //public checkButton();
        //if (checkButton = true) && 
        if (click.getSource() == button[b]){
          //int temp;
          //System.out.println("Clicked:"+b); test for buttons
          button[b].getIcon();
          button[blankTile].getIcon();
          button[blankTile].setIcon(button[b].getIcon());
          button[b].setIcon(button[blankTile].getIcon());
          blankTile = b;
          //b = blankTile;
      }
    }

    // validation
    //public boolean checkButton{
    //if (c == e+1) || (c == e-1) || (c == e+4) || (c == e-4){
      //checkButton = true;
    //}  
  }
}



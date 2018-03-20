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

    public void actionPerformed(ActionEvent click){
      ImageIcon temp;
      int blankTile = 0;

      for (int b=0; b<12; b++){
        if (click.getSource() == button[b]){
          //if(((ImageIcon)button[b].getIcon()).toString().equals("bart0.jpg")){
            //blankTile = b;
      //}       
            //System.out.println("Clicked:"+b); test for buttons
            temp = (ImageIcon)button[b].getIcon();
            button[blankTile].setIcon(button[b].getIcon());
            button[b].setIcon(button[blankTile].getIcon());
            button[blankTile].setIcon(temp);
            button[blankTile] = button[b];
      }
    } 
  }
}



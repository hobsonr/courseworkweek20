// packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
*Tiles implements the ActionListener within the JButtons
*Tiles also defines the array of JButtons from 0 to 11
*an array of imageicons has also been created
*When "click" is clicked, the image swaps with blankTile
**/

public class Tiles implements ActionListener
{
  JButton button[] = new JButton[12];
  ImageIcon icon[] = new ImageIcon[12];
  int temp = 0;
  int blankTile = 0;

  /**
  *Tiles class creates a new GUI 
  *Tiles is a constructor which is called in the main method
  *JFrame creates a new window, setTitle sets the title, setSize sets the size
  *default close operation closes the window when it is exited
  *JPanel enables you to add content to the JFrame
  *GridLayout sets the layout to a 3x4 grid
  *the for loop creates an array of buttons to which image icons are added
  *an action listener is added to each button in the array to make them clickable
  **/

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

    // create an array of JButtons and an array of icons
    for (b=0; b<12; b++){
      icon[b] = (new ImageIcon("bart"+b+".jpg"));
      button[b] = new JButton();
      panel.add(button[b]);
      button[b].setIcon(icon[b]);
      button[b].addActionListener(this);
      }

    a.setVisible(true); 
    }

    /**
    * actionperformed is function performed when buttons are clicked
    * button b is clicked button
    * location of the button clicked is stored - position in the array
    * puts the icon on the corrosponding image on the blank tile
    **/
    public void actionPerformed(ActionEvent click)
    {
      for (int b=0; b<12; b++)
      {
        if ((click.getSource() == button[b]) &&         
        (b == blankTile+1 || b == blankTile-1 || b == blankTile+4 || b == blankTile-4)){
          if ((b == 3 && blankTile == 4) || (b == 4 && blankTile == 3) ||
             (b == 7 && blankTile == 8) || (b == 8 && blankTile == 7)){
             System.out.println("wrong move");}
          else{
            for (int location=0; location<12; location++)
            {
              if(button[b].getIcon() == icon[location])
              {
                temp = location;
            }
          }
          button[b].setIcon(icon[0]);
          button[blankTile].setIcon(icon[temp]);
          blankTile = b;        
        }
      } 
    }
  }
}




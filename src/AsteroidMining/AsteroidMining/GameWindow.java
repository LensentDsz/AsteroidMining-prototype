package AsteroidMining.AsteroidMining;

import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Graphics;


public class GameWindow {
    protected GUIWindow gui=null;
    public LinkedList<JButton> buttons = new LinkedList<JButton>();
    protected boolean initialize =false;
    private int locationx=20;
    private int locationy=20;
    protected JLabel label_bg;
    protected Container c=null;
    ImageIcon asteroid = new ImageIcon("D:/A-Learning/Soft Project Lab/PrototypeProgram/AsteroidMining/Img/asteroid.png");
    GameWindow(GUIWindow gui)
    {
        this.gui =gui;

    }

    public void draw(Graphics g)
    {
        if(initialize==false)
        {
            BuildGameWindow();
            
            for(int i=0;i<buttons.size();i++)
            {
                
            }
        }
    }

    private void BuildGameWindow()
    {
            for(int i=0;i<30;i++)
            {
                JButton b = new JButton();
               
                b.setIcon(asteroid);
                buttons.add(b);
            }
            for(int j=0;j<4;j++)
            {
                for(int i=0;i<5;i++)
                {
                    buttons.get(i).setBounds(locationx,locationy,20,20);
                    locationx+=40;
                }
                locationy+=30;
            }
           
           
    }
}

package AsteroidMining.AsteroidMining;

import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Graphics;


public class GameWindow {
    protected GUIWindow gui=null;
    public LinkedList<JButton> buttons = new LinkedList<JButton>();
    protected boolean initialize =false;
    ImageIcon pic1 = new ImageIcon("D:/A-Learning/Soft Project Lab/PrototypeProgram/AsteroidMining/Img/gamebg.png");
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

    }
}

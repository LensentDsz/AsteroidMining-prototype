package AsteroidMining.AsteroidMining;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUIWindow extends JFrame
{
    public final static int F_W=800,F_H=600;
    protected Image offscreen = null;
    protected boolean w_menu=true,w_select=false,w_game=false,w_win=false,w_end=false,initialize=false;
    Thread paintThread=null;
    JButton b_start = null,b_end=null, b_single=null,b_multi=null;
    JLabel titleLabel=null, bgLabel=null,gameLabel=null,gameoverLabel=null,winLabel=null;
    StartWindow start=new StartWindow(this);
    Graphics offscreen_g=null;
    ImageIcon pic1 = new ImageIcon("D:/A-Learning/Soft Project Lab/PrototypeProgram/AsteroidMining/Img/menubg.png");
    ArrayList<Settler> settler=new ArrayList<Settler>();
    GUIWindow()
    {
        super();
        this.setBounds(0,0,F_W,F_H);
        this.setVisible(true);
        this.setResizable(false);
        this.addWindowListener(new MyWindowListener());
        this.setLayout(null);
        this.setBackground(Color.white);
    }

    public void paint(Graphics g)
    {
        if(initialize==false)
        {
            if(offscreen==null)
            {
                offscreen=this.createImage(F_W,F_H);
            }
            offscreen_g=offscreen.getGraphics();
            initialize=true;
        }
        if(settler.size()==0&&w_game==true)
        {
            w_end=true;
            w_game=false;
        }
        if(w_menu==true)
        {
            start.draw(offscreen_g);
            bgLabel.setIcon(pic1);
           
        }
        else if(w_menu==false){
            b_start.setVisible(false);
            b_end.setVisible(false);
            titleLabel.setVisible(false);
        }
        if(w_game==true)
        {
            gameLabel.setVisible(true);
        }
        g.drawImage(offscreen, 0, 0, null);
    }

    public void launchFrame ()
	{
		this.setTitle("Asteroid Mining");
		
		paintThread = new Thread(new PaintThread());
		paintThread.start();
		
		this.addMouseListener(new MyMouseListener());
	}
    
    private class MyMouseListener implements MouseListener
	{

		public void mouseClicked(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
		
	}
	
    
	private class PaintThread implements Runnable
	{
		public void run()
		{
			while(true)
			{
				repaint();
				try {
					Thread.sleep(49);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
    public static void main(String args[])
	{
		GUIWindow gui = new GUIWindow();
        
        //
		//gui.launchFrame();
	}
}
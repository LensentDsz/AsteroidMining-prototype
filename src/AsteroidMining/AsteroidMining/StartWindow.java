package AsteroidMining.AsteroidMining;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
public class StartWindow {
    protected GUIWindow gui;
    protected boolean initialize=false;
    protected JButton b_start=null,b_end=null;
    protected JLabel title=null;
    protected static Image []imgs=null;
    protected JLabel label_bg=null,label_title=null;
    
    protected Container c = null;
    protected static Toolkit tk =Toolkit.getDefaultToolkit();
    ImageIcon pic1 = new ImageIcon("D:/A-Learning/Soft Project Lab/PrototypeProgram/AsteroidMining/Img/menubg.png");
    
    StartWindow(GUIWindow gui)
    {
        this.gui=gui;
    }

    public void draw(Graphics g)
    {
        if(initialize==true)
        {
            if(gui.w_menu==true)
            {
                b_end.setVisible(true);
                b_start.setVisible(true);
                label_bg.setVisible(true);
            }
        }
        if(initialize==false)
        {
           c=gui.getContentPane();

            label_title=new JLabel("Asteroid Mining");
            label_title.setBounds(180, 140, 500, 80);
            label_title.setForeground(Color.red);
            Font f=new Font("Lucida Calligraphy",Font.BOLD,50);
            label_title.setFont(f);
            
           label_bg=new JLabel(pic1);
           label_bg.setBounds(0,0,800,600);
           label_bg.setForeground(Color.white);
           label_bg.setVisible(true);
           label_bg.setOpaque(false);
           c.add(label_bg);
           gui.bgLabel=this.label_bg;
           gui.getContentPane().add(label_bg, null);
           label_bg.add(label_title);
            b_start=new JButton("Start");
            b_start.setBounds(300,280,244,35);
            b_start.setForeground(Color.white);
           
            b_start.addActionListener(new ButtonListener(this));
			b_start.setContentAreaFilled(false);
			label_bg.add(b_start);

            gui.b_start=this.b_start;
			b_end= new JButton("Exit");
			b_end.setBounds(300,330,244,35);
            b_end.setForeground(Color.white);
			b_end.addActionListener(new ButtonListener(this));
			b_end.setContentAreaFilled(false);
			label_bg.add(b_end);


            b_end.setVisible(true);
            b_start.setVisible(true);
            label_bg.setVisible(true);
        }
    }




    private class ButtonListener implements ActionListener
	{

		GUIWindow gui =null;
 		StartWindow menu = null;
		ButtonListener(StartWindow menu)
		{
			this.menu=menu;
			this.gui=menu.gui;
		}
		public void actionPerformed(ActionEvent e) 
		{
         
			if(e.getSource()==menu.b_start)
			{
				gui.w_menu=false;
				gui.w_game=true;
				gui.setFocusable(true);
                System.out.println("start");
                b_start.setText("click");

			}
			else if(e.getSource()==menu.b_end)
			{
				System.exit(0);
                System.out.println("exit");
			}
        }
		
	}
}

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;


public class GUI implements ActionListener,ItemListener{
	static JCheckBox colorChkBox[] = new JCheckBox[5];
	static JPanel[] panels = new JPanel[5];
	public static void main(String args[])throws Exception{
		JFrame jf = new JFrame(); 
		
		JButton[] colorBtn = new JButton[5];
		
		int windowWidth = 900;
		int windowHeight = 600;	
		Toolkit tkit = jf.getToolkit();
		Dimension wSize = tkit.getScreenSize();
		jf.setBounds(0,0,wSize.width,wSize.height);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("Frame One");
		jf.setVisible(true);
		jf.getContentPane().setForeground(Color.PINK);
		
		Dimension d = new Dimension(200,200);
		jf.setMinimumSize(d);
		jf.setPreferredSize(d);
		
		createPanels(jf,d,panels);
		createButton(colorBtn,panels[2]);
		createCheckBox(colorChkBox,panels);
	}
	
	public static void createPanels(JFrame jf,Dimension d,JPanel[] panels){
		
		for(int panel=0 ; panel < 5 ; panel++){
			panels[panel] = new JPanel();
			panels[panel].setPreferredSize(d);
			panels[panel].setBackground(Color.WHITE);
			panels[panel].setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		}
		
		jf.add(panels[0],BorderLayout.CENTER);
		jf.add(panels[1],BorderLayout.EAST);
		jf.add(panels[2],BorderLayout.WEST);
		jf.add(panels[3],BorderLayout.NORTH);
		jf.add(panels[4],BorderLayout.SOUTH);
		
	}
	
	public static void createButton(JButton[] colorBtn,JPanel panel){
		for(int btn=0 ; btn<5 ; btn++)
		{
			colorBtn[btn] = new JButton();
			panel.add(colorBtn[btn]);
			colorBtn[btn].setPreferredSize(new Dimension(110, 30));
			colorBtn[btn].addActionListener(new GUI());
		}
		   
		colorBtn[0].setText("PINK");
		colorBtn[0].setName("PINK");
		colorBtn[1].setText("YELLOW");
		colorBtn[1].setName("YELLOW");
		colorBtn[2].setText("GREEN");
		colorBtn[2].setName("GREEN");
		colorBtn[3].setText("CYAN");
		colorBtn[3].setName("CYAN");
		colorBtn[4].setText("BLUE");
		colorBtn[4].setName("BLUE");  
		   
	}
	
	public static void createCheckBox(JCheckBox[] colorChkBox,JPanel[] panels){
		for(int box=0 ; box < 5 ; box++){
			colorChkBox[box] = new JCheckBox();
			panels[box].add(colorChkBox[box]);
			colorChkBox[box].setPreferredSize(new Dimension(150, 50));
			colorChkBox[box].addItemListener(new GUI());
		}
		
		colorChkBox[0].setText("CENTER");
		colorChkBox[1].setText("EAST");
		colorChkBox[2].setText("WEST");
		colorChkBox[3].setText("NORTH");
		colorChkBox[4].setText("SOUTH");
		
	}
	
	public void actionPerformed(ActionEvent event){
		JButton jBtn = (JButton)event.getSource();
		Color color = null;
		if(jBtn.getName().equals("PINK")){
			panels[0].setBackground(Color.PINK);
		}
		else if(jBtn.getName().equals("YELLOW")){
			panels[0].setBackground(Color.YELLOW);
		}
		else if(jBtn.getName().equals("GREEN")){
			panels[0].setBackground(Color.GREEN);
		}
		else if(jBtn.getName().equals("CYAN")){
			panels[0].setBackground(Color.CYAN);
		}
		else{
			panels[0].setBackground(Color.BLUE);
		}		
	}
	
	public void itemStateChanged(ItemEvent e){
		JComponent obj = (JComponent) e.getSource();
		
		if(obj == colorChkBox[0]){
			if(colorChkBox[0].isSelected()){
				panels[0].setBackground(Color.PINK);
			}
			else
				panels[0].setBackground(Color.WHITE);
			
		}
		else if(obj == colorChkBox[1]){
			if(colorChkBox[1].isSelected()){
				panels[1].setBackground(Color.YELLOW);
			}
			else
				panels[1].setBackground(Color.WHITE);
		}
		else if(obj == colorChkBox[2]){
			if(colorChkBox[2].isSelected()){
				panels[2].setBackground(Color.GREEN);
			}
			else
				panels[2].setBackground(Color.WHITE);
		}
		else if(obj == colorChkBox[3]){
			if(colorChkBox[3].isSelected()){
				panels[3].setBackground(Color.CYAN);
			}
			else
				panels[3].setBackground(Color.WHITE);
		}
		else{
			if(colorChkBox[4].isSelected()){
				panels[4].setBackground(Color.BLUE);
			}
			else
				panels[4].setBackground(Color.WHITE);
		}
	}
	
}


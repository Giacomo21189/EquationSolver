package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Finestra extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel panel=new Panel();  
//	private ProxyEquation proxy= new ProxyEquation();
	
	public Finestra() {
		setTitle("Risolutore di equazioni");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 300);
		setResizable(false);
		
		
		this.add(panel);
		this.setJMenuBar(createJMenuBar()); 
		
		setVisible(true);
	}


	private JMenuBar createJMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		populateJMenuBar(menuBar);
		this.setJMenuBar(menuBar);
		return menuBar;
	}

	private void populateJMenuBar(JMenuBar menuBar) {
		JMenu eqAlg = new JMenu("Algebraic Equations");
		menuBar.add(eqAlg);
		JMenu eqTrig = new JMenu("Trigonometric Equations");
		menuBar.add(eqTrig); 
		
		
		JMenuItem firstGr = new JMenuItem("First Grade");
//		firstGr.setText("First Grade");
//		firstGr.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				proxy.setGenEq(new FirstGradeEquation());
//			}
//		});
		eqAlg.add(firstGr);
		JMenuItem secondGr = new JMenuItem("Second Grade");
		eqAlg.add(secondGr); 
		JMenuItem thirdGr = new JMenuItem("Third Grade");
		eqAlg.add(thirdGr);
		JMenuItem fourthGr = new JMenuItem("Fourth Grade");
		eqAlg.add(fourthGr);
		
		JMenuItem sinus= new JMenuItem("Fundamental on sinus"); 
		eqTrig.add(sinus); 
		JMenuItem cosinus= new JMenuItem("Fundamental on cosinus"); 
		eqTrig.add(cosinus);

	} 
	
	

}

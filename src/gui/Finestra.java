package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.FirstGradeEquation;
import model.ObservableEquation;
import model.SecondGradeEquation;

public class Finestra extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private ObservableEquation obsEq= new ObservableEquation();
	private JTextField TxtinsParam= new JTextField();
	
	private JPanel panel=new Panel(obsEq, TxtinsParam);  
	
	
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
		firstGr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				obsEq.setIequation(new FirstGradeEquation());
			}
		});
		;
		eqAlg.add(firstGr);
		JMenuItem secondGr = new JMenuItem("Second Grade");
		secondGr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				obsEq.setIequation(new SecondGradeEquation());
				
			}
		});
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

package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import model.FirstGradeEquation;
import model.ObservableEquation;
import model.SecondGradeEquation;

public class Finestra extends JFrame {

	private static final long serialVersionUID = 1L; 
	private ObservableEquation obsEq=new ObservableEquation(new FirstGradeEquation());
	private Panel panel=new Panel(obsEq);

	

	public Finestra() {
		setTitle("Risolutore di equazioni");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 300);
		setResizable(false);
		
		
		this.setContentPane(panel);
		this.setJMenuBar(createJMenuBar());

		setVisible(true);
	}

	private JMenuBar createJMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		this.populateJMenuBar(menuBar);
		this.setJMenuBar(menuBar);
		return menuBar;
	}

	private void populateJMenuBar(JMenuBar menuBar) {
		JMenu menuEqAlg = new JMenu("Algebraic Equations");
		menuBar.add(menuEqAlg);
		JMenu menuEqTrig = new JMenu("Trigonometric Equations");
		menuBar.add(menuEqTrig); 
		
		GenericMenuIt menuItFirstGr= new GenericMenuIt("First Grade", obsEq, panel, new FirstGradeEquation());
		menuEqAlg.add(menuItFirstGr);
		
		GenericMenuIt MenuItsecondGr = new GenericMenuIt("Second Grade", obsEq, panel, new SecondGradeEquation());
		menuEqAlg.add(MenuItsecondGr);
		
		JMenuItem thirdGr = new JMenuItem("Third Grade");
		menuEqAlg.add(thirdGr);
		JMenuItem fourthGr = new JMenuItem("Fourth Grade");
		menuEqAlg.add(fourthGr);
		
		JMenuItem sinus= new JMenuItem("Fundamental on sinus"); 
		menuEqTrig.add(sinus); 
		JMenuItem cosinus= new JMenuItem("Fundamental on cosinus"); 
		menuEqTrig.add(cosinus);

	}}

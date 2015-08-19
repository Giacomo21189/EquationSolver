package gui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import model.FirstGradeEquation;
import model.FourthGradeEquation;
import model.ObservableEquation;
import model.SecondGradeEquation;
import model.ThirdGradeEquation;
import control.GenericMenuIt;

public class Finestra extends JFrame {

	private static final long serialVersionUID = 1L; 

	
	private ObservableEquation obseq= new ObservableEquation();
	private Panel panel=new Panel(obseq);

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
		
		GenericMenuIt menuItFirstGr= new GenericMenuIt("First Grade", obseq, new FirstGradeEquation());
		menuEqAlg.add(menuItFirstGr);
		
		GenericMenuIt menuItsecondGr= new GenericMenuIt("Second Grade", obseq, new SecondGradeEquation());
		menuEqAlg.add(menuItsecondGr);
		
		GenericMenuIt thirdGr = new GenericMenuIt("Third Grade", obseq, new ThirdGradeEquation());
//		JMenu radiobuttonMenu = new JMenu();
//		thirdGr.add(radiobuttonMenu);
//		ButtonGroup group1 = new ButtonGroup();
//		JRadioButtonMenuItem newton = new JRadioButtonMenuItem("Metodo di Newton");
//		group1.add(newton);
//		JRadioButtonMenuItem algebric = new JRadioButtonMenuItem("Metodo Algebrico");
//		group1.add(algebric); 
		
		menuEqAlg.add(thirdGr);
		
		GenericMenuIt fourthGr= new GenericMenuIt("Fourth Grade", obseq, new FourthGradeEquation()); 
//		JMenu radiobuttonMenu = new JMenu();
//		fourthGr.add(radiobuttonMenu);
//		ButtonGroup group2 = new ButtonGroup();
//		JRadioButtonMenuItem newton2 = new JRadioButtonMenuItem("Metodo di Newton");
//		group2.add(newton2);
//		JRadioButtonMenuItem algebric2 = new JRadioButtonMenuItem("Metodo Algebrico");
//		group2.add(algebric2); 
		
		menuEqAlg.add(fourthGr);
		
		JMenuItem sinus= new JMenuItem("Fundamental on sinus"); 
		menuEqTrig.add(sinus); 
		JMenuItem cosinus= new JMenuItem("Fundamental on cosinus"); 
		menuEqTrig.add(cosinus);

	}}

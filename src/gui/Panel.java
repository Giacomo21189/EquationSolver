package gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.ObservableEquation;
import view.FirstGradeView;
import control.EquationSolver;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;


	public Panel(ObservableEquation eq, JTextField TxtinsParam) {
		
		this.setLayout(new GridLayout(4, 1));

		createDescriptPanel(eq);
		createInsPanel(TxtinsParam);
		createControlPanel(eq,TxtinsParam);
		createSolutionPanel(eq);
		this.setVisible(true);
	}

	private void createDescriptPanel(ObservableEquation eq) {
		JPanel descriptPanel = new JPanel();
		descriptPanel.setLayout(new GridLayout(1, 2));
		JLabel LblEquation = new JLabel("Equation: ");
		descriptPanel.add(LblEquation);
		JLabel LblForm = new JLabel(eq.getForm());
		descriptPanel.add(LblForm);
		this.add(descriptPanel);
	}

	private void createInsPanel(JTextField TxtinsParam) {
		JPanel insPanel = new JPanel();
		insPanel.setLayout(new GridLayout(2, 1));
		JLabel lbl= new JLabel("Parameters: ");
		insPanel.add(lbl);
		JPanel subInsPanel= new JPanel(); 
		subInsPanel.setLayout(new GridLayout(1,2));
		subInsPanel.add(TxtinsParam);
		JLabel lblDescription=new JLabel("Inserire il valore dei parametri spaziati da un punto e virgola ';' "); 
		JScrollPane scrollPanel = new JScrollPane(lblDescription);
		subInsPanel.add(scrollPanel);
		insPanel.add(subInsPanel);
		this.add(insPanel);
	}

	private void createControlPanel(ObservableEquation eq, JTextField TxtinsParam) {
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(1, 1));
		EquationSolver btnSolve = new EquationSolver(eq, TxtinsParam);
		controlPanel.add(btnSolve);
		this.add(controlPanel);
	}

	private void createSolutionPanel(ObservableEquation eq) {
		JPanel solutionPanel = new JPanel();
		solutionPanel.setLayout(new GridLayout(2, 1));
		JLabel lblsolution = new JLabel("Solutions: ");
		solutionPanel.add(lblsolution);
		FirstGradeView viewFirstGr = new FirstGradeView(eq);
		solutionPanel.add(viewFirstGr);
		this.add(solutionPanel);
	}

}

package gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import view.FirstGradeView;
import model.FirstGradeEquation;
import control.FirstGradeControl;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	private FirstGradeEquation firstGrdEq = new FirstGradeEquation();
	private JTextField TxtinsParam = new JTextField("");

	public Panel() {

		this.setLayout(new GridLayout(4, 1));

		createDescriptPanel(firstGrdEq);
		createInsPanel();
		createControlPanel();
		createSolutionPanel();
		this.setVisible(true);
	}

	private void createDescriptPanel(FirstGradeEquation firstGrdEq) {
		JPanel descriptPanel = new JPanel();
		descriptPanel.setLayout(new GridLayout(1, 2));
		JLabel LblEquation = new JLabel("Equation: ");
		descriptPanel.add(LblEquation);
		JLabel LblForm = new JLabel(firstGrdEq.getForm());
		descriptPanel.add(LblForm);
		this.add(descriptPanel);
	}

	private void createInsPanel() {
		JPanel insPanel = new JPanel();
		insPanel.setLayout(new GridLayout(2, 1));
		JLabel lbl= new JLabel("Parameters: ");
		insPanel.add(lbl);
		JPanel subInsPanel= new JPanel(); 
		subInsPanel.setLayout(new GridLayout(1,2));
		subInsPanel.add(TxtinsParam);
		JLabel lblDescription=new JLabel("Inserire il valore dei parametri da inserire spaziati da un punto e virgola ';' "); 
		JScrollPane scrollPanel = new JScrollPane(lblDescription);
		subInsPanel.add(scrollPanel);
		insPanel.add(subInsPanel);
		this.add(insPanel);
	}

	private void createControlPanel() {
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(1, 1));
		FirstGradeControl btnSolve = new FirstGradeControl(this.firstGrdEq, this.TxtinsParam);
		controlPanel.add(btnSolve);
		this.add(controlPanel);
	}

	private void createSolutionPanel() {
		JPanel solutionPanel = new JPanel();
		solutionPanel.setLayout(new GridLayout(2, 1));
		JLabel lblsolution = new JLabel("Solutions: ");
		solutionPanel.add(lblsolution);
		FirstGradeView viewFirstGr = new FirstGradeView(firstGrdEq);
		solutionPanel.add(viewFirstGr);
		this.add(solutionPanel);
	}

}

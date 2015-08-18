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
	private JTextField TxtinsParam= new JTextField();
	
	
	public Panel(ObservableEquation eq) {
		
		this.setLayout(new GridLayout(4, 1));

		createDescriptPanel(eq);
		createInsPanel(TxtinsParam);
		createControlPanel(eq,TxtinsParam);
		createSolutionPanel(eq);
		this.setVisible(true);
	}

	public void createDescriptPanel(ObservableEquation eq) {
		JPanel descriptPanel = new JPanel();
		descriptPanel.setLayout(new GridLayout(1, 2));
		JLabel lblEquation = new JLabel("Equation: ");
		descriptPanel.add(lblEquation);
		JLabel lblForm = new JLabel(""+ eq.getForm());
		descriptPanel.add(lblForm);
		this.add(descriptPanel);
	}

	private void createInsPanel(JTextField txtinsParam) {
		JPanel insPanel = new JPanel();
		insPanel.setLayout(new GridLayout(2, 1));
		JLabel lbl= new JLabel("Parameters: ");
		insPanel.add(lbl);
		JPanel subInsPanel= new JPanel(); 
		subInsPanel.setLayout(new GridLayout(1,2));
		subInsPanel.add(txtinsParam);
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

	public void createSolutionPanel(ObservableEquation eq) {
		JPanel solutionPanel = new JPanel();
		solutionPanel.setLayout(new GridLayout(2, 1));
		JLabel lblsolution = new JLabel("Solutions: ");
		solutionPanel.add(lblsolution);
		FirstGradeView viewFirstGr = new FirstGradeView(eq);
		solutionPanel.add(viewFirstGr);
		this.add(solutionPanel);
	}

}

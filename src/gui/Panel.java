package gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import model.ObservableEquation;
import view.DescriptPanel;
import view.LblView;
import control.EquationSolver;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JTextField TxtinsParam= new JTextField();

	public Panel(ObservableEquation obsEq) {
		
		this.setLayout(new GridLayout(4, 1));
		this.createDescriptPanel(obsEq);
		this.createInsPanel(TxtinsParam);
		this.createControlPanel(obsEq,TxtinsParam);
		this.createSolutionPanel(obsEq);
		this.setVisible(true);
	}
	
	
	private void createDescriptPanel(ObservableEquation obs) {
		DescriptPanel descriptPanel = new DescriptPanel(obs);
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

	private void createSolutionPanel(ObservableEquation eq) {

		JPanel solutionPanel= new JPanel();
		solutionPanel.setLayout(new GridLayout(2,1));
		JLabel lblSolutions= new JLabel("Solutions: "); 
		solutionPanel.add(lblSolutions); 
		LblView lblView= new LblView(eq);
		solutionPanel.add(lblView);
		this.add(solutionPanel);
	}

}

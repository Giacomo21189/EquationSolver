package view;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ObservableEquation;

public class DescriptPanel extends JPanel implements Observer {

	private static final long serialVersionUID = 1L;
	private ObservableEquation oe;
	private JLabel lblForm = new JLabel("");

	public DescriptPanel(ObservableEquation oe) {
		this.oe = oe;
		oe.addObserver(this);
		this.setLayout(new GridLayout(1, 2));
		JLabel lblEquation = new JLabel("Equation: ");
		this.add(lblEquation);
		this.add(lblForm);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		lblForm.setText("" + oe.getForm());
	}

}

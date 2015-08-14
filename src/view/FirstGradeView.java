package view;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

import model.FirstGradeEquation;

public class FirstGradeView extends JLabel implements Observer {

	private static final long serialVersionUID = 1L;

	private FirstGradeEquation eq = new FirstGradeEquation();

	public FirstGradeView(FirstGradeEquation eq) {
		this.eq = eq;
		eq.addObserver(this);
		this.setLayout(new GridLayout(2, 1));
		JLabel solution = new JLabel();
		this.add(solution);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
			this.setText(eq.toString());
		}
		
	
	
	//public qualcosa qualcosa (qualcosa) {}	// mi servirebbe qualcosa che "stringhizza" un vettore di float
		

	}


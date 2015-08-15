package view;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

import model.ObservableEquation;

public class FirstGradeView extends JLabel implements Observer {

	private static final long serialVersionUID = 1L;

	private ObservableEquation eq;

	public FirstGradeView(ObservableEquation eq) {
		eq.addObserver(this);
		this.eq = eq;
		this.setLayout(new GridLayout(2, 1));
		JLabel solution = new JLabel();
		this.add(solution);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		this.setText(parseVectToString(eq.getSolutions()));
		}
		
	
	
	public String parseVectToString (float[] v) {
		
		String s="";
		
		for (int i = 0; i < v.length-1; i++) {
			s+=v[i]+";";
		}
		return s;
		};
	}
		

package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;

import model.ObservableEquation;
import model.Utils;

public class LblView extends JLabel implements Observer{


	private static final long serialVersionUID = 1L;
	private ObservableEquation obsEq;

	public LblView(ObservableEquation obsEq) {
		this.obsEq=obsEq;
		obsEq.addObserver(this);
		
	}
	@Override
	public void update(Observable arg0, Object arg1){
		Utils util= new Utils();
		this.setText(util.parseVectToString(obsEq.getSolutions()));
		
	}
	
	
}

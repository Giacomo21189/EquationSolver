package model;

import java.util.Observable;

import javax.swing.JOptionPane;

public class FirstGradeEquation extends Observable implements IEquation {

	private float a;
	private float b;
	private float solution;
	private static final String form = "ax+b=0";

	public void setParameters(float... p) {

		checkCorrectParamsValue(p);
	}

	private void checkCorrectParamsValue(float... p) {
		switch (p.length) {
		case 0:
			JOptionPane.showMessageDialog(null,"Valore inserito non valido: non è stato inserito alcun parametro!",
							"Attenzione!", 0);
			break;
		case 2:

			if (p[0] != 0) {
				a = p[0];
				b = p[1];
				setChanged();
				notifyObservers();
			} else {
				JOptionPane.showMessageDialog(
								null,
								"Valore inserito non valido: se a=0 non è un'equazione di primo grado!",
								"Attenzione!", 0);}
			break;
		default:
				JOptionPane.showMessageDialog(null,
						"Numero di parametri inseriti non valido!", "Attenzione!",
						0);}};

	@Override
	public String getForm() {
		return form;
	}

	@Override
	public void setSolution() {
		this.solution = -b / a;
		setChanged();
		notifyObservers();
	}

	public String toString() {
		return "" + solution;
	}

}

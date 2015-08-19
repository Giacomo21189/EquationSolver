package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.InvalidParametersException;
import model.ObservableEquation;
import model.WrongGradeEquationException;

public class EquationSolver extends JButton {

	private static final long serialVersionUID = 1L;

	public EquationSolver(ObservableEquation obsEq, JTextField txtField) {
		this.setText("Solve");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					String s = txtField.getText();
					obsEq.setParameters(parseFloatArray(s));
					obsEq.solve(obsEq.getParameters());
				} catch (InvalidParametersException ip) {
					JOptionPane.showMessageDialog(null,
							"Valore inserito non valido, prego riprovare.",
							"Attenzione!", 0);
				} catch (NumberFormatException nf) {
					JOptionPane.showMessageDialog(null,"Formato dei valori inseriti non corretto, prego riprovare",
									"Attenzione!", 0);
				} catch (WrongGradeEquationException e) {
					JOptionPane.showMessageDialog(null,"Equazione non corretta",
							"Attenzione!", 0);
				} catch(NullPointerException npe){
					JOptionPane.showMessageDialog(null,"Specificare il tipo di equazione da risolvere",
							"Attenzione!", 0);
				}
			}
		});
	}

	public static float[] parseFloatArray(String str) {
		StringTokenizer strTok = new StringTokenizer(str, ";");

		int size = strTok.countTokens();

		float[] v = new float[size];

		for (int i = 0; i < size; i++)
			v[i] = Float.parseFloat(strTok.nextToken());

		return v;
	}

	// metodo altenativo (forse più breve)
	// public static int[] parseIntArray (String str)
	// {
	// String[] vstr = str.split ("\\s+");
	// int[] vint = new int[vstr.length];
	//
	// for (int i = 0; i < vstr.length; i++)
	// vint[i] = Integer.parseInt (vstr[i]);
	//
	// return vint;
	// }

}

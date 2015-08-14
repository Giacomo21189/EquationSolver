package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.FirstGradeEquation;

public class FirstGradeControl extends JButton {

	private static final long serialVersionUID = 1L;

	public FirstGradeControl(FirstGradeEquation firstGr, JTextField txtField) {
		this.setText("Solve");
		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String s = txtField.getText();
				firstGr.setParameters(parseFloatArray(s));
				firstGr.setSolution();
			}
		});
	}

	public static float[] parseFloatArray(String str) {
		StringTokenizer strTok = new StringTokenizer(str, ";");

		int size = strTok.countTokens();

		float[] v = new float[size];

		try {
			for (int i = 0; i < size; i++)
				v[i] = Float.parseFloat(strTok.nextToken());

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,
					"Numero di parametri inseriti non valido!", "Attenzione!",0);}
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

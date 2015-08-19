package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import model.IEquation;
import model.ObservableEquation;

public class GenericMenuIt extends JMenuItem {

	private static final long serialVersionUID = 1L;

	public GenericMenuIt(String s, ObservableEquation oe, IEquation ie) {
		this.setText(s);
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				oe.setIequation(ie);
			}
		});

	}
}

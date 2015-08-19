package model;

public class Utils {
	


	

	public String parseVectToString (float[] v) {
	String s="";
	for (int i = 0; i < v.length; i++) {			//verificare perchè non devo mettere v.length-1
		s+=v[i]+", ";
	}
	return s;
	};
}
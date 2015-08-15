package model;

//ho reso sia solutions sia parameters dei vettori eliminando il toString() che mi pareva un pò bruttino,

public class FirstGradeEquation implements IEquation {

	private float a;
	private float b;
	private float[] parameters;			//perchè qui invece non succede come sotto?
	private float[] solutions={};		//se elimino le parentesi graffe dà null pointer :(
	private static final String form = "ax+b=0";

	public void setParameters(float... p) throws InvalidParametersException {

		switch (p.length) {
		case 0:
		case 1:
			throw new InvalidParametersException(); // controllare che succede
													// se p.length è più di
													// due!S
		case 2:
			if (p[0] != 0) {
				a = p[0];
				b = p[1];
			} else {
				throw new InvalidParametersException();
			}
		}
	}

	@Override
	public float[] getParameters() {
		return parameters;
	}

	@Override
	public String getForm() {
		return form;
	}

	@Override
	public void setSolutions() {
		float s[]={-b/a};
		this.solutions = s;
	}

	@Override
	public float[] getSolutions() {
		return solutions;
	}

}

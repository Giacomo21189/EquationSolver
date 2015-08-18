package model;

//ho reso sia solutions sia parameters dei vettori eliminando il toString() che mi pareva un pò bruttino,

public class FirstGradeEquation implements IEquation {

	private static final String form = "ax+b=0";
	private float[] parameters={2};
	private float[] solutions={1};

	@Override
	public String getForm() {
		return form;
	}
	
	public void setParameters(float... p) throws InvalidParametersException {
		switch (p.length) {
		case 0: case 1: default:
			throw new InvalidParametersException();
		case 2:
			if (p[0]!= 0) {
				this.parameters=p;
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
	public void solve(float... f) throws InvalidParametersException, ArithmeticException {
		float a=f[0]; 
		float b=f[1]; 
		switch (f.length) {
		case 1:
		solutions[0]=-b/a;
		default:
			throw new InvalidParametersException();
		}
	}
	
	@Override
	public float[] getSolutions() {
		return solutions;
	}

	@Override
	public String parseVectToString(float[] v){
		String s="";
		for (int i = 0; i < v.length; i++) {			//verificare perchè non devo mettere v.length-1
			s+=v[i]+", ";
		}
		return s;
		};

}

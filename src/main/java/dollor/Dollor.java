package dollor;

public class Dollor {

	public int unit;

	public Dollor(int unit) {
		this.unit = unit;
	}

	public Dollor times(int target){
		return new Dollor(unit*target);
	}
}

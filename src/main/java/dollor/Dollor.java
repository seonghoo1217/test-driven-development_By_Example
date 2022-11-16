package dollor;

public class Dollor {

	private int unit;

	public Dollor(int unit) {
		this.unit = unit;
	}

	public int times(int target){
		return unit*target;
	}
}

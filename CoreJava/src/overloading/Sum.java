package overloading;

public class Sum {
	
	public int sum(int i, int j) {
		return i+j;
	}
	
	public int sum(int i, int j, int k) {
		return i+j+k;
	}
	public double sum(double i, double j) {
		return i+j;
	}
	
	public static void main(String[] args) {
		Sum s = new Sum();
		
		System.out.println(s.sum(10,20));
		System.out.println(s.sum(10,20,30));
		System.out.println(s.sum(20,30));
	}

}

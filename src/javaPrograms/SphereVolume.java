package javaPrograms;

public class SphereVolume {
	public static void main(String[] args) {
		int A=5;
		double PI = Math.acos(-1);
        int V = (int)Math.ceil((4.00 * PI * A * A * A) / (double)3.0);
        System.out.println(V);
	}

}

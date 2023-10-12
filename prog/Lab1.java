import static
java.lang.Math.*;
public class Lab1 {
	public static void main(String [] args) {
		
		long[] a = new long[23 - 6];
		for (int i = 6; i < 23; i++) {
			a[i - 6] = i;
		}
		float[] b = new float[21];
		for (int i = 0; i < 21; i++) {
			b[i] = ((float)(random()-0.5) * 10);
		}
		
		double [][] c = new double[9][20];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 20; j++){
				float X = b[j];	
				if (a[i] == 14) {
					c[i][j] = exp(sin(0.75*(X - 0.25)));
				}else if (((a[i] == 8) || (a[i] == 18)) || ((a[i] == 20) || (a[i] == 22))) {
					c[i][j] = tan(asin(pow(X * exp(1) + 1, 2)));					
				}else {
					double stepenb1 = pow(cos(X)/1- pow(1/3*(1 - X), 2), 3);
					c[i][j] = pow(pow(pow(exp(1), X)*(X/1/2 - X), atan(pow(X/1*exp(1) + 1, 2))) - 1, stepenb1) - 0.5/pow(PI*(log(exp(X))) - 1, exp(X)/0.25);
				}
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 20; j++){
				System.out.printf("%.5f", c[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}

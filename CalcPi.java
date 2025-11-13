// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		double sum = 0; 

		for (int i = 0; i < num; i++) {
			if(i%2 == 0){
				sum += (double)1 / (i * 2 + 1);
			}
			else{
				sum -= (double)1 / (i * 2 + 1);
			}
		}
		sum = sum*4;
		
		System.err.println("pi according to java: " + Math.PI);
		System.err.println("pi, approximated:   " + sum);
	}
}

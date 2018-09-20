import java.math.BigInteger;

public class Exo1 {

	public static void main(String[] args) {
		
		BigInteger seed = new BigInteger("1234567890");
		BigInteger enlever5 = new BigInteger("10").pow(5);
		BigInteger enlever10 = new BigInteger("10").pow(10);
		
		for(int i=0; i<10; i++) {
			
			seed = seed.pow(2).divide(enlever5).mod(enlever10);
			
			System.out.println(seed);
		}
		
	}
	
}

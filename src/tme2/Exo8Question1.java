package tme2;

import java.math.BigInteger;

public class Exo8Question1 {

	public static void main (String[] args) {
		
		BigInteger a = new BigInteger("25214903917");
		BigInteger c = new BigInteger("11");
		BigInteger m = new BigInteger("2").pow(48);
		BigInteger x = BigInteger.ZERO;
		
		for(int i=0; i<10; i++) {
			x = a.multiply(x).add(c).mod(m);
			System.out.println(x);
			
		}
		
	}
	
}

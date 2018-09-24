package tme2;

import java.math.BigInteger;

public class Exo8Question2 {

	public static void main (String[] args) {
		BigInteger a = new BigInteger("25214903917");
		BigInteger c = new BigInteger("11");
		BigInteger m = new BigInteger("2").pow(48);
		BigInteger x = new BigInteger("156079716630527"); 
		

		for(int i=0; i<10; i++) {
			x = a.multiply(x).add(c).mod(m).shiftRight(16);
			BigInteger maxBit = x.shiftLeft(31);
			System.out.println(x.bitLength());
			if(maxBit.compareTo(BigInteger.ONE)==0) {
				x = x.subtract(new BigInteger("2").pow(31));
			}
			System.out.println(x);
			
		}
	}
	
}

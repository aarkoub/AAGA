package tme2;

import java.math.BigInteger;

public class Exo8Question2 {

	public static void main (String[] args) {
		BigInteger a = new BigInteger("25214903917");
		BigInteger c = new BigInteger("11");
		BigInteger m = new BigInteger("2").pow(48);
		BigInteger x = new BigInteger("156079716630527"); 
		BigInteger res ;

		for(int i=0; i<10; i++) {
			
			x = a.multiply(x).add(c).mod(m);
			
			res = x.shiftRight(16);
		
			if(res.testBit(31)) {
				res = res.subtract(new BigInteger("2").pow(32));
			}
			
			System.out.println(res);
		
			
		}
	}
	
}

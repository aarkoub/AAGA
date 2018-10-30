package tme3;

import java.math.BigInteger;

public class Rand48 {
	
	
	private BigInteger x;

	public Rand48(BigInteger seed) {
		x = seed;
	}
	
	public BigInteger nextX() {
		BigInteger a = new BigInteger("25214903917");
		BigInteger c = new BigInteger("11");
		BigInteger m = new BigInteger("2").pow(48);
		
		BigInteger res ;
			
		x = a.multiply(x).add(c).mod(m);
			
		res = x.shiftRight(16);
		
		if(res.testBit(31)) {
			res = res.subtract(new BigInteger("2").pow(32));
		}
		
		x = res;
		
		return res;
		
			
	}
	
	
}

package tme3;

import java.math.BigInteger;

public class BitGenerator {
	
	private Rand48 generator ;
	private BigInteger x;
	private int indice;
	
	public BitGenerator() {
		indice = 0;
		generator = new Rand48(new BigInteger("123456789123456789"));
		x = generator.nextX();
	}
	
	public void initGen(BigInteger seed) {
		generator = new Rand48(seed);
		x = generator.nextX();
	}
	
	public int bit_suivant() {
		
		if(indice > 48) {
			x = generator.nextX();
			indice = 0;
		}
		
		return x.testBit(indice++)?1:0;
		
	}
	
	public BigInteger getX() {
		return x;
	}
	
	public static void main(String [] args) {
		BitGenerator exo = new BitGenerator();
		
		for(int i=0; i<100; i++) {
			System.out.println("bit @ "+i +" = "+exo.bit_suivant()+" de X = "+exo.getX());
		}
		
	}

}

package tme3;

import java.math.BigInteger;

public class IntegerGenerator {
	
	private int n ;
	
	private BitGenerator bg ;
	
	public IntegerGenerator(int n) {
		bg = new BitGenerator();
		this.n=n;
		
	}
	
	
	public int nextInt() {
		int k = new BigInteger(String.valueOf(n)).bitLength();
		int bit;
		double r = Math.pow(2, k);
		
		while(r>n) {
			r=0;
			for(int i=0; i<k; i++) {
				bit = bg.bit_suivant();
				r+=Math.pow(2, i)*bit;
			}
		}
		
		
		return (int)r;
	}
	
	
	public static void main(String [] args) {
		int n = 10;
		
		IntegerGenerator intGen = new IntegerGenerator(n);
		
		for(int i=0; i<50; i++)
			System.out.println(intGen.nextInt());
		
	}
	

}

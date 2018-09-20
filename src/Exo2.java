import java.math.BigInteger;

public class Exo2 {

	public static void main(String[] args) {
		
		BigInteger seed;
		BigInteger enlever2 = new BigInteger("10").pow(2);
		BigInteger enlever1 = new BigInteger("10");
		int somme = 0;
		for(int j=0 ;j<100; j++) {
			
			seed = new BigInteger(new Integer(j).toString());
			
			for(int i=0; i<100; i++) {
				
				seed = seed.pow(2).divide(enlever1).mod(enlever2);
				
				System.out.println("j = "+j+" "+seed);
				
				if(seed.intValue()==0) {
					System.out.println("ZERO ATTEINT");
					somme += 1;
					break;
				}
			}
			
		}
		
		System.out.println("Somme = "+somme);

	}

}

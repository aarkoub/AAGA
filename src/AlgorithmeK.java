import java.math.BigInteger;

public class AlgorithmeK {

	public static void main(String[] args) {
		
		BigInteger x = new BigInteger( "6065038420");
		BigInteger pow9 = new BigInteger("10").pow(9);
		BigInteger pow8 = new BigInteger("10").pow(8);
		BigInteger pow5 = new BigInteger("10").pow(5);
		BigInteger pow10 = new BigInteger("10").pow(10);
		BigInteger dix = new BigInteger("10");
		boolean fin = false;
		
		BigInteger y = x.divide(pow9);
		
		BigInteger z;
		
		System.out.println("Start");
		
		while(fin!=true) {
			
			System.out.println("x = "+x.toString());
			System.out.println("y = "+y.toString());
			
			
			z = x.divide(pow8).mod(dix);
			System.out.println("z = "+z.toString());
			
			System.out.println();
			
			switch(z.intValue()+3) {
			
			case 3 :
				if(x.compareTo(new BigInteger("5").multiply(pow9))==-1){
					x = x.add(new BigInteger("5").multiply(pow9));
				}
				System.out.println("x = "+x.toString());
				
			
			case 4:
				x = x.pow(2).divide(pow5).mod(pow10);
				System.out.println("x = "+x.toString());
					
			
			case 5 :
				x = x.multiply(new BigInteger("1001001001")).mod(pow10);
				System.out.println("x = "+x.toString());
			
			
			case 6:
				if(x.compareTo(pow8)==-1){
					x = x.add(new BigInteger("9814055677"));
					
				}
				else{
					x = pow10.subtract(x);
				}
				System.out.println("x = "+x.toString());
			
			case 7 :
				x = pow5.multiply(x.mod(pow5)).add(x.divide(pow5));
				System.out.println("x = "+x.toString());
			
			case 8:
				x = x.multiply(new BigInteger("1001001001")).mod(pow10);
				System.out.println("x = "+x.toString());
			
			case 9 : 
				BigInteger newX = new BigInteger("0");
				Integer k=1;
				
				while(k != x.toString().toCharArray().length+1){
					newX.add(x.mod(dix.pow(k)).multiply(dix.multiply(new BigInteger(k.toString()))));
					
					if(x.mod(dix.pow(k)).divide(dix.pow(k-1)).compareTo(new BigInteger("0"))==1) {
						
						newX = newX.add(x.mod(dix.pow(k)).divide(dix.pow(k-1)).subtract(new BigInteger("1")).multiply(dix.pow(k-1)));
					}
					
					k++;
				}
							
				
				x = newX;
				
				System.out.println("x = "+x.toString());
			
			case 10:
				
				if(x.compareTo(pow5)==-1){
					x = x.pow(2).add(new BigInteger("99999"));
				}
				else{
					x = x.subtract(new BigInteger("99999"));
				}
				System.out.println("x = "+x.toString());
			
			case 11: 
				
				while(x.compareTo(pow9)==-1){
					x = x.multiply(dix);
				}
				System.out.println("x = "+x.toString());
			
			
			case 12:
				x = x.multiply(x.subtract(new BigInteger("1"))).divide(pow5).mod(pow10);
				System.out.println("x = "+x.toString());
			
			case 13:
				if(y.compareTo(new BigInteger("0"))==1){
					y = y.subtract(new BigInteger("1"));
				}
				else{
					System.out.println("Valeur de X = "+x.toString());
					fin = true;
				}
				
			
			}  
			
			
		}

	}

}

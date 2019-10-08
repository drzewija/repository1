class SumaCyfr457 {
	public static void main (String[] args){
		int x, z;
		x=457;
		System.out.println("Licz ca³kowita wynosi: " + x);
		z=0;
		while(z !=0){
			z+=x%10;
			x/=10;
		}
		System.out.println("Suma cyfr wynosi: "+ z);
	}
}
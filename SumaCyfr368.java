class SumaCyfr368 {
	
	public static void main (String[] args) {
		int x, y;
		x= 368;
		System.out.println("liczba ca³kowita wynosi: " + x);
		y=0;
		while(x !=0){
			y+=x%10;
			x/=10;

		}
		System.out.println("Suma cyfr liczby wynosi: " + y);
	}
}
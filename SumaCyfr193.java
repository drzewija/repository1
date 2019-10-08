class SumaCyfr193{
	public static void main(String[] args){
	int x, s;
	x=193;
	System.out.println("Liczba ca³kowita wynosi: " + x);
	s=0;
	while(x !=0){
		s +=x%10;
		x /=10;
		}
	System.out.println("Suma cyfr liczby ca³kowitej wynosi: " + s);
	}
}
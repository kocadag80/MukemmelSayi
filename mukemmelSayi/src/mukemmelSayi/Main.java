package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// 6 --> 1,2,3
		// 28 --> 1,2,4,7,14
		int number = 28;
		boolean mukemmelMi = false;
		int toplam=0;
		
		for(int i=1; i<number; i++) {
			if(number % i ==0) {
				toplam+=i;
			}
			
		}
		if(toplam==number) {
			mukemmelMi = true;
		}
		System.out.println(mukemmelMi);

	}

}

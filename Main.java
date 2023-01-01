import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Main {

	public static void main(String[] args) {
		
		int a, sayıDegeri;
		int result=0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz: ");
		a= scanner.nextInt();
		
		
		
		while(a!=0) {
			sayıDegeri = a %10 ;
			result += sayıDegeri;
			a/=10;
		}
		
		System.out.println("Sayının sayı değerleri toplamı :" +result);
		
	}

}

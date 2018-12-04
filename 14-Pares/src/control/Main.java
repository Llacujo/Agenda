package control;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//n como tope
		System.out.println("Introduce tope");
		int s=0;
		int tope =new Scanner(System.in).nextInt();
		for(int n=0; n <= tope ; n+=2){
			s+=n;
		}
		System.out.println(s);
	
		
		//n como cantidad
		System.out.println("Introduce numero de pares a sumar");
		int tope2 =new Scanner(System.in).nextInt();
		int p=0;
		int q=0;
		for(int r=0;r<=tope2;r+=1){
			p+=q;
			q+=2;
		}
		System.out.println(p);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

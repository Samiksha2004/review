import java.util.*;
public class file{
	static boolean PrimeNumber(int n){
	if(n<2){
		return false;	
	}      
	else if(n == 2 && n == 3){
		return true;
	}
	
	for(int i=2;i<=Math.sqrt(n);i+=6){
		if(n%i == 0){
		return false;}
	
	
	}
	return true;
}

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	System.out.println(PrimeNumber(n));
	

}	
}

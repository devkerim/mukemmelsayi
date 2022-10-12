import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	int sayi,sum=0;
		System.out.println("Sayı giriniz: ");
		sayi = intscanner.nextInt();



	for(int i=1;i<sayi;i++){

	    if(sayi%i==0){sum = sum +i;}
    }

	if(sum==sayi){System.out.println(sayi+" Mükemmel Sayıdır.");}
	else{System.out.println(sayi+" Mükemmel sayı değildir.");}
		}
    }


package pl.coderslab.warsztaty1.zad1;

/**
 * GRA W ZGADYWANIE LICZB
 */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	
	public static void main(String[] args){
		
		//losuję liczbę od 1 do 100
		Random r = new Random();
		int magicNumber = (r.nextInt(101)+1);

		Scanner sc = new Scanner(System.in);
		System.out.println("Zgadnij liczbę: ");
		String str = sc.next(); 
		
		//sprawdzam, czy wprowadzona wartość jest liczbą
		while(!isNumber(str)){
			System.out.println("To nie jest liczba.");
			str = sc.next();
		}
		
		int number = Integer.parseInt(str);
		
		//sprawdza, czy liczba jest za mała czy za duża od wylosowanej
		while(number!= magicNumber){
			number = Integer.parseInt(str);
			if(number < magicNumber){
				System.out.println("Za mało!");
				System.out.println("Zgadnij liczbę: ");
				str = sc.next();
	
			} else if(number > magicNumber){
				System.out.println("Za dużo! Ale nie poddawaj się.");
				System.out.println("Zgadnij liczbę: ");
				str = sc.next();
			}
		}
		System.out.println("BRAWO!!!! Udało się!!!!!!!!!!!!!!");	
		sc.close();	
	}
	
	static boolean isNumber(String n){

		try{
			Integer.parseInt(n);

		}catch(InputMismatchException e){
			System.out.println("To nie jest liczba.");
			return false;
		}
		return true;	
	}

}

/*
Napisz prostą grę w zgadywanie liczb. Komputer musi wylosować liczbę w zakresie od 1 do 100. Następnie:

1. Zadać pytanie: "Zgadnij liczbę" i pobrać liczbę z klawiatury.
2. Sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat "To nie jest liczba", po czym wrócić do pkt. 1
3. Jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat "Za mało!", po czym wrócić do pkt. 1.
4. Jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat "Za dużo!", po czym wrócić do pkt. 1.
5. Jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat "Zgadłeś!", po czym zakończyć działanie programu.

##### Przykład:
```
Zgadnij liczbę: cześć
To nie jest liczba.
Zgadnij liczbę: 50
Za mało!
Zgadnij liczbę: 75
Za dużo!
Zgadnij liczbę: 63
Zgadłeś!
```
*/
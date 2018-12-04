package majkisoft;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// write your code here
		int liczba = (int) (Math.random() * 100);
		int zgadywana;
		int i = 0;

		Scanner input = new Scanner(System.in);

		long czasStart = System.currentTimeMillis();

		System.out.println("Zgadnij liczbę całkowitą od 0 do 100:");

		System.out.println(liczba);


		do {
			i++;
			zgadywana = input.nextInt();
			if (zgadywana > liczba)
				System.out.println("Za dużo");
			else if (zgadywana < liczba)
				System.out.println("Za mało");
		}
		while (zgadywana != liczba);

		int czasZgadywania = (int) ((System.currentTimeMillis() - czasStart) / 1000);
		
		System.out.println("Twoja szczęśliwa liczba to " + liczba + "! Zgadłeś za " + i + " razem i zajęło Ci to tylko " + czasZgadywania + "s");
	}
}
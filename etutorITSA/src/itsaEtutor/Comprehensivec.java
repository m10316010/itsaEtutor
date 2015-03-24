package itsaEtutor;

import java.util.Scanner;

public class Comprehensivec {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int theNum=scanner.nextInt();
		
		int result= theNum%2;
		
		switch(result)
		{
		case 0: 
            System.out.println("even"); 
            break;
		case 1: 
            System.out.println("odd"); 
            break;
		}
		
		scanner.close();
	}

}

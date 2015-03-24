package itsaEtutor;

import java.util.Scanner;

public class arrayc {

	public static void main(String[] args) {
		
		Scanner keyin = new Scanner(System.in);
		int[] orgarray = new int[6];
		
		for(int x=0;x<orgarray.length;x++){
		orgarray[x] = keyin.nextInt();
		}
		keyin.close();
		int answer =0;
		int cube;
		for(int x=0;x<orgarray.length;x++){
			cube = (int) Math.pow(orgarray[x],3);
			answer += cube;
		}
		System.out.println(answer);
		}

}

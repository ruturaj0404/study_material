package game;

import java.util.Scanner;

public class FinalResult {
//	static int score;
//static int score1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("enter details of two player");
     System.out.println("enter name of player1");
     String name=s.next();
     System.out.println("enter name of player2");
     String name1=s.next();
     System.out.println("enter mobile no pf player1");
     int mo_no=s.nextInt();
     System.out.println("enter mobile no of player2");
     int mo_no1=s.nextInt();
     System.out.println("enter score player 2");
     int score=s.nextInt();
     System.out.println("enter score of player2");
     int  score1=s.nextInt();
    player1 p1=new player1(name,mo_no,score);
    player2 p2=new player2(name1,mo_no1,score1);
//   player p[]=new player[10];
  
     FinalResult f=new FinalResult();
     String result=f.Comparescore(p1, p2);
     System.out.println(result);
	}

	 String Comparescore(player1 p3 ,player2 p4) {
		int s1=p3.play();
		int s2=p4.play();
		if(s1>s2) {
			return "player1";
		}
		else {
			return"player2";
		}

	
	}

}

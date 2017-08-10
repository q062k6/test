import java.util.Scanner;
import java.util.Random;
public class DeckOfCardsTest
{
   
   public static void main( String args[] )
   {
	  Scanner input =new Scanner(System.in);
	  int Nub,ts;
	  Random run=new Random();
      DeckOfCards myDeckOfCards = new DeckOfCards();
      myDeckOfCards.shuffle();
      
      System.out.printf("你要幾張牌\n");
      Nub=input.nextInt();
      myDeckOfCards.hand(Nub);
      for(int i=0;i<Nub;i++)
      {
    	  ts=run.nextInt(52);
    	  myDeckOfCards.CardFaces(ts);
    	  System.out.printf("\n %d |%d\n",myDeckOfCards.test1(ts),myDeckOfCards.test2(ts));
    	  //System.out.printf("\n %d |%d\n%s",myDeckOfCards.test1(ts),myDeckOfCards.test2(ts),myDeckOfCards.test3(ts));
      }
      myDeckOfCards.CardType();
      /*for ( int i = 0; i < 13; i++ )
      {
         
         System.out.printf( "%-20s%-20s%-20s%-20s\n", 
            myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),  
            myDeckOfCards.dealCard(), myDeckOfCards.dealCard() );
      } 

         System.out.printf("\n %d |%d\n%s",myDeckOfCards.test1(),myDeckOfCards.test2(),myDeckOfCards.test3());*/
      
   } 
} 
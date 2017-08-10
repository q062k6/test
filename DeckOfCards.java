import java.util.Random;

public class DeckOfCards
{
   private Card deck[]; 
   private int deck2[][],my[][],tf[]; 
   private int currentCard,facesTemp,suitsTemp,k,Three,Two,end=0,CardHadn
		   ,FlushHearts,FlushDiamonds,FlushClubs,FlushSpades;
   private final int NUMBER_OF_CARDS = 52;
   private Random randomNumbers;

   
   public DeckOfCards()
   {
      String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", 
         "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
      String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
      

      deck = new Card[ NUMBER_OF_CARDS ]; 
      deck2 = new int[52][2]; 
      currentCard = 0; 
      randomNumbers = new Random(); 

      for ( int count = 0; count < deck.length; count++ ) 
      {
    	 deck[ count ] = 
            new Card( faces[ count % 13 ], suits[ count / 13 ] );
      	deck2[count][0]=(count % 13);
      	deck2[count][1]=(count / 13);
            
      }
   } 
   
   public void shuffle()
   {
     
      currentCard = 0; 

      
      for ( int first = 0; first < deck.length; first++ ) 
      {
         
         int second =  randomNumbers.nextInt( NUMBER_OF_CARDS );
         
         
         Card temp = deck[ first ];        
         deck[ first ] = deck[ second ];   
         deck[ second ] = temp; 
         

         facesTemp = deck2[ first ][0];        
         deck2[ first ][0] = deck2[ second ][0];   
         deck2[ second ][0] = facesTemp; 
         
         suitsTemp = deck2[ first ][1];        
         deck2[ first ][1] = deck2[ second ][1];   
         deck2[ second ][1] = suitsTemp; 
      } 
   } 

   
   public Card dealCard()
   {
      
      if ( currentCard < deck.length )//發52張牌
         return deck[ currentCard++ ]; 
      else        
         return null; 
   } 
   
   public int test1(int i)
   {
	   return  deck2[i][0];
   }
   public int test2(int i)
   {
	   return  deck2[i][1];
   }
   
   public Card test3(int i)

   {
	   return deck[i];
   }
   
   public void hand (int i)
   {
	   my=new int [i][2];
	   CardHadn=i;
   }
   public void CardFaces(int i)
   {
	   my[k][0]=deck2[i][0];
	   my[k][1]=deck2[i][1];
	   k++;
   }
   public void CardType()
   {
	tf=new int [13];

	   for(int i=0 ;i<CardHadn;i++)
	   {   
		   switch(my[i][0])
		   {
		   case 0:
			   tf[0]=tf[0]+1;
			   break;
		   case 1:
			   tf[1]=tf[1]+1;
			   break;
		   case 2:
			   tf[2]=tf[2]+1;
			   break;
		   case 3:
			   tf[3]=tf[3]+1;
			   break;
		   case 4:
			   tf[4]=tf[4]+1;
			   break;
		   case 5:
			   tf[5]=tf[5]+1;
			   break;
		   case 6:
			   tf[6]=tf[6]+1;
			   break;
		   case 7:
			   tf[7]=tf[7]+1;
			   break;
		   case 8:
			   tf[8]=tf[8]+1;
			   break;
		   case 9:
			   tf[9]=tf[9]+1;
			   break;
		   case 10:
			   tf[10]=tf[10]+1;
			   break;
		   case 11:
			   tf[11]=tf[11]+1;
			   break;
		   case 12:
			   tf[12]=tf[12]+1;
			   break;
		   }
	   }
	   for(int i =0 ;i<13;i++)
	   {
		   	switch(tf[i])
		   	{
		   	case 4:
		   		System.out.printf("鐵枝");
		   		end=1;
		   		break;
		   	case 3:
		   		Three=1;
		   		break;
		   	case 2:
		   		if(Three==1)
		   		{
		   			System.out.printf("葫蘆");
		   			end=1;
		   			break;
		   		}
		   		else
		   		{
		   			if(Two==1)
		   			{
		   				System.out.printf("二對");
		   				end=1;
		   				break;
		   			}	
		   			else
		   				Two=1;
		   				break;
		   		}
		   	}
		   	
		   	
	   }
	   
	   for(int i =0;i<CardHadn;i++)
	   {
		   switch(my[i][1])
		   {
		   case 0:
			   FlushHearts++;
			   break;
		   case 1:
			   FlushDiamonds++;
			   break;
		   case 2:
			   FlushClubs++;
			   break;
		   case 3:
			   FlushSpades++;
			   break;
		   }
	   }
	   
	   
	   if((FlushSpades>=4) || (FlushDiamonds>=4) ||
			   (FlushClubs>=4) || (FlushSpades>=4))
		   System.out.printf("同花");
	   else
	   {
		   if(end==0)
			   if(Three==1)
				   System.out.printf("三條");
			   else
				   if(Two==1)
					   System.out.printf("一對");
				   else
					   System.out.printf("無對");
	   }
	   	Three=0;Two=0;end=0;FlushSpades=0;FlushDiamonds=0;FlushClubs=0;FlushSpades=0;
	   	   for(int i =0;i<5;i++)
	   	   {
	   		   my[i][0]=0;
	   	   }
	   
   }
} 

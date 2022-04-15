package edu.monmouth.decks;

import java.util.Collections;

public class Deck {
	Card deck[] = new Card[DeckConstants.MAXCARDSINDECK];
	public Deck(int r, int s) {
		int i = 0;
		for(Rank ranks: Rank.values())
		{
			for(Suit suits: Suit.values())
			{
				deck[i] = new Card(ranks, suits);
			}
		}
//	int cardNum = 0;
	//fill deck with 52 card objects
	//for(int i = 0;i< DeckConstants.MAXSUIT;i++) {
	//	for(int j = 0;j< DeckConstants.MAXSUIT;j++) {
		//	deck[cardNum] = new Card(i,j);
	//		cardNum++;
	//	}
//	}
	
	}
	
	Card oldCard;
	int cardLocation = 0;
	public Card[] shuffle() {
		
		for(int i = 0; i<deck.length; i++)
		{
			oldCard = deck[i];
			cardLocation = (int)(Math.random()*52);
			deck[i] = deck[cardLocation];
			deck[cardLocation] = oldCard;
			
		}
		
		return deck;
	}
	
	
	//picks a card and removes it from deck and returns that same card
	private int pickedCardNum = 0;
	public Card draw() {
		pickedCardNum = (int)(Math.random()*52);
		
		Card pickedCard = deck[pickedCardNum] ;
		deck[pickedCardNum] = null;
		return pickedCard;
	}
	
	private int cardsLeft = 0;
	public int cardsLeft() {
		for(int i = 0; i<deck.length;i++)
		{
		if(deck[i]!=null)
		{
			cardsLeft++;
		}
		}
		return cardsLeft;
	}
	StringBuilder print = new StringBuilder("");
	String printState = "";
	public String toString() {
		for(int i = 0; i<deck.length;i++)
		{
			if(deck[i] != null){
				print.append(" Suit: " + deck[i].getSuit() + " Rank: " + deck[i].getRank());
			}
		}
		
		printState = "" + print;
		return printState;
	}
	

}

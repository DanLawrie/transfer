package edu.monmouth.decks;

public class Card {
	//private int rank = 0;
//	private int suit = 0;
	private Suit suit;
	private Rank rank;
	//private Rank ranks;
	Card(Rank rank, Suit suit){
		
		setSuit(suit);
		setRank(rank);
		//setRank(rank);
		//setSuit(suit);
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}



}

package solitare.card;

public class Card {
	
	public static enum Color {
		RED,
		BLACK
	}
	
	public static enum Facing {
		UP,
		DOWN
	}
	
	
	public static enum Suite {		
		CLUBS,
		DIAMONDS,
		HEARTS,
		SPADES
	};
	
	public static enum Rank { 
		ACE(1), 
		TWO(2), 
		THREE(3),
		FOUR(4),
		FIVE(5),
		SIX(6),
		SEVEN(7),
		EIGHT(8),
		NINE(9),
		TEN(10),
		JACK(11),
		QUEEN(12),
		KING(13); 
		
		private int value;
	    private Rank(int value) {
	        this.value = value;
	    }

	    public int getIntValue() {
	        return value;
	    }
	}
	
	private Suite suite; 
	public  Suite getSuite() { return this.suite; }
	
	private Rank rank; 
	public  Rank getRank() { return this.rank; }
	
	private Facing facing; 
	public  Facing getFacing() { return this.facing; }
	
	private Color color; 
	public  Color getColor() { return this.color; }
	
	public Card(Rank rank, Suite suite, Facing facing) {
		
		this.rank = rank; 
		this.suite = suite;
		this.facing = facing; 
		
		if(this.suite == Suite.CLUBS || this.suite == Suite.SPADES) {
			this.color = Color.BLACK; 
		}
	}

	public void flip() {
		if(this.facing == Facing.DOWN)
			this.facing = Facing.UP;
		else
			this.facing = Facing.DOWN; 
	}
	
	public boolean sameColor(Card otherCard) {
		boolean areSameColor = this.color == otherCard.color; 
		return areSameColor; 
	}
	
	public int compareRank(Card otherCard) {
		int difference = this.rank.getIntValue() - otherCard.rank.getIntValue(); 
		return difference; 
	};
	
	
}
package solitare.cardstack;

public interface CardStackSerializer {
	public String serialize(CardStack stack);
	public CardStack deserialize(String stackString); 
}

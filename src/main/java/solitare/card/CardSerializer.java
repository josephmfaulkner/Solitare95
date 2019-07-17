package solitare.card;

public interface CardSerializer {
	public String serialize(Card card);
	public Card deserialize(String serializedCard);
}

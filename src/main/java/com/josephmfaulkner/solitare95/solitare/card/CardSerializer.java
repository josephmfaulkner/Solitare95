package com.josephmfaulkner.solitare95.solitare.card;

public interface CardSerializer {
	public String serialize(Card card);
	public Card deserialize(String serializedCard);
}

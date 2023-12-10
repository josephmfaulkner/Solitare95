package com.josephmfaulkner.solitare95.core.cardstack;

public interface CardStackSerializer {
	public String serialize(CardStack stack);
	public CardStack deserialize(String stackString); 
}

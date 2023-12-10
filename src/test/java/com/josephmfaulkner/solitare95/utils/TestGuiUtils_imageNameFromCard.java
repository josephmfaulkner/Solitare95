package com.josephmfaulkner.solitare95.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.josephmfaulkner.solitare95.solitare.card.Card;
import com.josephmfaulkner.solitare95.solitare.card.Card.Facing;
import com.josephmfaulkner.solitare95.solitare.card.Card.Rank;
import com.josephmfaulkner.solitare95.solitare.card.Card.Suite;
import com.josephmfaulkner.solitare95.utility.GuiUtils;

public class TestGuiUtils_imageNameFromCard {


	@Test
	void aceOfSpadesDownCardImage() {
		Card testCard = new Card(Rank.KING, Suite.CLUBS, Facing.DOWN); 

        String expectedImageFileName = "back.jpg";
        String actualImageFileName = GuiUtils.imageNameFromCard(testCard);

		assertEquals(expectedImageFileName, actualImageFileName);
	}

    @Test
	void aceOfSpadesCardImage() {
		Card testCard = new Card(Rank.ACE, Suite.SPADES, Facing.UP); 

        String expectedImageFileName = "ace_of_spades.jpg";
        String actualImageFileName = GuiUtils.imageNameFromCard(testCard);

		assertEquals(expectedImageFileName, actualImageFileName);
	}

	@Test
	void jackOfDiamondsCardImage() {
		Card testCard = new Card(Rank.JACK, Suite.DIAMONDS, Facing.UP); 

        String expectedImageFileName = "jack_of_diamonds.jpg";
        String actualImageFileName = GuiUtils.imageNameFromCard(testCard);

		assertEquals(expectedImageFileName, actualImageFileName);
	}

	@Test
	void twoOfHeartsCardImage() {
		Card testCard = new Card(Rank.TWO, Suite.HEARTS, Facing.UP); 

        String expectedImageFileName = "2_of_hearts.jpg";
        String actualImageFileName = GuiUtils.imageNameFromCard(testCard);

		assertEquals(expectedImageFileName, actualImageFileName);
	}

	@Test
	void fiveOfClubsCardImage() {
		Card testCard = new Card(Rank.FIVE, Suite.CLUBS, Facing.UP); 

        String expectedImageFileName = "5_of_clubs.jpg";
        String actualImageFileName = GuiUtils.imageNameFromCard(testCard);

		assertEquals(expectedImageFileName, actualImageFileName);
	}

	@Test
	void nineOfSpadesCardImage() {
		Card testCard = new Card(Rank.NINE, Suite.SPADES, Facing.UP); 

        String expectedImageFileName = "9_of_spades.jpg";
        String actualImageFileName = GuiUtils.imageNameFromCard(testCard);

		assertEquals(expectedImageFileName, actualImageFileName);
	}

	

	@Test
	void kingOfClubsCardImage() {
		Card testCard = new Card(Rank.KING, Suite.CLUBS, Facing.UP); 

        String expectedImageFileName = "king_of_clubs.jpg";
        String actualImageFileName = GuiUtils.imageNameFromCard(testCard);

		assertEquals(expectedImageFileName, actualImageFileName);
	}
    
}

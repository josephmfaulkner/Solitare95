package com.josephmfaulkner.solitare95.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.josephmfaulkner.solitare95.solitare.card.Card;
import com.josephmfaulkner.solitare95.solitare.card.Card.Suite;
import com.josephmfaulkner.solitare95.solitare.card.Card.Rank;
import com.josephmfaulkner.solitare95.solitare.card.Card.Facing;
import com.josephmfaulkner.solitare95.utility.GuiUtils;

public class TestGuiUtils_imageFromCard {

    @Test
	void aceOfSpadesDownFullCardImage() {
		Card testCard = new Card(Rank.ACE, Suite.SPADES, Facing.DOWN);  

        String expectedImageFileName = "back.jpg";
        String actualImageFileName = GuiUtils.imageFromCard(testCard, false);

		assertEquals(expectedImageFileName, actualImageFileName);
	}

    @Test
	void aceOfSpadesUpFullCardImage() {
		Card testCard = new Card(Rank.ACE, Suite.SPADES, Facing.UP); 

        String expectedImageFileName = "ace_of_spades.jpg";
        String actualImageFileName = GuiUtils.imageFromCard(testCard, false);

		assertEquals(expectedImageFileName, actualImageFileName);
	}

    @Test
	void aceOfSpadesDownCropCardImage() {
		Card testCard = new Card(Rank.ACE, Suite.SPADES, Facing.DOWN);  

        String expectedImageFileName = "top_back.jpg";
        String actualImageFileName = GuiUtils.imageFromCard(testCard, true);

		assertEquals(expectedImageFileName, actualImageFileName);
	}

    @Test
	void aceOfSpadesUpCropCardImage() {
		Card testCard = new Card(Rank.ACE, Suite.SPADES, Facing.UP); 

        String expectedImageFileName = "top_ace_of_spades.jpg";
        String actualImageFileName = GuiUtils.imageFromCard(testCard, true);

		assertEquals(expectedImageFileName, actualImageFileName);
	}

    
}

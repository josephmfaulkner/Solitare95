package com.josephmfaulkner.solitare95.utility;

import com.josephmfaulkner.solitare95.solitare.card.Card;

public class GuiUtils {

    public static String imageFromCard(Card card, Boolean cropTop) {
        String cropTopString = cropTop ? "top_" : "";  
        return String.format("%s%s", cropTopString, GuiUtils.imageNameFromCard(card)); 
    }

    public static String imageNameFromCard(Card card) {
        if(card.getFacing() == Card.Facing.DOWN){
            return "back.jpg";
        }
        String suiteString = card.getSuite().name().toLowerCase();
        String rankString;

        int rankValue = card.getRank().getIntValue();
        if( 2 <= rankValue && rankValue <= 10)
        {
            rankString = String.valueOf(rankValue);
        }
        else
        {
            rankString = card.getRank().name().toLowerCase(); 
        }

        return String.format("%s_of_%s.jpg", rankString, suiteString);
    }


}

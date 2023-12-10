package com.josephmfaulkner.solitare95.utility;

import com.josephmfaulkner.solitare95.core.cardstack.CardStackSerializer;
import com.josephmfaulkner.solitare95.core.cardstack.CardStackSerializerImpl;
import com.josephmfaulkner.solitare95.core.gameboard.GameBoard;

public class GameBoardPrinter 
{
    public static String printBoard(GameBoard gameBoard)
    {
        CardStackSerializer cardStackSerializer = new CardStackSerializerImpl();
        
        StringBuilder stringBuilder = new StringBuilder(); 

        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getDeck()));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getFoundation(1)));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getFoundation(2)));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getFoundation(3)));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getFoundation(4)));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getTableau(1)));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getTableau(2)));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getTableau(3)));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getTableau(4)));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getTableau(5)));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getTableau(6)));
        stringBuilder.append("_");
        stringBuilder.append(cardStackSerializer.serialize(gameBoard.getTableau(7)));

        return stringBuilder.toString();
    }
}

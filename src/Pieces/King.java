package Pieces;

import chessPiece.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class King extends Pieces {
    public King(team color){
        super(color);
    }
    @Override
    public List<Pair> CanMove(){
        team[][] logicalBoard = getLogicalBoard();
        List<Pair> possibleMoves = new ArrayList<>();
        int[][] moves_vector = {{1,1},{1,-1},{-1,1},{-1,-1},{1,0},{0,1},{-1,0},{0,-1} };

        for(var move : moves_vector){
            int x = this.vertical;
            int y = this.horizontal;
            x += move[0];
            y += move[1];
            if (isOutOfBounds(this, move)) continue;
            possibleMoves.add(new Pair(x,y));
        }

        return possibleMoves;
    }
    public void Move(){}
}


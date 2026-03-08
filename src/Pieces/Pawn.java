package Pieces;

import chessPiece.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class Pawn extends Pieces{
    public Pawn(team color){
        super(color);
    }
    @Override
    public List<Pair> CanMove(){
        team[][] logicalBoard = getLogicalBoard();
        List<Pair> possibleMoves = new ArrayList<>();
        int[][] moves_vector = { {2,1}, {2,-1}, {-2,1}, {-2,-1}, {1,2}, {1,-2}, {-1,2}, {-1,-2}};

        for(var move : moves_vector){
            if(isOutOfBounds(this,move)) continue;
            if(this.getColor() == logicalBoard[move[0]][move[1]]) continue;
            possibleMoves.add(new Pair(move[0],move[1]));
        }

        return possibleMoves;
    }
    public void Move(){}
}

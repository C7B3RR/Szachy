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

        return possibleMoves;
    }
    public void Move(){}
}

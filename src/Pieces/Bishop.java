package Pieces;

import chessPiece.*;

import chessPiece.Pair;
public class Bishop extends Pieces {
    public Bishop(team color){
        super(color);
    }
    @Override
    public Pair[] CanMove(){
        chessPiece[][] logicalBoard = getLogicalBoard();


        return new Pair[1];
    }
    public void Move(){}
}

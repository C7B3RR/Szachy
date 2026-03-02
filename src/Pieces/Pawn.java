package Pieces;

import chessPiece.team;

public class Pawn extends Pieces{
    public Pawn(team color){
        super(color);
    }
    @Override
    public boolean CanMove(){

        return false;
    }
    public void Move(){}
}

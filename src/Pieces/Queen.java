package Pieces;

import chessPiece.team;

public class Queen extends Pieces{
    public Queen(team color){
        super(color);
    }
    @Override
    public boolean CanMove(){
        return false;
    }
    public void Move(){}
}

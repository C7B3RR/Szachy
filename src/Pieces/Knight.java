package Pieces;

import chessPiece.team;

public class Knight extends Pieces{
    public Knight(team color){
        super(color);
    }
    @Override
    public boolean CanMove(){
        return false;
    }
    public void Move(){}
}

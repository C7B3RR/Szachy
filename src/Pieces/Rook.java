package Pieces;
import chessPiece.team;

public class Rook extends Pieces{
    public Rook(team color){
        super(color);
    }
    @Override
    public boolean CanMove(){
        return false;
    }
    public void Move(){}
}

package Pieces;
import chessPiece.Pair;
import chessPiece.team;

import java.util.List;

public class Empty extends Pieces {
    public Empty(team Color){
        super(Color);
    }
    @Override
    public List<Pair> CanMove(){
        return null;
    }
    public void Move(){}

}

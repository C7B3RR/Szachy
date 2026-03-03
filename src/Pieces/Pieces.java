package Pieces;
import Board.Board;
import chessPiece.*;

import java.util.Vector;

public abstract class Pieces extends Board {
    int vertical;
    int horizontal;
    protected team Color;
    public chessPiece Type;
    public Pieces(team Color){
        this.Color=Color;
    }

    public abstract Vector<Pair> CanMove();
    public chessPiece GetType(){
        return Type;
    }
    public team getColor(){
        return Color;
    }

}



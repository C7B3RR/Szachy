package Pieces;
import Board.Board;
import chessPiece.*;

import java.util.List;
import java.util.Vector;

public abstract class Pieces extends Board {
    int vertical;
    int horizontal;
    protected team Color;
    public chessPiece Type;
    public Pieces(team Color){
        this.Color=Color;
    }
    public int getVertical(){
        return this.vertical;
    }
    public int getHorizontal(){
        return this.horizontal;
    }
    boolean isOutOfBounds(Pieces Piece,int[] Change){
        int x = Piece.getVertical();
        if((x + Change[0] > 7) || (x + Change[0] < 0)) return true;
        int y = Piece.getHorizontal();
        if((y + Change[1] > 7) || (y + Change[1] < 0)) return true;
        return false;
    }
    public abstract List<Pair> CanMove();
    public chessPiece GetType(){
        return Type;
    }
    public team getColor(){
        return Color;
    }

}



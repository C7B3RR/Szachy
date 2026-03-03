package Pieces;
import chessPiece.*;

import java.util.Vector;

public class Rook extends Pieces{
    public Rook(team color){
        super(color);
    }
    @Override
    public Vector<Pair> CanMove(){
        chessPiece[][] logicalBoard = getLogicalBoard();
        Vector<Pair> possibleMoves = new Vector<Pair>();
        int i=0;
        while(this.vertical + i < 7){
            if(logicalBoard[this.vertical+i][this.horizontal]!=chessPiece.EMPTY){
                break;
            }
            possibleMoves.add(new Pair(this.vertical+i,this.horizontal));
            i++;
        }




        return possibleMoves;
    }
    public void Move(){}
}

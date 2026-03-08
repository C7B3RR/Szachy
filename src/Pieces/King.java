package Pieces;

import chessPiece.*;

import java.util.Vector;

public class King extends Pieces {
    public King(team color){
        super(color);
    }
    @Override
    public Vector<Pair> CanMove(){
        chessPiece [][] logicalBoard = getLogicalBoard();
        Vector<Pair> possibleMoves = new Vector<Pair>();
        for(int i=-1;i<=1;i++) {
            for(int j=-1;j<=1;j++){
                if(this.horizontal+j > 8 || this.horizontal+j<0 || this.vertical+i > 8 || this.vertical+i < 0 || (j==0 && i ==0)){
                    continue;
                    }
                if(logicalBoard[this.horizontal+j][this.vertical+i]==chessPiece.EMPTY){
                    possibleMoves.add(new Pair(this.horizontal+j,this.vertical+i));
                }
                }

            }
        return possibleMoves;
    }
    public void Move(){}
}


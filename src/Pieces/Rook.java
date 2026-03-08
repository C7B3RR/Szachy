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
        var possibleMoves = new Vector<Pair>();
        int i=0;
        while(this.vertical + i < 8){
            if(logicalBoard[this.vertical+i][this.horizontal]!=chessPiece.EMPTY){
                break;
            }
            possibleMoves.add(new Pair(this.vertical+i,this.horizontal));
            i++;
        }
        i=0;
        while(this.vertical + i >=0){
            if(logicalBoard[this.vertical+i][this.horizontal]!=chessPiece.EMPTY){
                break;
            }
            possibleMoves.add(new Pair(this.vertical+i,this.horizontal));
            i--;
        }
        i=0;
        while(this.horizontal + i >=0){
            if(logicalBoard[this.vertical][this.horizontal+i]!=chessPiece.EMPTY){
                break;
            }
            possibleMoves.add(new Pair(this.vertical,this.horizontal+i));
            i--;
        }
        i=0;
        while(this.horizontal + i < 8 ){
            if(logicalBoard[this.vertical][this.horizontal+i]!=chessPiece.EMPTY){
                break;
            }
            possibleMoves.add(new Pair(this.vertical,this.horizontal+i));
            i++;
        }


        return possibleMoves;
    }
    public void Move(){}
}

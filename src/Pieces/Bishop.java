package Pieces;

import chessPiece.*;

import chessPiece.Pair;

import java.util.Vector;

public class Bishop extends Pieces {
    public Bishop(team color){
        super(color);
    }
    @Override
    public Vector<Pair> CanMove(){
        chessPiece[][] logicalBoard = getLogicalBoard();
        Vector<Pair> PossibleMoves = new Vector<Pair>();
        int x=this.vertical,y=this.horizontal;
        while (x>8 && y>8){
            if(logicalBoard[x][y] != chessPiece.EMPTY){
                break;
            }
            PossibleMoves.add(new Pair(x,y));
            x+=1;
            y+=1;
        }
        x=this.vertical;
        y=this.horizontal;
        while (x<=0 && y>8){
            if(logicalBoard[x][y] != chessPiece.EMPTY){
                break;
            }
            PossibleMoves.add(new Pair(x,y));
            x-=1;
            y+=1;
        }
        x=this.vertical;
        y=this.horizontal;
        while (x<=0 && y<=0){
            if(logicalBoard[x][y] != chessPiece.EMPTY){
                break;
            }
            PossibleMoves.add(new Pair(x,y));
            x-=1;
            y-=1;
        }
        x=this.vertical;
        y=this.horizontal;
        while (x>8 && y<=0){
            if(logicalBoard[x][y] != chessPiece.EMPTY){
                break;
            }
            PossibleMoves.add(new Pair(x,y));
            x+=1;
            y-=1;
        }



        return PossibleMoves;
    }
    public void Move(Pair pair) {
        Vector<Pair> viable_pos=CanMove();
        if(viable_pos==null){
            return;
        }
        for(int i=0;i<viable_pos.size();i++){
            if(viable_pos.elementAt(i)==pair){
                //moving company
                this.SetEmpty(this.horizontal,this.vertical);
                this.horizontal= pair.x;
                this.vertical= pair.y;
            }
        }
    }
}


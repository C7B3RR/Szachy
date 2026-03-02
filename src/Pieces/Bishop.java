package Pieces;

import chessPiece.*;

import chessPiece.Pair;
public class Bishop extends Pieces {
    public Bishop(team color){
        super(color);
    }
    @Override
    public Pair[] CanMove(){
        chessPiece[][] logicalBoard = getLogicalBoard();
        int possibleMoves = 0;
        int x=this.vertical,y=this.horizontal;
        while (x>7 && y>7){
            if(logicalBoard[x][y] != chessPiece.EMPTY){
                break;
            }
            possibleMoves++;
            x+=1;
            y+=1;
        }
        x=this.vertical;
        y=this.horizontal;
        while (x<=0 && y>7){
            if(logicalBoard[x][y] != chessPiece.EMPTY){
                break;
            }
            possibleMoves++;
            x-=1;
            y+=1;
        }
        x=this.vertical;
        y=this.horizontal;
        while (x<=0 && y<=0){
            if(logicalBoard[x][y] != chessPiece.EMPTY){
                break;
            }
            possibleMoves++;
            x-=1;
            y-=1;
        }
        x=this.vertical;
        y=this.horizontal;
        while (x>7 && y<=0){
            if(logicalBoard[x][y] != chessPiece.EMPTY){
                break;
            }
            possibleMoves++;
            x+=1;
            y-=1;
        }
        Pair[] Moves = new Pair[possibleMoves];



        return Moves;
    }
    public void Move(Pair pair) {
        Pair[] viable_pos=CanMove();
        if(viable_pos==null){
            return;
        }
        for(int i=0;i<viable_pos.length;i++){
            if(viable_pos[i]==pair){
                //moving company
                this.SetEmpty(this.horizontal,this.vertical);
                this.horizontal= pair.x;
                this.vertical= pair.y;
            }
        }
    }
}

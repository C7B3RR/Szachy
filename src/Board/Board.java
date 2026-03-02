package Board;

import chessPiece.*;
import Pieces.*;


public class Board {
    Pieces[][] Board = new Pieces[8][8];
    public chessPiece GetPieceType(int horizontal,int vertical){
        return Board[vertical][horizontal].GetType();
    }

    void set(int horizontal, int vertical, Pieces piece){
        Board[horizontal][vertical] = piece;
    }


    public chessPiece[][] getLogicalBoard(){
        chessPiece[][] logicalBoard = new chessPiece[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                logicalBoard[i][j]=Board[i][j].GetType();
            }
        }


        return logicalBoard;
    }
    public void Reset(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                set(i,j, new Empty(team.EMPTY));
            }
        }
        set(0, 0, new Rook(team.BLACK));
        set(1,0, new Knight(team.BLACK));
        set(2,0, new Bishop(team.BLACK));
        set(3,0, new Queen(team.BLACK));
        set(4,0, new King(team.BLACK));
        set(5,0, new Bishop(team.BLACK));
        set(6,0, new Knight(team.BLACK));
        set(7,0, new Rook(team.BLACK));
        for (int i = 0;i<8;i++){
            set(i,1,new Pawn(team.BLACK));
            set(i,6,new Pawn(team.WHITE));
        }
        set(0,7, new Rook(team.WHITE));
        set(1,7, new Knight(team.WHITE));
        set(2,7, new Bishop(team.WHITE));
        set(3,7, new Queen(team.WHITE));
        set(4,7, new King(team.WHITE));
        set(5,7, new Bishop(team.WHITE));
        set(6,7, new Knight(team.WHITE));
        set(7,7, new Rook(team.WHITE));
    }
    public boolean IsEmpty(int horizontal, int vertical){
//        if(this.GetPieceType(horizontal,vertical)==chessPiece.EMPTY){
//            return true;
//        }
        if(this.Board[horizontal][vertical] == null){
            return true;
        }
        return false;
    }
    public void SetEmpty(int horizontal, int vertical){

    }


}

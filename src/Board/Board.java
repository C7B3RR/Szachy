package Board;
import chessPiece.chessPiece;
import Pieces.Pieces;
public class Board {
    Pieces[][] Board = new Pieces[8][8];
    public chessPiece GetPieceType(int horizontal,int vertical){
        return Board[vertical][horizontal].GetType();
    }

    void set(int horizontal, int vertical, Pieces piece){
        Board[horizontal][vertical] = piece;
    }
    public void Reset(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                set(i,j, Pieces.Empty);//nwm xd
            }
        }
    }
    public boolean IsEmpty(int horizontal, int vertical){
        if(this.GetPieceType(horizontal,vertical)==chessPiece.EMPTY){
            return true;
        }
        return false;
    }
    public boolean CanMove(int horizontal, int veritcal){

    }

}

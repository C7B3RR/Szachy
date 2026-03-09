
import Board.Board;
import chessPiece.*;
import Pieces.*;


void main() {
    Board b = new Board();
    b.Reset();
    Bishop s = (Bishop) b.getPiece(new Pair(2,0));
    for(int i=0;i<8;i++){
        for(int j=0;j<8;j++){
            Pieces c = b.getPiece(new Pair(i,j));
            IO.println(c);
            IO.println("y = " + i);
            IO.println("x = " + j);
        }
    }
//    List<Pair> moves = s.CanMove();
//    for(var move : moves){
//        IO.println(move);
//    }
}

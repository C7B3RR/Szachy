
import Board.Board;
import chessPiece.*;
import Pieces.*;


void main() {
    Board b = new Board();
    b.Reset();
    Bishop s = (Bishop) b.getPiece(new Pair(2,0));
    Vector<Pair> moves = s.CanMove();
    for(int i=0;i<moves.size();i++){
        IO.println(moves.elementAt(i));
    }
}

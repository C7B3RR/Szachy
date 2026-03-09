package Pieces;

import chessPiece.*;

import chessPiece.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Bishop extends Pieces {
    public Bishop(team color){
        super(color);
    }
    @Override
    public List<Pair> CanMove(){
        team[][] logicalBoard = getLogicalBoard();
        List<Pair> possibleMoves = new ArrayList<>();
        int[][] moves_vector = {{1,1},{1,-1},{-1,1},{-1,-1} };

        for(var move : moves_vector){
            int x = this.vertical;
            int y = this.horizontal;
            while (true) {
                x += move[0];
                y += move[1];
                if (isOutOfBounds(this, move)) break;
                possibleMoves.add(new Pair(x,y));
                if (this.getColor() != team.EMPTY) break;
            }
        }

        return possibleMoves;
    }
//    public void Move(Pair pair) {
//        List<Pair> viable_pos=CanMove();
//        if(viable_pos==null){
//            return;
//        }
//        for(int i=0;i<viable_pos.size();i++){
//            if(viable_pos.elementAt(i)==pair){
//                //moving company
//                this.SetEmpty(this.horizontal,this.vertical);
//                this.horizontal= pair.x;
//                this.vertical= pair.y;
//            }
//        }
//    }
}


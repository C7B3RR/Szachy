package Pieces;

import chessPiece.Pair;
import chessPiece.team;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Pieces{
    public Queen(team color){
        super(color);
    }
    @Override
    public List<Pair> CanMove(){
        team[][] logicalBoard = getLogicalBoard();
        List<Pair> possibleMoves = new ArrayList<>();
        int[][] moves_vector = {{1,1},{1,-1},{-1,1},{-1,-1},{1,0},{0,1},{-1,0},{0,-1} };

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
    public void Move(){}
}

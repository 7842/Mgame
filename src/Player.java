import java.util.ArrayList;

public class Player {
    public String name;
    private Board board;
    private Piece piece;
    private ArrayList<Die> dies;


    public Player(String name, Board board, Piece piece, ArrayList<Die> dies) {
        this.name = name;
        this.board = board;
        this.piece = piece;
        this.dies = dies;
    }

    public void takeTurn(){
        int fv = 0;
        for(Die die : dies){
            die.roll();
            fv = fv + die.getFaceValue();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
    }

}
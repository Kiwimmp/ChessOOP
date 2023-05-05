package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * 
 * This is the Knight class inherited from the Piece abstract class.
 * 
 * It represents a knight piece in the game of chess.
 */
public class Knight extends Piece {

  /**
   * 
   * Constructor for the Knight class.
   * 
   * @param i The id of the knight.
   * @param p The image path of the knight.
   * @param c The color of the knight. Use Piece.WHITE or Piece.BLACK.
   */
  public Knight(String i, String p, int c) {
    setId(i);
    setPath(p);
    setColor(c);
  }

  /**
   * 
   * This method calculates all possible moves for a knight at a given position on
   * the board.
   * 
   * @param state The current state of the chess board.
   * @param x     The x-coordinate of the knight's position.
   * @param y     The y-coordinate of the knight's position.
   * @return An ArrayList of all possible moves for the knight.
   */
  @Override
  public ArrayList<Cell> move(Cell state[][], int x, int y) {
    possiblemoves.clear();
    int posx[] = { x + 1, x + 1, x + 2, x + 2, x - 1, x - 1, x - 2, x - 2 };
    int posy[] = { y - 2, y + 2, y - 1, y + 1, y - 2, y + 2, y - 1, y + 1 };
    for (int i = 0; i < 8; i++)
      if ((posx[i] >= 0 && posx[i] < 8 && posy[i] >= 0 && posy[i] < 8))
        if ((state[posx[i]][posy[i]].getpiece() == null
            || state[posx[i]][posy[i]].getpiece().getcolor() != this.getcolor())) {
          possiblemoves.add(state[posx[i]][posy[i]]);
        }
    return possiblemoves;
  }
}
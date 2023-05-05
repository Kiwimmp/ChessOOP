package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * 
 * This is the Pawn class inherited from the Piece class.
 * 
 * @version 1.0
 * 
 * @since 2023-05-05
 */
public class Pawn extends Piece {

  /**
   * 
   * Constructor for Pawn class.
   * 
   * @param i ID of the pawn.
   * @param p Path of the pawn's image file.
   * @param c Color of the pawn: 0 for white, 1 for black.
   */
  public Pawn(String i, String p, int c) {
    setId(i);
    setPath(p);
    setColor(c);
  }

  /**
   * 
   * Overridden move function for Pawn class.
   * 
   * @param state 2D array of cells representing the current state of the chess
   *              board.
   * 
   * @param x     x-coordinate of the current position of the pawn.
   * 
   * @param y     y-coordinate of the current position of the pawn.
   * 
   * @return ArrayList of cells representing the possible moves for the pawn.
   */
  public ArrayList<Cell> move(Cell state[][], int x, int y) {
    // Pawn can move only one step except the first chance when it may move 2 steps
    // It can move in a diagonal fashion only for attacking a piece of opposite
    // color
    // It cannot move backward or move forward to attact a piece

    possiblemoves.clear();
    if (getcolor() == 0) {
      if (x == 0)
        return possiblemoves;
      if (state[x - 1][y].getpiece() == null) {
        possiblemoves.add(state[x - 1][y]);
        if (x == 6) {
          if (state[4][y].getpiece() == null)
            possiblemoves.add(state[4][y]);
        }
      }
      if ((y > 0) && (state[x - 1][y - 1].getpiece() != null)
          && (state[x - 1][y - 1].getpiece().getcolor() != this.getcolor()))
        possiblemoves.add(state[x - 1][y - 1]);
      if ((y < 7) && (state[x - 1][y + 1].getpiece() != null)
          && (state[x - 1][y + 1].getpiece().getcolor() != this.getcolor()))
        possiblemoves.add(state[x - 1][y + 1]);
    } else {
      if (x == 8)
        return possiblemoves;
      if (state[x + 1][y].getpiece() == null) {
        possiblemoves.add(state[x + 1][y]);
        if (x == 1) {
          if (state[3][y].getpiece() == null)
            possiblemoves.add(state[3][y]);
        }
      }
      if ((y > 0) && (state[x + 1][y - 1].getpiece() != null)
          && (state[x + 1][y - 1].getpiece().getcolor() != this.getcolor()))
        possiblemoves.add(state[x + 1][y - 1]);
      if ((y < 7) && (state[x + 1][y + 1].getpiece() != null)
          && (state[x + 1][y + 1].getpiece().getcolor() != this.getcolor()))
        possiblemoves.add(state[x + 1][y + 1]);
    }
    return possiblemoves;
  }

}

package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * This is the Rook class inherited from abstract Piece class
 *
 */
public class Rook extends Piece {

  /**
   * Constructor to create a new Rook object
   * 
   * @param i the ID of the rook
   * @param p the path of the image of the rook
   * @param c the color of the rook (0 for white, 1 for black)
   */
  public Rook(String i, String p, int c) {
    setId(i);
    setPath(p);
    setColor(c);
  }

  /**
   * This method returns a list of possible moves for the rook
   * 
   * @param state the current state of the board
   * @param x     the x coordinate of the rook
   * @param y     the y coordinate of the rook
   * @return an ArrayList of possible moves for the rook
   */

  public ArrayList<Cell> move(Cell state[][], int x, int y) {
    // Rook can move only horizontally or vertically
    possiblemoves.clear();
    int tempx = x - 1;
    while (tempx >= 0) {
      if (state[tempx][y].getpiece() == null)
        possiblemoves.add(state[tempx][y]);
      else if (state[tempx][y].getpiece().getcolor() == this.getcolor())
        break;
      else {
        possiblemoves.add(state[tempx][y]);
        break;
      }
      tempx--;
    }
    tempx = x + 1;
    while (tempx < 8) {
      if (state[tempx][y].getpiece() == null)
        possiblemoves.add(state[tempx][y]);
      else if (state[tempx][y].getpiece().getcolor() == this.getcolor())
        break;
      else {
        possiblemoves.add(state[tempx][y]);
        break;
      }
      tempx++;
    }
    int tempy = y - 1;
    while (tempy >= 0) {
      if (state[x][tempy].getpiece() == null)
        possiblemoves.add(state[x][tempy]);
      else if (state[x][tempy].getpiece().getcolor() == this.getcolor())
        break;
      else {
        possiblemoves.add(state[x][tempy]);
        break;
      }
      tempy--;
    }
    tempy = y + 1;
    while (tempy < 8) {
      if (state[x][tempy].getpiece() == null)
        possiblemoves.add(state[x][tempy]);
      else if (state[x][tempy].getpiece().getcolor() == this.getcolor())
        break;
      else {
        possiblemoves.add(state[x][tempy]);
        break;
      }
      tempy++;
    }
    return possiblemoves;
  }
}

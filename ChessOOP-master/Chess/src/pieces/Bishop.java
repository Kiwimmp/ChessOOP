package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * This is the Bishop Class.
 * The Move Function defines the basic rules for movement of Bishop on a chess
 * board.
 * 
 * @author [author name]
 * @version [version number]
 */
public class Bishop extends Piece {

  /**
   * Constructor for the Bishop class.
   * 
   * @param i the ID of the Bishop
   * @param p the file path of the image representing the Bishop
   * @param c the color of the Bishop (0 for white, 1 for black)
   */
  public Bishop(String i, String p, int c) {
    setId(i);
    setPath(p);
    setColor(c);
  }

  /**
   * This function returns a list of all the possible destinations of a Bishop.
   * The basic principle of Bishop Movement on chess board has been implemented.
   * 
   * @param state the current state of the chess board
   * @param x     the x-coordinate of the Bishop's current position
   * @param y     the y-coordinate of the Bishop's current position
   * @return an ArrayList containing all the possible moves for the Bishop
   */
  public ArrayList<Cell> move(Cell state[][], int x, int y) {
    // Bishop can Move diagonally in all 4 direction (NW,NE,SW,SE)
    // This function defines that logic

    possiblemoves.clear();
    int tempx = x + 1, tempy = y - 1;
    while (tempx < 8 && tempy >= 0) {
      if (state[tempx][tempy].getpiece() == null) {
        possiblemoves.add(state[tempx][tempy]);
      } else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
        break;
      else {
        possiblemoves.add(state[tempx][tempy]);
        break;
      }
      tempx++;
      tempy--;
    }
    tempx = x - 1;
    tempy = y + 1;
    while (tempx >= 0 && tempy < 8) {
      if (state[tempx][tempy].getpiece() == null)
        possiblemoves.add(state[tempx][tempy]);
      else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
        break;
      else {
        possiblemoves.add(state[tempx][tempy]);
        break;
      }
      tempx--;
      tempy++;
    }
    tempx = x - 1;
    tempy = y - 1;
    while (tempx >= 0 && tempy >= 0) {
      if (state[tempx][tempy].getpiece() == null)
        possiblemoves.add(state[tempx][tempy]);
      else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
        break;
      else {
        possiblemoves.add(state[tempx][tempy]);
        break;
      }
      tempx--;
      tempy--;
    }
    tempx = x + 1;
    tempy = y + 1;
    while (tempx < 8 && tempy < 8) {
      if (state[tempx][tempy].getpiece() == null)
        possiblemoves.add(state[tempx][tempy]);
      else if (state[tempx][tempy].getpiece().getcolor() == this.getcolor())
        break;
      else {
        possiblemoves.add(state[tempx][tempy]);
        break;
      }
      tempx++;
      tempy++;
    }
    return possiblemoves;
  }
}
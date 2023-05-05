package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 * This is the Piece Class. It is an abstract class from which all the actual
 * pieces are inherited.
 * It defines all the function common to all the pieces
 * The move() function an abstract function that has to be overridden in all the
 * inherited class
 * It implements Cloneable interface as a copy of the piece is required very
 * often
 */
public abstract class Piece implements Cloneable {

  // Member Variables
  private int color;
  private String id = null;
  private String path;
  protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>(); // Protected (access from child classes)

  /**
   * An abstract function that must be overridden in all the inherited classes.
   * It takes the current position and the chessboard as input and returns an
   * ArrayList of all the possible moves.
   * 
   * @param pos The chessboard with the current state of the game
   * @param x   The row of the current position
   * @param y   The column of the current position
   * @return An ArrayList of all the possible moves
   */
  public abstract ArrayList<Cell> move(Cell pos[][], int x, int y);

  /**
   * Sets the id of the piece.
   * 
   * @param id The id of the piece
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the image path of the piece.
   * 
   * @param path The image path of the piece
   */
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * Sets the color of the piece.
   * 
   * @param c The color of the piece (0 for white and 1 for black)
   */
  public void setColor(int c) {
    this.color = c;
  }

  /**
   * Returns the image path of the piece.
   * 
   * @return The image path of the piece
   */
  public String getPath() {
    return path;
  }

  /**
   * Returns the id of the piece.
   * 
   * @return The id of the piece
   */
  public String getId() {
    return id;
  }

  /**
   * Returns the color of the piece.
   * 
   * @return The color of the piece (0 for white and 1 for black)
   */
  public int getcolor() {
    return this.color;
  }

  /**
   * Returns a "shallow" copy of the object. The copy has the exact same variable
   * value but a different reference.
   * 
   * @return A copy of the piece
   * @throws CloneNotSupportedException if the piece cannot be cloned
   */
  public Piece getcopy() throws CloneNotSupportedException {
    return (Piece) this.clone();
  }
}

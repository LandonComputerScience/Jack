/**
 * Represents a balloon in the BalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.*;

public class SquareBalloon extends Balloon
{


  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public SquareBalloon()
  {
   super();
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public SquareBalloon(int x, int y, int r, Color c)
  {
    super (x, y, r, c);
  }

  /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   */
  public void draw(Graphics g, boolean makeItFilled)
  {
   int x = getX();
   int y = getY();
   int r = getRadius();

    g.setColor(getColor());
    if (makeItFilled)
      g.fillRect(x - r,
                 y - r, 2*r, 2*r);
    else
      g.drawRect(x - r,
                 y - r, 2*r, 2*r);
  }
}
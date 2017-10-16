/**
 * Represents a FancyBalloon in the FancyBalloonDraw program.
 * Author: Willy Bolly
 * Ver 1.0 Created 12/31/17
 */

import java.awt.Color;
import java.awt.Graphics;

public class FancyBalloon extends Balloon
{

  /**
   * Constructs a FancyBalloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public FancyBalloon()
  {
  super();
  }

  /**
   * Constructs a FancyBalloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the FancyBalloon
   * @param c color of the FancyBalloon
   */
  public FancyBalloon(int x, int y, int r, Color c)
  {
    super(x, y, r, c);
  }


  public void draw(Graphics g, boolean makeItFilled)
  {
    int x = getX();
    int y = getY();
    int r = getRadius();

    g.setColor(getColor());
    if (makeItFilled)
      g.fillRoundRect(x - r/2,
              y - r/2, r, 2*r , 10, 5);
    else
      g.drawRoundRect(x - r/2,
              y - r/2, r, 2*r, 6, 8);
  }
}
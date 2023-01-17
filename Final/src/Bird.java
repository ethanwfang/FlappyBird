import processing.core.PApplet;
import processing.core.PImage;
public class Bird
{
    protected int myX, myY, size;
    private PApplet applet;
    private Score s;
    private Pipes p;

    public Bird(PApplet applet_, Score s_)
    {
        applet = applet_;
        myX = 200;
        myY = applet_.height / 2;
        size = 30;
        //p = p_;
        s = s_;
    }

    public void display()
    {
        applet.fill(255);
        applet.ellipse(myX, myY, size, size);
    }

    public void move()
    {
        myY += 6;
        if (applet.keyPressed)
        {
            if (applet.key == ' ')
            {
                myY -= 15;
            }
        }
    }
    /*
    private boolean collision1()
    {
        - idk how to write the collision statement
        - s.incrementScore(); <- point system where if u pass through the pipes
                              the score will increase
    }
     */

    public int getX()
    {
        return myX;
    }

    public int getY()
    {
        return myY;
    }

    public void drop()
    {
        myY -= 10;
    }

    public void stop()
    {
        myX -=6;
    }

}
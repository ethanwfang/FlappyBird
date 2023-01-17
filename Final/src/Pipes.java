import processing.core.PApplet;

public class Pipes
{
    protected int x,y, y2, space, a, width;
    private PApplet applet;

    public Pipes(PApplet applet_)
    {
        applet = applet_;
        x = 700;
        y = 0;
        space = 150;
        a = ((int)(Math.random() * 7) * 100) + 100;
        width = 75;
        y2 = space + a;

    }

    public void display() // idk how to fix the pipes
    {
        applet.fill(16, 226, 72);
        applet.rect(x, y, width, a); // top
        applet.rect(x, y2, width,750 - y2);
    }

    public void move()
    {
        x -= 3;
        if (x + width <= 0)
        {
            x = 1000;
            a = ((int)(Math.random() * 7) * 100) + 100;
        }

    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getY2()
    {
        return y2;
    }
}
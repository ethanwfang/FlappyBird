import processing.core.PApplet;
public class Divider
{
    protected int myX, myY;
    private PApplet applet;
    protected int x;
    protected int y;

    public Divider(PApplet applet_ , int a, int b, boolean isVert)
    {
        applet = applet_;
        myX = a;
        myY = b;
        if (isVert)
        {
            x = 3;
            y = 1000;
        }
        else
        {
            y = 3;
            x = 1000;
        }
    }

    public void display()
    {
        applet.fill(0);
        applet.rect(myX, myY, x, y);
    }
}

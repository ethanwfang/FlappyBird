import processing.core.PApplet;

public class Square
{
    private PApplet applet;
    protected int myX;
    protected int myY;
    protected int a;
    protected int b;

    public Square(PApplet applet_, int x, int y)
    {
        applet = applet_;
        myX = x;
        myY = y;
        a = 500;
        b = 500;
    }

    public void display()
    {
        applet.fill(100, 0, 0);
        applet.rect(myX, myY, 500, 500);
    }

    public void change(int num)
    {
        if (num == 1)
        {
            myX = 500;
            myY = 0;
        }
        else if ( num == 2)
        {
            myX = 0;
            myY = 0;
        }
        else if (num == 3)
        {
            myX = 0;
            myY = 500;
        }
        else
        {
            myX = 500;
            myY = 500;
        }
        applet.rect(myX, myY, 500, 500);
    }
}

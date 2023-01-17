import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;
public class MemoryGame extends PApplet
{
    public static void main(String[] args)
    {
        PApplet.main("MemoryGame");
    }

    private Divider d;
    private Divider d2;
    private Square s1;

    public void settings()
    {
        size(1000,1000);
        d = new Divider(this, 500, 0, true);
        d2 = new Divider(this, 0 , 500, false);
        s1 = new Square(this,0,0);
    }

    public void setup()
    {

    }

    public void draw()
    {
        background(255);
        d.display();
        d2.display();
        s1.display();
        if (keyPressed)
        {
            if (keyCode == UP)
            {
                s1.change(1);
            }
            else if(keyCode == DOWN)
            {
                s1.change(4);
            }
            else if (keyCode == LEFT)
            {
                s1.change(2);
            }
            else if (keyCode == RIGHT)
            {
                s1.change(3);
            }
        }



    }
}

package org.java.syntrapxl;

import org.springframework.stereotype.Component;

@Component
public class Punt
{
    private int x;
    private int y;
    public static final int MAXIMUMGROOTTE = 99;

    public Punt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int berekenAfstand(Punt punt)
    {
        int afstand = (int) (Math.pow(this.x - punt.getX(),2) + Math.pow(this.y - punt.getY(),2));
        afstand = (int) Math.sqrt(afstand);
        return afstand;
    }

    private void controleer()
    {
        if (this.x <= 0)
        {
            this.x = 0;
        }
        if (this.x >= 99)
        {
            this.x = 99;
        }
        if (this.y <= 0)
        {
            this.y = 0;
        }
        if (this.y >= 99)
        {
            this.y = 99;
        }
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
        controleer();
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
        controleer();
    }

    @Override
    public String toString()
    {
        return "[" + getX() + "," + getY() + "]";
    }
}

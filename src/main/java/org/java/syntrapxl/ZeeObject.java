package org.java.syntrapxl;

import org.springframework.stereotype.Component;

@Component
public class ZeeObject implements Vernietigbaar
{
    private Punt locatie;
    private Alliantie alliantie;
    private int levenspunten;

    public ZeeObject(int x, int y, Alliantie alliantie, int levenspunten)
    {
        locatie = new Punt(x, y);
        this.alliantie = alliantie;
        this.levenspunten = levenspunten;
    }

    public Alliantie getAlliantie()
    {
        return alliantie;
    }

    public int getLevenspunten()
    {
        return levenspunten;
    }

    public Punt getLocatie()
    {
        return locatie;
    }

    public void setLocatie(Punt locatie)
    {
        this.locatie = locatie;
    }

    public String toString()
    {
        return "Locatie x: " + this.locatie.getX() + "Locatie y: " + this.locatie.getY() + "\n Levenspunten: " + this.levenspunten;
    }

    @Override
    public void ontvangSchade(int schade)
    {
        this.levenspunten -= schade;
    }
}

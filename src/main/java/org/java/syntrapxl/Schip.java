package org.java.syntrapxl;

import org.springframework.stereotype.Component;

@Component
public class Schip extends ZeeObject implements Beweegbaar {

    private int snelheid;
    private ZeeObject zeeObject;

    public Schip(int x, int y, Alliantie alliantie, int levenspunten, int snelheid) {
        super(x, y, alliantie, levenspunten);
        this.snelheid = snelheid;
    }

    public void beweegNaar(Punt punt)
    {
        if (super.getLevenspunten() > 0 && zeeObject.getLocatie().berekenAfstand(punt) <= this.snelheid) //dit wertk niet en is niet klaar
        {
            super.setLocatie(punt);
        }
    }

    public String toString()
    {
        return "Locatie schip x: " + super.getLocatie().getX() + "    y: " + super.getLocatie().getY() + "\n Levenspunten: " + super.getLevenspunten();
    }
}
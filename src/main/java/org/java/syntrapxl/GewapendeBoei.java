package org.java.syntrapxl;

import org.springframework.stereotype.Component;

@Component
public class GewapendeBoei extends ZeeObject {

    private int bereik;
    private int schade;

    public GewapendeBoei(int x, int y, Alliantie alliantie, int levenspunten, int bereik, int schade) {
        super(x, y, alliantie, levenspunten);
        this.bereik = bereik;
        this.schade = schade;
    }

    public void doeSchade(ZeeObject zeeObject)
    {
        if(super.getLevenspunten() > 0 && super.getAlliantie() != zeeObject.getAlliantie() && super.getLocatie().berekenAfstand(zeeObject.getLocatie()) <= this.bereik)
        {
            zeeObject.ontvangSchade(schade);
        }
    }

    public String toString()
    {
        return "Locatie boei x: " + super.getLocatie().getX() + "    y: " + super.getLocatie().getY() + "\n Levenspunten: " + super.getLevenspunten();
    }
}

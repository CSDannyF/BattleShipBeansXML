package org.java.syntrapxl;

import java.util.ArrayList;

public class Spel {

    private ArrayList<ZeeObject> zeeObjecten;

    public Spel()
    {
        zeeObjecten = new ArrayList<>();
    }

    public void beweegZeeObject(int index, Punt punt)
    {
        if(zeeObjecten.get(index) instanceof Beweegbaar)
        {
            zeeObjecten.get(index).setLocatie(punt);
        }
    }

    public int getAantalZeeObjeten()
    {
        return this.zeeObjecten.size();
    }

    public void printStatus()
    {
        for(Vernietigbaar zeeObject : zeeObjecten)
        {
            System.out.println(zeeObject.toString());
        }
    }

    public void voegZeeObjectToe(ZeeObject zeeObject)
    {
        this.zeeObjecten.addLast(zeeObject);
    }

    public void vuur()
    {
        for(Vernietigbaar zeeObject : zeeObjecten)
        {
            if(zeeObject instanceof GewapendeBoei)
            {
                for(ZeeObject zeeObject1 : zeeObjecten)
                {
                    ((GewapendeBoei) zeeObject).doeSchade(zeeObject1);
                }
            }
        }
    }
}

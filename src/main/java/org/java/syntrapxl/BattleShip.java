package org.java.syntrapxl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;


public class BattleShip {
    private static ApplicationContext context;
    public static void main(String[] args)
    {
        context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Spel spel = (Spel) context.getBean("spel");

        ZeeObject ship1 = (Schip) context.getBean("ship1");
        ZeeObject ship2 = (Schip) context.getBean("ship2");
        ZeeObject ship3 = (Schip) context.getBean("ship3");
        ZeeObject ship4 = (Schip) context.getBean("ship4");

        ZeeObject boei1 = (GewapendeBoei) context.getBean("boei1");
        ZeeObject boei2 = (GewapendeBoei) context.getBean("boei2");
        ZeeObject boei3 = (GewapendeBoei) context.getBean("boei3");
        ZeeObject boei4 = (GewapendeBoei) context.getBean("boei4");

        spel.voegZeeObjectToe(ship1);
        spel.voegZeeObjectToe(ship2);
        spel.voegZeeObjectToe(ship3);
        spel.voegZeeObjectToe(ship4);

        spel.voegZeeObjectToe(boei1);
        spel.voegZeeObjectToe(boei2);
        spel.voegZeeObjectToe(boei3);
        spel.voegZeeObjectToe(boei4);

        Random rnd = new Random();

        for(int i = 0; i < 10; i++)
        {
            System.out.println("Ronde: " + i);

            for (int j = 0; j < 5; j++)
            {
                int randomIndex = rnd.nextInt(spel.getAantalZeeObjeten());
                Punt randomPunt = new Punt(rnd.nextInt(Punt.MAXIMUMGROOTTE), rnd.nextInt(Punt.MAXIMUMGROOTTE));
                spel.beweegZeeObject(randomIndex, randomPunt);

                spel.beweegZeeObject(randomIndex,randomPunt);
            }
            spel.vuur();
            spel.printStatus();
        }

        //System.out.println(schip1.toString());
        //spel.printStatus();

        /*
        Spel spel = new Spel();

        ZeeObject schip1 = new Schip(10,10,Alliantie.NOORD, 90, 5);
        ZeeObject schip2 = new Schip(30,30,Alliantie.ZUID, 90, 10);
        ZeeObject schip3 = new Schip(80,80,Alliantie.NOORD, 90, 8);
        ZeeObject schip4 = new Schip(70,50,Alliantie.ZUID, 90, 5);
        //ZeeObject schip5 = new Schip(95,10,Alliantie.NOORD, 100, 5);
        //ZeeObject schip6 = new Schip(90,80,Alliantie.Zuid, 100, 5);

        ZeeObject boei1 = new GewapendeBoei(20,20,Alliantie.NOORD,40,30,30);
        ZeeObject boei2 = new GewapendeBoei(75,30,Alliantie.ZUID,40,30,30);
        ZeeObject boei3 = new GewapendeBoei(60,80,Alliantie.NOORD,40,30,30);
        ZeeObject boei4 = new GewapendeBoei(5,90,Alliantie.ZUID,40,30,30);

        spel.voegZeeObjectToe(schip1);
        spel.voegZeeObjectToe(schip2);
        spel.voegZeeObjectToe(schip3);
        spel.voegZeeObjectToe(schip4);
        //spel.voegZeeObjectToe(schip5);
        //spel.voegZeeObjectToe(schip6);

        spel.voegZeeObjectToe(boei1);
        spel.voegZeeObjectToe(boei2);
        spel.voegZeeObjectToe(boei3);
        spel.voegZeeObjectToe(boei4);

        Random rnd = new Random();

        for(int i = 0; i < 10; i++)
        {
            System.out.println("Ronde: " + i);

            for (int j = 0; j < 5; j++)
            {
                int randomIndex = rnd.nextInt(spel.getAantalZeeObjeten());
                Punt randomPunt = new Punt(rnd.nextInt(Punt.MAXIMUMGROOTTE), rnd.nextInt(Punt.MAXIMUMGROOTTE));
                spel.beweegZeeObject(randomIndex, randomPunt);

                spel.beweegZeeObject(randomIndex,randomPunt);
            }

            spel.vuur();
            spel.printStatus();

        }

        //System.out.println(schip1.toString());
        //spel.printStatus();
         */
    }
}

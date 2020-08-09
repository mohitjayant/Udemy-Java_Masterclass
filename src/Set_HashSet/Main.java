package Set_HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlBody> solarSystem = new HashMap<>();
    private static Set<HeavenlBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlBody temp = new HeavenlBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlBody tempMoon = new HeavenlBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new HeavenlBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        temp = new HeavenlBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }

        HeavenlBody body = solarSystem.get("Mars");
        System.out.println("Moons of " + body.getName());
        for(HeavenlBody jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<HeavenlBody> moons = new HashSet<>();
        for(HeavenlBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(HeavenlBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        HeavenlBody pluto=new HeavenlBody("Pluto",848);
        planets.add(pluto);

        for (HeavenlBody planet:planets){
            System.out.println(planet.getName()+" : "+planet.getOrbitalPeriod());
        }

        Object o=new Object();
        o.equals(o);
        "pluto".equals("");

    }
}


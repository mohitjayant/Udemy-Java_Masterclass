package Set_Challange;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<Set_HashSet.HeavenlyBody> satellites;
    private final BodyTypes bodyType;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }
    
    public HeavenlyBody(String name, double orbitalPeriod,BodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType=bodyType;
    }

    public String getName() {
        return name;
    }

    public BodyTypes getBodyType() {
        return bodyType;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(Set_HashSet.HeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<Set_HashSet.HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        System.out.println("obj.getClass() is "+ obj.getClass());
        System.out.println("this.getClass() is "+this.getClass());

        if (obj==null || (this.getClass()!= obj.getClass())){
            return false;
        }
        String objName=((Set_HashSet.HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hasCode called.....");
        return this.name.hashCode() + 57;
    }
}

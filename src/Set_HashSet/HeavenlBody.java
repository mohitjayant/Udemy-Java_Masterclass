package Set_HashSet;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlBody> satellites;

    public HeavenlBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlBody> getSatellites() {
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
        String objName=((HeavenlBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hasCode called.....");
        return this.name.hashCode() + 57;
    }
}

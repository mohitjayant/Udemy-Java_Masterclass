package Set_Challange;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlBody {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<HeavenlBody> satellites;

    public enum BodyTypes{
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlBody(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key=new Key(name,bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavenlBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public final boolean equals(Object obj){
        if (this==obj){
            return true;
        }

        if (obj instanceof HeavenlBody){
            HeavenlBody theObj= (HeavenlBody) obj;
            return this.key.equals(theObj.getKey());
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.name+": "+this.key.bodyType +", "+this.orbitalPeriod;
    }

    public static Key makeKey(String name,BodyTypes bodyType){
        return new Key(name,bodyType);
    }

    public static final class Key{
        private String name;
        private BodyTypes bodyType;

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        private Key(String name, BodyTypes bodyTypes) {
            this.name = name;
            this.bodyType = bodyTypes;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode()+57+this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key=(Key) obj;
            if (this.name.equals(key.getName())){
                return (this.bodyType ==key.getBodyType());
            }
            else {
                return false;
            }
        }

        @Override
        public String toString() {
            return this.name+": "+this.bodyType;
        }
    }
}

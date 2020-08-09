package Set_Challange;

public class Planet extends HeavenlBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlBody moon) {
        if (moon.getKey().getBodyType()==BodyTypes.MOON){
            return super.addSatellite(moon);
        }
        else {
            return false;
        }
    }
}

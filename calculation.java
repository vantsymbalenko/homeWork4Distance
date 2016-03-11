/**
 * Created by Admin on 11.03.2016.
 */
public class calculation {
    private double length;
    public double getLength() {
        return length;
    }
    calculation(float x1Coordinate,float y1Coordinate,float x2Coordinate,float y2Coordinate){
        length=Math.sqrt((x1Coordinate-x2Coordinate)*(x1Coordinate-x2Coordinate)+(y1Coordinate-y2Coordinate)*(y1Coordinate-y2Coordinate));
    }
}

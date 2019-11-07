import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;

public class app {
    public static void main(String[]args) throws ParseException {
        Geometry a;
        Geometry b;

        WKTReader reader = new WKTReader();

            a = reader.read("POLYGON((10 10, 20 50, 40 10, 10 10))");
            b = reader.read("POLYGON((40 10, 60 10, 60 50, 20 50, 40 10))");

        System.out.println("Contains AB = " + metodosGeometry.containsAB(a,b));
        System.out.println("Contains BA = " + metodosGeometry.containsBA(a,b));
        System.out.println("Covers AB = " + metodosGeometry.coversAB(a,b));
        System.out.println("Covers BA = " + metodosGeometry.coversBA(a,b));
        System.out.println("Overlaps AB = " + metodosGeometry.overlapsAB(a,b));
        System.out.println("Overlaps BA = " + metodosGeometry.overlapsBA(a,b));
        System.out.println("Touches AB = " + metodosGeometry.touchesAB(a,b));
        System.out.println("Touches BA = " + metodosGeometry.touchesBA(a,b));
        System.out.println("Winthin AB = " + metodosGeometry.withinAB(a,b));
        System.out.println("Winthin BA = " + metodosGeometry.withinBA(a,b));
        System.out.println("Equals AB = " + metodosGeometry.equalsAB(a,b));
        System.out.println("Equals BA = " + metodosGeometry.equalsBA(a,b));
        System.out.println("Disjoint AB = " + metodosGeometry.disjointAB(a,b));
        System.out.println("Disjoint BA = " + metodosGeometry.disjointBA(a,b));
        System.out.println("Intersects AB = " + metodosGeometry.intersectsAB(a,b));
        System.out.println("Intersects BA = " + metodosGeometry.intersectsBA(a,b));
        System.out.println("Crosses AB = " + metodosGeometry.crossesAB(a,b));
        System.out.println("Crosses BA = " + metodosGeometry.crossesBA(a,b));
        System.out.println("CoveredBy AB = " + metodosGeometry.coveredByAB(a,b));
        System.out.println("CoveredBy BA = " + metodosGeometry.coveredByBA(a,b));


    }
}

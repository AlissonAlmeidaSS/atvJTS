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

        System.out.println(metodosGeometry.containsAB(a,b));
        System.out.println(metodosGeometry.containsBA(a,b));
        System.out.println(metodosGeometry.coversAB(a,b));
        System.out.println(metodosGeometry.coversBA(a,b));
        System.out.println(metodosGeometry.overlapsAB(a,b));
        System.out.println(metodosGeometry.overlapsBA(a,b));
        System.out.println(metodosGeometry.touchesAB(a,b));
        System.out.println(metodosGeometry.touchesBA(a,b));
        System.out.println(metodosGeometry.withinAB(a,b));
        System.out.println(metodosGeometry.withinBA(a,b));
        System.out.println(metodosGeometry.equalsAB(a,b));
        System.out.println(metodosGeometry.equalsBA(a,b));
        System.out.println(metodosGeometry.disjointAB(a,b));
        System.out.println(metodosGeometry.disjointBA(a,b));
        System.out.println(metodosGeometry.intersectsAB(a,b));
        System.out.println(metodosGeometry.intersectsBA(a,b));
        System.out.println(metodosGeometry.crossesAB(a,b));
        System.out.println(metodosGeometry.crossesBA(a,b));
        System.out.println(metodosGeometry.coveredByAB(a,b));
        System.out.println(metodosGeometry.coveredByBA(a,b));


    }
}

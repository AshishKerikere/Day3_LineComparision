package Day8Assignment;
import java.util.Scanner;
import Day8Assignment.Line;
import Day8Assignment.Point;

public class LineComparisonProblem {
    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            double[] A = new double[4];
            double[] B = new double[4];

            System.out.println("Input the value of X co ordinate of Point1");
            A[0] = scanner.nextDouble();
            System.out.println("Input the value of Y co ordinate of Point1");
            B[0] = scanner.nextDouble();

            System.out.println("Input the value of X co ordinate of Point2");
            A[1] = scanner.nextDouble();
            System.out.println("Input the value of Y co ordinate of Point2");
            B[1] = scanner.nextDouble();

            System.out.println("Input the value of X co ordinate of Point3");
            A[2] = scanner.nextDouble();
            System.out.println("Input the value of Y co ordinate of Point3");
            B[2] = scanner.nextDouble();

           System.out.println("Input the value of X co ordinate of Point4");
           A[3] = scanner.nextDouble();
           System.out.println("Input the value of Y co ordinate of Point4");
           B[3] = scanner.nextDouble();

            Point p1 = new Point(A[0], B[0]);
            Point p2 = new Point(A[1], B[1]);
            Point p3 = new Point(A[2], B[2]);
            Point p4 = new Point(A[3], B[3]);

            Line l1 = new Line(p1, p2);
            Line l2 = new Line(p3, p4);
    }
}

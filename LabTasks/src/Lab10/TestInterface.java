package Lab10;

//TestInterface.java
/*A driver program that tests the functionality of the Student, UnderGraduate and
PostGraduate classes as well as the Person interface*/

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class TestInterface {
     public static void main(String args[]) {
			System.out.println("Testing the UnderGraduate no-arg constructor: ");
			UnderGraduate u1 = new UnderGraduate();
			System.out.println(u1);

			System.out.println("\n\nTesting the UnderGraduate multi-arg constructor: ");
			UnderGraduate u2 = new UnderGraduate("Tommy Tiernan", "Galway", new GregorianCalendar(1970,5,22),"t123456","Comedy",3.12);
			System.out.println(u2);

			System.out.println("\n\nTesting the PostGraduate no-arg constructor: ");
			PostGraduate p1 = new PostGraduate();
			System.out.println(p1);

			System.out.println("\n\nTesting the PostGraduate multi-arg constructor: ");
			PostGraduate p2 = new PostGraduate("Eddie Murphy", "USA", new GregorianCalendar(1961,7,10), "t234567", "Comedy", "Frank Carson");
			System.out.println(p2);

			Lecturer lecturer1 = new PermanentLecturer("Thomas Aquinas", "Dublin", new GregorianCalendar(), "52673", new String[]{}, new GregorianCalendar(), "Full-time Professorship", "");
     	}
}












//aircraft program
//guest: see available route and flights
//client: bool a flight, reschedule, cancel, view history, compare routes...
//manager: create a route(validation ), remove route, update route(validation), make a discount...
//register, login,



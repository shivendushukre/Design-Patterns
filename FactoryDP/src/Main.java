
/**
 * Type of Creational Design Pattern
 * creating objects of similar type but can have diff. implementations
 * hides complexity of object creation
 * Client code has no idea about object creation
 *
 * Real world examples:
 * Calendar and NumberFormat in Java
 * Frameworks and Libraries
 * */

/**
 * Pros and Cons:
 * Guarantees abstraction
 * Code is flexible and adaptable
 * Very useful for frameworks and libraries
 *
 * Complex code X
 * Takes time to set the base X
 * Not a pattern that can be refactored into X
 * */

public class Main {
    public static void main(String[] args) {

        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");

        assert hldCourse!=null;
        System.out.println("HLD modules: ");
        System.out.println(hldCourse.modules);

        assert lldCourse!=null;
        System.out.println("lLD modules: ");
        System.out.println(lldCourse.modules);

    }
}
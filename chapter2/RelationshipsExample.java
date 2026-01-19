import java.util.ArrayList;
import java.util.List;

public class RelationshipsExample {

    public static void main(String[] args) {

        // -------- Association: Teacher just uses a Student in a method --------
        Teacher teacher = new Teacher("Alice");
        teacher.teach();  // Teacher exists independently; no strong ownership

        // -------- Aggregation: Department has a collection of Teachers --------
        Department department = new Department();
        department.addTeacher(new Teacher("Bob"));
        department.addTeacher(new Teacher("Carol"));

        System.out.println("\nTeachers in the department (aggregation):");
        department.printTeachers();

        // -------- Composition (Car–Engine): Car owns Engine strongly --------
        Car6 car = new Car6();
        car.drive();  // Car creates and delegates to its Engine

        // -------- Composition (House–Room): House owns Rooms strongly --------
        House house = new House();
        System.out.println("\nRooms in the house (composition):");
        house.printRooms();
    }
}

// ---------------- Association example ----------------
class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println(name + " is teaching.");
    }

    public String getName() {
        return name;
    }
}

// ---------------- Aggregation example ----------------
class Department {
    private List<Teacher> teachers;

    public Department() {
        teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher); // Department refers to Teacher objects it does not own
    }

    public void printTeachers() {
        for (Teacher t : teachers) {
            System.out.println("- " + t.getName());
        }
    }
}

// ---------------- Composition over inheritance (Car – Engine) ----------------
class Engine {
    public void start() {
        System.out.println("Engine starting...");
    }
}

class Car6 {
    private Engine engine; // Composition: Car contains Engine

    public Car6() {
        this.engine = new Engine(); // Engine created with Car
    }

    public void drive() {
        engine.start();                        // Delegation
        System.out.println("Car is driving...");
    }
}

// ---------------- Composition example (House – Room) ----------------
class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class House {
    private List<Room> rooms; // Composition: House contains Rooms

    public House() {
        rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
    }

    public void printRooms() {
        for (Room room : rooms) {
            System.out.println("- " + room.getName());
        }
    }
}

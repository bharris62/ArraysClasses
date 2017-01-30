import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by BHarris on 1/30/17.
 *
 * This is a classroom class that looks at students and teachers, it also takes into account temperature of the room,
 * and other comforts students and teachers may need.
 */
public class ClassRoom {
    private int numberOfStudents;
    ArrayList<String> studentNames;
    private int numberOfChairs;
    private String instructor;
    private boolean whiteboard;
    private int temperature;


    public ClassRoom(String teacher, int numberOfStudents, boolean whiteboard){
        this.instructor = teacher;
        this.numberOfStudents = numberOfStudents;
        this.whiteboard = whiteboard;
        this.studentNames = new ArrayList<>();
        this.temperature = 70;
        this.numberOfChairs = numberOfStudents + 1; //teachers need a chair too
    }

    public void addStudent(String student){
        studentNames.add(student);
    }

    public void getStudent(){
        for (String student : this.studentNames){
            System.out.println(student);
        }
    }

    public String toString(){
        return "" + "Classroom is " + this.temperature + " degress, with " + this.numberOfStudents + "and " +
                + this.numberOfChairs + " chairs" + " students" + " and your instructor is " + this.instructor;
    }
}

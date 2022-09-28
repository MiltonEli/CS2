import java.util.ArrayList;

public class ArrayListHomework {
    //make an array list code
    public static void main(String[] args) {
        ArrayList studentList = new ArrayList();
        studentList.add("Eli");
        studentList.add("Seb");
        studentList.add("Jack");
        studentList.add("Bryan");

        if(studentList.contains("Bryan")){
            System.out.println("student list contains B");
        }
        System.out.println(studentList);
    }
}

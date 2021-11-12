

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student>{
    public int compare(Student student1,Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class StudentCollectionRunner {

    public static void main(String[] args) {
        List<Student> students= List.of(new Student(1,"Ranga"),new Student(100,"Adam"),new Student(2,"Eve"));

        ArrayList<Student> studentAl=new ArrayList<>(students);
        System.out.println(studentAl);
        Collections.sort(studentAl);
        System.out.println("Desc "+studentAl);
      //  Collections.sort(studentAl,new DescendingStudentComparator());
        studentAl.sort(new AscendingStudentComparator());
        System.out.println("AscendingStudentComparator "+studentAl);
    }
}

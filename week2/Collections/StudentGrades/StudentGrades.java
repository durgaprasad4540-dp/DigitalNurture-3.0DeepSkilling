package StudentGrades;

import java.util.LinkedHashMap;

public class StudentGrades {

    LinkedHashMap<Integer, Student> map = new LinkedHashMap<>();

    public void addStudent(Student s)
    {
        map.put(s.getId(), s);
    }

    public void removeStudent(int studentId)
    {
        if(map.containsKey(studentId))
        {
            map.remove(studentId);
        }
        else{
            System.out.println("Id  not existed");
        }
    }

    public void updateStudentGrade(int studentId, char newGrade)
    {
        if(map.containsKey(studentId))
        {
            Student s = map.get(studentId);
            s.setGrade(newGrade);
        }
        else{
            System.out.println("Student id does not exist");
        }
    }

    public void displayStudents()
    {
        for(Student s: map.values())
        {
            System.out.println(s);
        }
    }
}

class Student{

    int id;
    String name;
    char grade;

    public Student(int id, String name, char grade)
    {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId()
    {
        return id;
    }

    public void setGrade(char grade)
    {
        this.grade = grade;
    }

    @Override

    public String toString()
    {
        return "id: " + id + ", name: " + name + ", grade: " + grade;
    }
}

class StudentGradesTest
{
    public static void main(String[] args) {
        
        StudentGrades sg = new StudentGrades();
        sg.addStudent(new Student(111, "asdf", 'O'));
        sg.addStudent(new Student(12, "asdf1", 'A'));
        sg.addStudent(new Student(44, "asdf2", 'B'));
        sg.addStudent(new Student(77, "asdf34", 'D'));

        sg.displayStudents();
        System.out.println();

        sg.removeStudent(12);
        sg.displayStudents();
        System.out.println();

        sg.updateStudentGrade(111, 'A');
        sg.displayStudents();

    }
}

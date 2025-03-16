class Student{
    String name;
    int marks;

    public Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
}

public class Main{
    public static void main(String[] args){
        Student[] student = {
            new Student("st1",50),
            new Student("st2",60),
            new Student("st3",70),
            new Student("st4",80),
            new Student("st5",90),
        };

        int total=0;
        for(int i=0;i<student.length;i++){
            total+=student[i].marks;
        }
        int avg = total/student.length;
        System.out.println("Average is : "+avg);
    }
}
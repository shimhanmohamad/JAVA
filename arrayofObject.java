class Student{
    int rollnumber;
    String name;
    int marks;
}

class arrayofObject{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollnumber = 123;
        s1.name = "shimhan";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollnumber = 234;
        s2.name = "mohamad";
        s2.marks = 49;

        Student s3 = new Student();
        s3.rollnumber = 345;
        s3.name = "shamhan";
        s3.marks = 39;

        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

        //using forr each loop

        for (Student i : students) {
            System.out.println(i.name + " : " + i.marks);
        }
        for (Student i : students) {
            System.out.println(i.marks + ":" + i.rollnumber);
        }
    }
}
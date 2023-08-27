 class Student {
    int studentID;
    String studentName;
    String studentClass;
    int iosMarks;
    int oopMarks;
    int taflMarks;
    int seMarks;
    
    static int nextStudentID = 44001;
    
    Student(String a, String b, int c, int d, int e, int f) {
        studentID = nextStudentID++;
        studentName = a;
        studentClass = b;
        iosMarks = c;
        oopMarks = d;
        taflMarks = e;
        seMarks = f;
    }
    void REPORT() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("Class: " + studentClass);
        System.out.println("IOS Marks: " + iosMarks);
        System.out.println("OOP Marks: " + oopMarks);
        System.out.println("TAFL Marks: " + taflMarks);
        System.out.println("SE Marks: " + taflMarks);
        System.out.println();
    }
    void Result(){
        double T_marks= iosMarks + taflMarks + oopMarks + seMarks;
        double persentage = T_marks/4;
        System.out.println("Persentagae = "+ persentage);
        if(iosMarks>=40 && taflMarks >=40 && oopMarks>=40 && seMarks>=40 && persentage>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}

class StudentInfo {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        
        students[0] = new Student("Pravin", "Div 1", 0, 7, 8, 9);
        students[1] = new Student("Ishu", "Div 1", 70, 80, 75, 90);
        students[2] = new Student("Sachin", "Div 1", 85, 80, 90, 95);
        students[3] = new Student("Satyam", "Div 1", 75, 85, 80, 95);
        students[4] = new Student("Abhijit", "Div 1", 90, 95, 85, 80);

        for (int i = 0; i < students.length; i++) {
           students[i].REPORT();
        }
        for (int i = 0; i < students.length; i++) {
           students[i].Result();
        }
    }
    
    
}
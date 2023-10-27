package week1.day1;

public class Report {
    public static void main(String[] args) {
        Student details=new Student();
        String studentName = details.studentName;
        int rollNo = details.rollNo;
        String colName = details.colName;
        int markScored = details.markScored;
        System.out.println("Student name is "+ studentName);
        System.out.println("Roll number is "+ rollNo);
        System.out.println("College name is "+ colName);
        System.out.println("Marks scored: "+markScored);
        System.out.println("CGPA is "+ details.cgpa);
    }
}

class Student {
  private String name;
  private String gender;
  private int yearOfStudy;
  private String courseName;
  private String university;

  public Student(String name, String gender, int yearOfStudy, String courseName, String university) {
    this.name = name;
    this.gender = gender;
    this.yearOfStudy = yearOfStudy;
    this.courseName = courseName;
    this.university = university;
  }

  public void attendLecture() {
    System.out.println("Attending Lecture");
  }

  public void submitAssignment() {
    System.out.println("Submitted Assignment");
  }

  public void attendLab() {
    System.out.println("Attending Lab");
  }

  public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Gender: " + gender);
    System.out.println("Year of Study: " + yearOfStudy);
    System.out.println("Course Name: " + courseName);
    System.out.println("University: " + university);
  }
}

class UndergraduateStudent extends Student {
  public UndergraduateStudent(String name, String gender, int yearOfStudy, String courseName, String university) {
    super(name, gender, yearOfStudy, courseName, university);
  }
}

class GraduateStudent extends Student {
  public GraduateStudent(String name, String gender, int yearOfStudy, String courseName, String university) {
    super(name, gender, yearOfStudy, courseName, university);
  }
}

public class StanfordUniversity {
  public static void main(String[] args) {
    Student student1 = new UndergraduateStudent("John", "Male", 2016, "Java", "Stanford");
    student1.displayDetails();
    student1.attendLecture();
    student1.submitAssignment();
    student1.attendLab();

    System.out.println();

    Student student2 = new GraduateStudent("Jane", "Female", 2018, "Computer Science", "Stanford");
    student2.displayDetails();
    student2.attendLecture();
    student2.submitAssignment();
    student2.attendLab();
  }
}

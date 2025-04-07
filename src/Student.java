public class Student implements Comparable<Student> {
    int id;
    String course;
    double cgpa;

    public Student(int id, String course, double cgpa) {
        this.id = id;
        this.course = course;
        this.cgpa = cgpa;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id,o.id);
    }
}

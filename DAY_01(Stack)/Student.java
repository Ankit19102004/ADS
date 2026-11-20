public class Student {
    String name;
    int rollNo;
    int age;
    double score;
    public Student(String name, int rollNo, int age, double score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }
    public void display() {
        System.out.println(name + "\t" + rollNo + "\t" + age + "\t" + score);
    }
    public String toString(){
        return "Name => "+name+"\nRoll No => "+rollNo+"\nAge => "+age+"\nScore => "+score;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
       Student s1 = new Student();
        s1.name = "Ali";
        s1.age = 25;

        Student s2 = new Student(s1);
        s2.print();  
    }
}

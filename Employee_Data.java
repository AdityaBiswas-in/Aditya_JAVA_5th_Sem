public class Employee_Data {

    static class Employee {
        String name;
        int empID;
        int score;

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Employee ID: " + empID);
            System.out.println("Score: " + score);
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Rahul";
        e1.empID = 101;
        e1.score = 85;

        e2.name = "Adi";
        e2.empID = 102;
        e2.score = 95;

        e1.display();
        System.out.println();

        e2.display();
    }
}
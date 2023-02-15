import java.util.Scanner;

public class SelectStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students");
        int studentsNumber = scanner.nextInt();
        scanner.nextLine();

        String[] student = new String[studentsNumber];
        int [] age = new int[studentsNumber];

        for(int i = 0; i < studentsNumber; i++){
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            student[i] = name;
            System.out.println("Enter age: ");
            int studentAge = scanner.nextInt();
            scanner.nextLine();
            age[i] = studentAge;
        }

        for(int j = 0; j <studentsNumber; j++){
            if(age[j] >15){
                System.out.println("Student " + student[j] +  " is eligible");
                System.out.println("The student is now "+ age[j]);
            }else{
                System.out.println("Student " + student[j] +" is not eligible");
            }
        }

        scanner.close();
    }
}

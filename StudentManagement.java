//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentManagement {
    private static ArrayList<Student> students = new ArrayList();
    private static Scanner scanner;

    public StudentManagement() {
    }

    public static void main(String[] args) {
        int choice = 0;

        do {
            try {
                System.out.println("\n--- Student Management System ---");
                System.out.println("1. Add Student");
                System.out.println("2. Edit Student");
                System.out.println("3. Delete Student");
                System.out.println("4. Display All Students");
                System.out.println("5. Search Student by ID");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        editStudent();
                        break;
                    case 3:
                        deleteStudent();
                        break;
                    case 4:
                        displayStudents();
                        break;
                    case 5:
                        searchStudentById();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (NumberFormatException var3) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (Exception var4) {
                Exception e = var4;
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        } while(choice != 6);

    }

    private static void addStudent() {
        try {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            while(true) {
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                if (name.matches("[a-zA-Z ]+")) {
                    while(true) {
                        System.out.print("Enter Student Marks (0 - 10): ");
                        double marks = Double.parseDouble(scanner.nextLine());
                        if (marks >= 0.0 && marks <= 10.0) {
                            students.add(new Student(id, name, marks));
                            System.out.println("Student added successfully.");
                            return;
                        }

                        System.out.println("Invalid marks. Please enter a number between 0 and 10.");
                    }
                }

                System.out.println("Invalid name. Please enter only letters and spaces.");
            }
        } catch (NumberFormatException var4) {
            System.out.println("Invalid marks input. Please enter a number between 0 and 10.");
        } catch (Exception var5) {
            Exception e = var5;
            System.out.println("An error occurred while adding the student: " + e.getMessage());
        }

    }

    private static void editStudent() {
        try {
            System.out.print("Enter Student ID to edit: ");
            String id = scanner.nextLine();
            boolean found = false;
            Iterator var2 = students.iterator();

            while(var2.hasNext()) {
                Student student = (Student)var2.next();
                if (student.getId().equals(id)) {
                    System.out.print("Enter new Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter new Marks (0 - 10): ");
                    double marks = Double.parseDouble(scanner.nextLine());
                    student.setName(name);
                    student.setMarks(marks);
                    System.out.println("Student updated successfully.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        } catch (NumberFormatException var7) {
            System.out.println("Invalid marks input. Please enter a number between 0 and 10.");
        } catch (Exception var8) {
            Exception e = var8;
            System.out.println("An error occurred while editing the student: " + e.getMessage());
        }

    }

    private static void deleteStudent() {
        try {
            System.out.print("Enter Student ID to delete: ");
            String id = scanner.nextLine();
            boolean found = false;
            Iterator var2 = students.iterator();

            while(var2.hasNext()) {
                Student student = (Student)var2.next();
                if (student.getId().equals(id)) {
                    students.remove(student);
                    System.out.println("Student deleted successfully.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        } catch (Exception var4) {
            Exception e = var4;
            System.out.println("An error occurred while deleting the student: " + e.getMessage());
        }

    }

    private static void displayStudents() {
        try {
            if (students.isEmpty()) {
                System.out.println("No students to display.");
            } else {
                Iterator var3 = students.iterator();

                while(var3.hasNext()) {
                    Student student = (Student)var3.next();
                    System.out.println(student);
                }
            }
        } catch (Exception var2) {
            Exception e = var2;
            System.out.println("An error occurred while displaying students: " + e.getMessage());
        }

    }

    private static void searchStudentById() {
        try {
            System.out.print("Enter Student ID to search: ");
            String id = scanner.nextLine();
            boolean found = false;
            Iterator var2 = students.iterator();

            while(var2.hasNext()) {
                Student student = (Student)var2.next();
                if (student.getId().equals(id)) {
                    System.out.println(student);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        } catch (Exception var4) {
            Exception e = var4;
            System.out.println("An error occurred while searching for the student: " + e.getMessage());
        }

    }

    static {
        scanner = new Scanner(System.in);
    }
}

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class Student {
    private String id;
    private String name;
    private double marks;

    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return this.marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getRank() {
        if (this.marks >= 0.0 && this.marks <= 5.0) {
            return "Fail";
        } else if (this.marks > 5.0 && this.marks <= 6.5) {
            return "Medium";
        } else if (this.marks > 6.5 && this.marks <= 7.5) {
            return "Good";
        } else if (this.marks > 7.5 && this.marks <= 9.0) {
            return "Very Good";
        } else {
            return this.marks > 9.0 && this.marks <= 10.0 ? "Excellent" : "Invalid marks";
        }
    }

    public String toString() {
        String var10000 = this.id;
        return "Student ID: " + var10000 + ", Name: " + this.name + ", Marks: " + this.marks + ", Rank: " + this.getRank();
    }
}

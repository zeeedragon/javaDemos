package classesDemo;

public class Student {
    private String name;
    private int[] marks;
    private int year;
    private int fnum;
    static private int fn = 1000; //keep track of current f#

    public Student(String name) {
        this.name = name;
        year = 1;
        marks = new int[]{2, 2, 2, 2, 2};
        fnum = fn;
        fn++;
    }

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
        marks = new int[]{2, 2, 2, 2, 2};
        fnum = fn;
        fn++;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public int getYear() {
        return year;
    }

    public int getFnum() {
        return fnum;
    }

    public static int getFn() {
        return fn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFnum(int fnum) {
        this.fnum = fnum;
    }

    //avg result method
    public float avg() {
        float sum = 0;
        for (int n : marks) {
            sum += n;
        }
        return sum / 5;
    }

    //count of poor marks
    public int count2() {
        int count = 0;
        for (int n : marks) {
            if (n == 2) {
                count++;
            }
        }
        return count;
    }

    //enroll in higher course
    public int pass() {
        if (year == 4) {
            return -1;
        }
        int n = count2();
        if (n == 0) {
            year++;
        }
        return n;
    }

    public void update(int sunjectNum, int mark) {
        marks[sunjectNum - 1] = mark;
    }
}

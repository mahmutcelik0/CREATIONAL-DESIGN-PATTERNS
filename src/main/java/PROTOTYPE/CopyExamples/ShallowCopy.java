package PROTOTYPE.CopyExamples;

public class ShallowCopy {
    private long number;
    private boolean isStudent;


    public ShallowCopy(long number, boolean isStudent) {
        this.number = number;
        this.isStudent = isStudent;
    }

    @Override
    public String toString() {
        return "ShallowCopy{" +
                "number=" + number +
                ", isStudent=" + isStudent +
                '}';
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

}

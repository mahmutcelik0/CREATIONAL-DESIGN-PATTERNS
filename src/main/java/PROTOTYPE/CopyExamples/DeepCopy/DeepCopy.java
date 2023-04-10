package PROTOTYPE.CopyExamples.DeepCopy;

public class DeepCopy implements Cloneable{
    private Name name;
    private long number;

    public DeepCopy(Name name, long number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepCopy copy = (DeepCopy) super.clone();
        copy.name = (Name) this.name.clone();
        return copy;
    }

    @Override
    public String toString() {
        return "DeepCopy{" +
                "name=" + name +
                ", number=" + number +
                '}';
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}

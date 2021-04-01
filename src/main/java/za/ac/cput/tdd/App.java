package za.ac.cput.tdd;

/**
 *
 * @author Kaylin De Wet 220025754
 */
public class App {
    private String stuName, stuSurname, stuNumber;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSurname() {
        return stuSurname;
    }

    public void setStuSurname(String stuSurname) {
        this.stuSurname = stuSurname;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public String toString() {
        return "App{" + "stuName=" + stuName + ", stuSurname=" + stuSurname + ", stuNumber=" + stuNumber + '}';
    }
}

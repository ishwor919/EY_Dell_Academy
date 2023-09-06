package SecondDay;

interface SampleData {

    void fullName(String firstName, String lastName);

}

public class someData implements SampleData {

    @Override

    public void fullName(String firstName, String lastName) {

        System.out.println("Name is " + firstName + " " + lastName);

    }
    public static void main(String[] args) {

        // TODO Auto-generated method stub

        someData obj = new someData();

        obj.fullName("XYZ", "ABC");
    }
}
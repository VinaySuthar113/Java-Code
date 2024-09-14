import java.util.Date;

public class Studentrn {
    private String RollNo;
    private static int count = 1;

    private String generateRollNo() {
        Date d = new Date();
        String rn = "Univ-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rn;
    }

    public Studentrn() {
        RollNo = generateRollNo();
    }

    public String getRollNo() {
        return RollNo;
    }
}

class StdRollNo {
    public static void main(String args[]) {
        Studentrn stdrn1 = new Studentrn();
        Studentrn stdrn2 = new Studentrn();
        Studentrn stdrn3 = new Studentrn();

        System.out.println("Roll number of student 1 is " + stdrn1.getRollNo());
        System.out.println("Roll number of student 2 is " + stdrn2.getRollNo());
        System.out.println("Roll number of student 3 is " + stdrn3.getRollNo());
    }
}

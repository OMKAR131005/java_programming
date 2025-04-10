
import java.time.Year;
public class Student {
    static Student[] array = new Student[20];
    static int ITCount = 0;
    static int cseCount = 0;
    static int eceCount = 0;
    static int MechCount = 0;
    static int chemCount=0;
    static int texttileCount=0;

    String email;
    String name;
    String regNo;
    String bloodGroup;
    int currentYear;
    String branch;
    int admissionYear;
    String mode;



    void setName(String name) {
        this.name = name;
    }

    void setRegNo() {
        String branchInitial = this.branch.substring(0, 2).toUpperCase();
        int sequenceNumber = 0;


        if (branchInitial.startsWith("C")) {
            sequenceNumber = ++cseCount;
        } else if (branchInitial.startsWith("E")) {
            sequenceNumber = ++eceCount;
        } else if (branchInitial.startsWith("I")) {
            sequenceNumber = ++ITCount;
        } else if (branchInitial.startsWith("ME")) {
            sequenceNumber = ++MechCount;
        } else if (branchInitial.startsWith("T")) {
            sequenceNumber = ++texttileCount;
        } else {
            sequenceNumber = ++chemCount;
        }
        if (mode.equals("DSY")) {
            sequenceNumber = 500 + sequenceNumber;
          this.regNo = this.admissionYear + "B" + branchInitial + sequenceNumber;
        } else {
           this.regNo = this.admissionYear + "B" + branchInitial+"0" + sequenceNumber;
        }
        setEmail(regNo);
    }

    void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    void setEmail(String regNo) {

        this.email = regNo+ "@sggs.ac.in";
    }

    void setCurrentYear(int admissionYear) {
        this.currentYear = (Year.now().getValue() - admissionYear) + 1;
    }

    void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    void setBranch(String branch) {
        this.branch = branch;
    }

    void setMode(String mode) {
         this.mode = mode;
    }

    void setInfo(String info) {
        String[] studs = info.split("#");
        int count = studs.length;

        for (int studentNo = 0; studentNo < count; studentNo++) {
            String[] student = studs[studentNo].split(",");
            Student s = new Student();
            for (String detail : student) {
                detail = detail.trim();
                if (detail.startsWith("Name=")) {
                    s.setName(detail.substring(5));
                } else if (detail.startsWith("Branch=")) {
                    s.setBranch(detail.substring(7));
                } else if (detail.startsWith("BloodGroup=")) {
                    s.setBloodGroup(detail.substring(11));
                } else if (detail.startsWith("AdmissionYear=")) {
                    s.setAdmissionYear(Integer.parseInt(detail.substring(14)));
                } else if (detail.startsWith("Mode=")) {
                    s.setMode(detail.substring(5));
                }
            }

            s.setRegNo();
            s.setCurrentYear(s.admissionYear);
            array[studentNo] = s;
        }
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("RegNo: " + regNo);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Current Year: " + currentYear);
        System.out.println("Branch: " + branch);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("Mode: " + mode);
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.setInfo("Name=Omkar Gawande,Branch=IT,BloodGroup=B+,AdmissionYear=2023,Mode=Regular#Name=Pratik Narwade,Branch=CSE,BloodGroup=A+,AdmissionYear=2021,Mode=Regular#Name=Pratik shinde,Branch=Mech,BloodGroup=A+,AdmissionYear=2024,Mode=DSY");
        for (Student s : array) {
            if (s != null) {
                s.displayInfo();
                System.out.println();
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}

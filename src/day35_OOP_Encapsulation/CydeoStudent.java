package day35_OOP_Encapsulation;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public int batch;
    public int group;
    public String fieldOfStudy;

    public static String school;
    public static String programmingLang;
    public static String code;

    public CydeoStudent(String name, int age, char gender, int batch, int group, String fieldOfStudy) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batch = batch;
        this.group = group;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        school = "Cydeo";
        programmingLang = "Java";
        code = "Wooden Spoon";
    }

    public static void printSchool () {
        System.out.println("school = " + school);
    }
    public static void school () {
        System.out.println("Everyone attends " + school + ".");
    }

    public void attendance () {
        System.out.println(name + " is attending class.");
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batch=" + batch +
                ", group=" + group +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}

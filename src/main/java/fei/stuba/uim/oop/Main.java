package fei.stuba.uim.oop;

public class Main {

    public static void main(String[] args) {
        Student prvyStudent = new Student(115669, "Fero", "Novotny", 21);

        Student druhyStudnet = new Student();
        druhyStudnet.setID(116354);
        druhyStudnet.setName("Peter");
        druhyStudnet.setSurename("Pan");
        druhyStudnet.setAge(22);

        System.out.println("ID : " + prvyStudent.ID + " Meno a priezvisko : " + prvyStudent.name + " " + prvyStudent.surename + " Vek : " + prvyStudent.age);
        System.out.println("ID : " + druhyStudnet.getID() + " Meno a priezvisko : " + druhyStudnet.getName() + " " + druhyStudnet.getSurename() + " Vek : " + druhyStudnet.getAge());

    }
}

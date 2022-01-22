import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Punkt punktA = new Punkt(7);
        punktA.toString();
        new Punkt(2,3,5);
        punktA.toString();
    punktA.setX(5);
    punktA.setY(6);
    punktA.toString();

        System.out.println(punktA.getX());
        System.out.println(punktA.getY());
        System.out.println(punktA.getX()+punktA.getY());
        System.out.println(punktA.getX()-punktA.getY());

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        student1.setImie("Kacper").setNazwisko("Bury").setIndeks(54421).setWydzial(WydzialEnum.INFORMATYKA);
        student2.setImie("Bacper").setNazwisko("Dury").setIndeks(34322).setWydzial(WydzialEnum.HUMANISTYCZNY);
        student3.setImie("Sacper").setNazwisko("Vury").setIndeks(23434).setWydzial(WydzialEnum.INFORMATYKA);
        student4.setImie("Hacper").setNazwisko("Pury").setIndeks(11124).setWydzial(WydzialEnum.INFORMATYKA);
        student5.setImie("Aacper").setNazwisko("Mury").setIndeks(53325).setWydzial(WydzialEnum.MATEMATYKA);
        List<Student> list = new ArrayList();

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        for (Student student:list) {
            System.out.println(student.toString());
        }

        }
    }


public class zad2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        student1.imie = "Kacper";
        student2.imie = "Bacper";
        student3.imie = "Sacper";
        student1.nazwisko = "Bury";
        student2.nazwisko = "Rury";
        student3.nazwisko = "Kury";
        student1.pełnoletni = true;
        student2.pełnoletni = false;
        student3.pełnoletni = true;
        student1.wiek = 22;
        student2.wiek = 12;
        student3.wiek = 21;
        Student[] tab = new Student[3];
        tab[0] = student1;
        tab[1] = student2;
        tab[2] = student3;
        for (int i = 0; i <= tab.length-1; i++){
            System.out.println("Student"+(i+1)+ " Imię: " +tab[i].imie + " Nazwisko: " +tab[i].nazwisko + " Wiek: " +tab[i].wiek + " Pełnoletni: "+ tab[i].pełnoletni);
        }

    }
}

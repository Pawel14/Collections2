import javax.sound.sampled.Line;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class WczytywanieInfoPracownikow {

    public class Employee {
        private String name;
        private String surname;
        private String position;
        private Long id;

        public Employee(String name, String surname, String position, Long id) {
            this.name = name;
            this.surname = surname;
            this.position = position;
            this.id = id;
        }

    }

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Pawel\\Desktop\\input.txt");
        Scanner in = new Scanner(file);
        String zdanie = in.nextLine();
        String[] splitArray= zdanie.split(";");
        System.out.println(zdanie);








    }

}

package org.ko.seri;

import org.apache.jute.BinaryInputArchive;
import org.apache.jute.BinaryOutputArchive;
import org.junit.Test;

import java.io.*;

/**
 * description: SeriTest <br>
 * date: 2020/4/25 18:00 <br>
 *
 * @author K.O <br>
 * @version 1.0 <br>
 */
public class SeriTest {

    @Test
    public void javaSeriTest() throws IOException, ClassNotFoundException {
        Student student = new Student("K.O", 18, 2L);
        String path = "javaser.txt";
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(new File(path)));
        stream.writeObject(student);

        System.out.println("---java serialize---");

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File(path)));
        Student student1 = (Student)inputStream.readObject();

        System.out.println(student1.toString());
    }

    @Test
    public void zkJuteTest() throws IOException {
        Student student = new Student("K.O", 18, 2L);
        String path = "juteser.txt";

        OutputStream outputStream = new FileOutputStream(new File(path));
        BinaryOutputArchive binaryOutputArchive = BinaryOutputArchive.getArchive(outputStream);

        binaryOutputArchive.writeString(student.getUsername(), "username");
        binaryOutputArchive.writeInt(student.getAge(), "age");
        binaryOutputArchive.writeLong(student.getGrade(), "grade");

        outputStream.flush();
        outputStream.close();

        System.out.println("---jute serialize---");

        InputStream inputStream = new FileInputStream(new File(path));
        BinaryInputArchive binaryInputArchive = BinaryInputArchive.getArchive(inputStream);

        String username = binaryInputArchive.readString("username");
        int age = binaryInputArchive.readInt("age");
        long grade = binaryInputArchive.readLong("grade");

        Student student1 = new Student(username, age, grade);
        System.out.println(student.toString());
    }
}

package org.ko.seri;

import java.io.Serializable;

/**
 * description: Student <br>
 * date: 2020/4/25 17:49 <br>
 *
 * @author K.O <br>
 * @version 1.0 <br>
 */
public class Student implements Serializable {

    private String username;

    private int age;

    private long grade;

    public Student() {
    }

    public Student(String username, int age, long grade) {
        this.username = username;
        this.age = age;
        this.grade = grade;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getGrade() {
        return grade;
    }

    public void setGrade(long grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

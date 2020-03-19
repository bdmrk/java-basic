package info.kausar.collection_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stu implements Comparable<Stu> {
    int rollNo, marks;
    String name;

    public Stu(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
    }

    //when we print the object it should print the value . so need to override the toString();
    @Override
    public String toString() {
        return "Stu{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Stu stu) {
        return marks>stu.marks?1 : -1;
//        return name.length()>stu.name.length()?1 : -1;
    }
}

public class GenericAndComparable {
    public static void main(String[] args) {

        List<Stu> stuList = new ArrayList<>();
        stuList.add(new Stu(1,"Kausar",90));
        stuList.add(new Stu(2,"Shafi",69));
        stuList.add(new Stu(3,"Roy",55));
        stuList.add(new Stu(3,"Mashuk",66));
        stuList.add(new Stu(3,"Fuad",56));

        Collections.sort(stuList); // in future if we want to change the sorting logic we need to do below code

       // Collections.sort(stuList, (i,j)->i.marks > j.marks?1 : 0);

        for (Stu s : stuList) {
            System.out.println(s);
        }

    }
}

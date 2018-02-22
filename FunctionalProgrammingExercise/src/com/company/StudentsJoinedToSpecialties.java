package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentsJoinedToSpecialties {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        List<StudentSpeciality> students = new ArrayList<>();
        List<StudentSpeciality> studentsSpec = new ArrayList<>();

        //readInputAndAddToArray("Students:", studentsSpec, bf);
        while (true){
            String[] line = bf.readLine().split("\\s+");
            if ("Students:".equalsIgnoreCase(line[0])){
                break;
            }
            studentsSpec.add(new StudentSpeciality(line[0]+line[1], line[2]));
        }
        while (true){
            String[] line = bf.readLine().split("\\s+");
            if ("END".equalsIgnoreCase(line[0])){
                break;
            }
            students.add(new StudentSpeciality(line[1]+line[2], line[0]));
        }
        List<String> result = new ArrayList<>();

        students.stream().sorted(Comparator.comparing(StudentSpeciality::getName))
                .forEach(student -> {studentsSpec.stream()
                .filter((spec)->spec.getNumber().equalsIgnoreCase(student.getNumber()))
                        .forEach(speciality->{
                            System.out.printf("%s %s %s\n",student.getName().trim(),student.getNumber(), speciality.getName());
                        });
                });

    }
}

class StudentSpeciality{
    private String name;
    private  String number;

    StudentSpeciality(String _name, String num){
        this.setName(_name);
        this.setNumber(num);

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

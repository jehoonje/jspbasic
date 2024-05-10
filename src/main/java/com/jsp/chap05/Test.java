package com.jsp.chap05;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        JdbcBasic jdbc = new JdbcBasic();

//        jdbc.insert(new Person(99, "홍길동", 30));
//        jdbc.insert(new Person(200, "김동동", 82));
//        jdbc.insert(new Person(300, "희희희", 12));

//        jdbc.delete(200);
//        jdbc.delete(99);

//        jdbc.update(300, "고라니", 35);

        List<Person> people = jdbc.findAll();

        System.out.println("people = " + people);


    }
}

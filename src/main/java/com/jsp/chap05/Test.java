package com.jsp.chap05;

public class Test {

    public static void main(String[] args) {

        JdbcBasic jdbc = new JdbcBasic();

//        jdbc.insert(new Person(99, "홍길동", 30));
//        jdbc.insert(new Person(200, "김동동", 82));
//        jdbc.insert(new Person(300, "희희희", 12));

        jdbc.delete(200);
        jdbc.delete(99);

    }
}

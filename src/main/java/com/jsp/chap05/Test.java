package com.jsp.chap05;

public class Test {
    public static void main(String[] args) {
        jdbcBasic jdbc = new jdbcBasic();

//        jdbc.insert(new Person(99,"고길동",30));
//        jdbc.insert(new Person(200,"김철철",45));
//        jdbc.insert(new Person(300,"박희희",70));

//        jdbc.delete(200);
//        jdbc.delete(99);

//        jdbc.update(300,"삼백이",333);

        jdbc.findAll();


    }
}

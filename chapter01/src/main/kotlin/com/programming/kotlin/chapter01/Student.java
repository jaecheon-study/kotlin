package com.programming.kotlin.chapter01;

public class Student {
    /**
     * Kotlin package와 동일 선상에 있는 자바 클래스는
     * 설정을 해주지 않으면 에러를 발생 시킨다 (클래스 파일을 찾을수 없음)
     * build.gradle에서 따로 설정을 해준다.
     */
    private final String name;

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
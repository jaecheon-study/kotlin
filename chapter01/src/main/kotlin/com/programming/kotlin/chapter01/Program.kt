package com.programming.kotlin.chapter01

fun main() {
    println("Hello World")
    // 자바와 차이점은 인스턴스를 생성할 때 new를 사용하지 않는다.
    val student = Student("Alexandra Miller")
    println("Student Name : ${student.name}")
    val carManufacture = CarManufacturer("mercedes")
    println("carMAnufacture: ${carManufacture.name}")

}
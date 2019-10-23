package com.programming.kotlin.chapter01

fun main(args: Array<String>) {
    // 자바보다 더 간결하게 문자열을 표현할 수 있다.
    val name = "Sam"
    var str = "Hello $name"
    println(str)

    // 임의의 표현식은 접두사로 $를 추가하고 {}로 감싼다.
    val name1 = "Sam"
    var str1 = "Hello $name1. Your name has $name.length characters."
    var str2 = "Hello $name1. Your name has ${name.length} characters."
    println(str1)
    println(str2)

}
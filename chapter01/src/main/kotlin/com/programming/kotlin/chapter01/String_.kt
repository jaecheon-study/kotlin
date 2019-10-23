package com.programming.kotlin.chapter01

fun main(args: Array<String>) {

    val char = 'a'
    val char1 = 'b'

    // 이스케이프
    val a = '\t'
    val b = '\b'
    val c = '\n'
    val d = '\r'
    val e = '\\'
    val f = '\$'

    println(char)
    println(char1)

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)


    /**
     * 문자열
     * 자바와 마찬가지로 불변. 문자열 리터널은
     * 이중 따옴표나 삼중 따옴표를 사용한다.
     * 이중 따옴표를 사용하면 이스케이프된 문자열 생성.
     * 이스케이프 된 문자열에서 개행 (new line)과 같은 특수문자는 반드시
     * 이스케이프 돼야한다.
     */
    val string = "String with \n new Line"
    println(string)
    val rawString = """
        raw String is super useful
        for strings that span many lines
    """.trimIndent()
    println(rawString)
}
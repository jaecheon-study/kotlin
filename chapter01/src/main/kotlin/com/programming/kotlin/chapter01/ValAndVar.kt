package com.programming.kotlin.chapter01

fun main() {

    /**
     * 코틀린에서는 변수를 선언하기 위한 키워드가 2개 존재한다.
     * val과 val
     * var는 변경 가능한 변수 선언 키워드 (값을 변경 할 수 있다.)
     * val는 읽기 전용 변수 선언 키워드 (값을 변경 할 수 없다.)
     */
    var name = "kotlin"

    var name1: String
    name1 = "kotlin"

    var name2 = "kotlin"
    name2 = "more kotlin"

    println(name2)

    // 읽기 전용 키워드
    val name3 = "kotlin"
    // name3 = "more kotlin" // 에러 발생

    val name4: String = "Java"
    println(name4)

    // 숫자 리터널
    val int = 123
    // Long은 뒤에 L을 붙여야한다.
    val long = 123456L
    val double = 12.34
    // Float은 뒤에 F를 붙여야 한다.
    val float = 12.34F
    // hexadecimal은 앞에 0x로 시작.
    val hexadecimal = 0xAB
    // binary는 앞에 0b로 시작한다.
    val binary = 0b01010101

    println(int)
    println(long)
    println(double)
    println(float)
    println(hexadecimal)
    println(binary)

    /**
     * 숫자의 형변환
     * toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()가 있다.
     */
    val int1 = 123
    val long1 = int1.toLong()
    println(long1)
    var int2 = 123
    val long2 = int2.toLong()
    println(long2)

    val float1 = 12.34f
    val double1 = float1.toDouble()
    println(double1)

    val double2 = 12.5595959
    val float2 = double2.toFloat()
    println(float2)

    /**
     * 비트 연산자. 왼쪽 비트 이동, 오른쪽 비트 이동,
     * 부호가 없는 오른쪽 비트 이동, 논리곱, 논리합,
     * 베타적 논리합을 지원
     * 자바와 달리, 내장 연산자가 아니라 이름이 있는 함수.
     * 하지만 연산자처럼 실행할 수 있다.
     */
    val leftShift = 1 shl 2
    val rightShift = 1 shr 2
    val unsignedRightShift = 1 ushr 2

    val and = 1 and 0x00001111
    val or = 1 or 0x00001111
    val xor = 1 xor 0x00001111
    // inverse(역)은 이항 연산자가 아니라 단항 연사자이기 때문에
    // 숫자에 dot (.) 연산자를 사용해 호출
    val inv = 1.inv()

    println(leftShift)
    println(rightShift)
    println(unsignedRightShift)

    println(and)
    println(or)
    println(xor)
    println(inv)

}
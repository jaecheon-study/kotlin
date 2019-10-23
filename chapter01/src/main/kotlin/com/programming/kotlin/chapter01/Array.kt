package com.programming.kotlin.chapter01

fun main(args: Array<String>) {
    /**
     * 코틀린의 배열은 arrayof() 함수를 통해서 생성한다.
     */
    var array = arrayOf(1, 2, 3)
    println(array[0])
    println(array.get(0))

    array[0] = 10
    println(array.get(0))
    array.set(1, 400)
    println(array.get(1))

    // 0 ~ 9의 크기
    // 각 해당 배열 원소의 제곱
    val perfectSquares = Array(10, {k -> k * k})
    for (i in perfectSquares) {
        println(i)
    }

}
package com.programming.kotlin.chapter01

fun main(args: Array<String>) {
    val x = 1
    val y = 2
    val z = 2

    val isTrue = x < y && x < z
    val alsoTrue = x == y || y == z

    println(isTrue)
    println(alsoTrue)

}
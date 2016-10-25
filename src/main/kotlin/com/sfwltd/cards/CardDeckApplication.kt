package com.sfwltd.cards

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class CardDeckApplication

fun main(args: Array<String>) {
    SpringApplication.run(CardDeckApplication::class.java, *args)
}
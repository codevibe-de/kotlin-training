package exrc.chpt_030

import org.assertj.core.api.Assertions.assertThat

open class Animal

class Carp : Fish()

open class Fish : Animal()

open class Mammal : Animal()

class Shark : Fish()

class Tiger : Mammal()

class Whale : Mammal()

fun main() {
    val willy = Whale()
    assertThat(willy).isInstanceOf(Animal::class.java)
    assertThat(willy).isInstanceOf(Mammal::class.java)
    assertThat(willy).isInstanceOf(Whale::class.java)
}
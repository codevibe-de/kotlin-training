package exrc.chpt_030

import org.assertj.core.api.Assertions.assertThat

data class Vector(val x: Int, val y: Int) {
    operator fun plus(vector: Vector): Vector {
        return Vector(this.x + vector.x, this.y + vector.y)
    }

    operator fun minus(vector: Vector): Vector {
        return Vector(this.x - vector.x, this.y - vector.y)
    }

    operator fun unaryMinus(): Vector {
        return Vector(-this.x, -this.y)
    }

    operator fun get(c: Char): Int {
        return when (c) {
            'x' -> this.x
            'y' -> this.y
            else -> throw IllegalArgumentException(c.toString())
        }
    }
}

fun main() {
    var v = Vector(0, 0)
    v += Vector(10, 5)
    assertThat(v).hasToString("Vector(x=10, y=5)")
    v -= Vector(5, 1)
    assertThat(v).hasFieldOrPropertyWithValue("x", 5)
    assertThat(v).hasFieldOrPropertyWithValue("y", 4)
    v = -v
    assertThat(v).isEqualTo(Vector(-5, -4))
    val (x, y) = v
    assertThat(x).isEqualTo(-5)
    assertThat(y).isEqualTo(-4)
    val x2 = v['x']
    val y2 = v['y']
    assertThat(x2).isEqualTo(-5)
    assertThat(y2).isEqualTo(-4)
}
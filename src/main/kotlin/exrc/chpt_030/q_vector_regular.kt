package exrc.chpt_030

import org.assertj.core.api.Assertions.assertThat

// alternative solution: a regular class instead of a data class,
// hence componentN(), equals(), hashCode() and toString() are implemented by hand
class RegularVector(val x: Int, val y: Int) {
    operator fun plus(vector: RegularVector): RegularVector {
        return RegularVector(this.x + vector.x, this.y + vector.y)
    }

    operator fun minus(vector: RegularVector): RegularVector {
        return RegularVector(this.x - vector.x, this.y - vector.y)
    }

    operator fun unaryMinus(): RegularVector {
        return RegularVector(-this.x, -this.y)
    }

    operator fun get(c: Char): Int {
        return when (c) {
            'x' -> this.x
            'y' -> this.y
            else -> throw IllegalArgumentException(c.toString())
        }
    }

    operator fun component1(): Int = x

    operator fun component2(): Int = y

    override fun equals(other: Any?): Boolean {
        return other is RegularVector && this.x == other.x && this.y == other.y
    }

    override fun hashCode(): Int {
        return 31 * x + y
    }

    override fun toString(): String {
        return "RegularVector(x=$x, y=$y)"
    }
}

fun main() {
    var v = RegularVector(0, 0)
    v += RegularVector(10, 5)
    assertThat(v).hasToString("RegularVector(x=10, y=5)")
    v -= RegularVector(5, 1)
    assertThat(v).hasFieldOrPropertyWithValue("x", 5)
    assertThat(v).hasFieldOrPropertyWithValue("y", 4)
    v = -v
    assertThat(v).isEqualTo(RegularVector(-5, -4))
    val (x, y) = v
    assertThat(x).isEqualTo(-5)
    assertThat(y).isEqualTo(-4)
    val x2 = v['x']
    val y2 = v['y']
    assertThat(x2).isEqualTo(-5)
    assertThat(y2).isEqualTo(-4)
}

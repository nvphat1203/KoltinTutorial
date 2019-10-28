package enemy

import java.util.*

class VampireKing (name: String): Vampire(name) {

    init {
        hitPoints = 50
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(2)
    }

    fun runAway(): Boolean {
        return lives < 2
    }

    fun doDodge(): Boolean {
        val rand = Random()
        val change = rand.nextInt(6)
        if (change > 3) {
            println("VampireKing dodges")
            return true
        }
        return false
    }
}
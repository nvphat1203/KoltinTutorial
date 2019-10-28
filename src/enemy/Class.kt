package enemy

open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {

    fun takeDamage(damage: Int) {
        val remainingHitPoints = hitPoints - damage
        if (remainingHitPoints > 0 ) {
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage, and has $hitPoints left")
        } else {
            lives--
            println("$name lost a life")
        }
    }

    override fun toString(): String {
        return "Name: $name, HitPoints: $hitPoints, Lives: $lives"
    }
}
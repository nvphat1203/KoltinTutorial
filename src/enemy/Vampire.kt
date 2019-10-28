package enemy

open class Vampire(name: String): Enemy(name, 20,5) {

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2)
    }
}
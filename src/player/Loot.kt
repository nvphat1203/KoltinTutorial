package player
enum class LootType {
    POTION,
    RING,
    ARMOR
}

class Loot(private val name: String, private val type: LootType?, private val value: Double = 1.0) {

    fun getName(): String {
        return name
    }

    fun getValue(): Double {
        return value
    }

    override fun toString(): String {
        return "$name of type $type, which has value of \$$value"
    }
}
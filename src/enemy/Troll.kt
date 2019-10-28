package enemy

class Troll(name: String, hitPoints: Int, lives: Int): Enemy(name, hitPoints, lives) {

    fun triggerBloodLust() {
        println("$name used blood lust")
    }
}
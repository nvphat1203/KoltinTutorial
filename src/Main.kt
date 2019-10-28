import enemy.Troll
import enemy.Enemy
import player.Loot
import player.LootType
import player.Player
import player.PlayerEducation

fun main(varargs: Array<String>) {
/*    val name: String = "Pete"
    println("My name is: $name")
    println("My name is: \$name")

    print("How old are you: ")
    val input = readLine()
    val age = input?.toIntOrNull()

    if (age == null) {
        println("You have not entered an integer: $input")
    } else {
        println("Your age is: $age")
    }*/

    val pete = Player("Pete", 19, 3_000_000)
    pete.createEducation("Bachelor", "Arkansas")

    pete.education = PlayerEducation("Master", "Stanford")
    pete.printEducation()
    pete.showSalary()

    val peter = Player("Peter", 16)
    peter.showSalary()

    val redPotion = Loot("Red Potion", LootType.POTION, 7.5)
    val leatherArmor = Loot("Leather Armor", LootType.ARMOR, 1_500.0)
    pete.addLoot(redPotion)
    pete.addLoot(leatherArmor)
    pete.showPlayerInventory()

    if (pete.dropLoot("Invisible Potion")) {
        println("Invisible potion dropped")
    } else {
        println("You do not have invisible potion")
    }

    val enemy = Enemy("Test Enemy", 10, 3)
    println(enemy)

    enemy.takeDamage(4)
    println(enemy)

    val uglyTroll = Troll("Ugly Troll", 25, 2)
    print(uglyTroll)
    uglyTroll.triggerBloodLust()
    uglyTroll.takeDamage(8)
    print(uglyTroll)
}

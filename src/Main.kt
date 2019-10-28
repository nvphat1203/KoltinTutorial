import enemy.Troll
import enemy.Enemy
import enemy.Vampire
import enemy.VampireKing
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

 /*   val pete = Player("Pete", 19, 3_000_000)
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

    val uglyTroll = Troll("Ugly Troll", 25, 2)
    println(uglyTroll)
    uglyTroll.triggerBloodLust()
    uglyTroll.takeDamage(8)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    val putin = VampireKing("Putin")
    println(putin)
    putin.takeDamage(100)
    println(putin)

    while (putin.lives > 0) {
        if (putin.doDodge()) continue

        if (putin.runAway()) {
            println("Putin has run away")
            break
        } else {
            putin.takeDamage(50)
        }
    }*/

    val conan = Player("Conan")
    conan.addLoot(Loot("Metal Armor", LootType.ARMOR, 2_000.0))
    conan.addLoot(Loot("Ring of Speed", LootType.RING, 5_000.0))
    conan.addLoot(Loot("Silver Ring", LootType.RING, 500.0))
    conan.addLoot(Loot("Silver Ring", LootType.RING, 500.0))
    conan.addLoot(Loot("Silver Ring", LootType.RING, 500.0))
    conan.addLoot(Loot("King's Ring", LootType.RING, 50_000.0))
    conan.addLoot(Loot("Health Potion", LootType.POTION, 5.0))
    conan.addLoot(Loot("Energy Potion", LootType.POTION, 5.0))
    conan.addLoot(Loot("Leather Helmet", LootType.ARMOR, 800.0))
    conan.addLoot(Loot("Leather Boots", LootType.ARMOR, 300.0))
    conan.addLoot(Loot("Leather Gloves", LootType.ARMOR, 150.0))
    conan.addLoot(Loot("Golden Ring", LootType.RING, 1_500.0))
    conan.addLoot(Loot("Golden Ring", LootType.RING, 1_500.0))
    conan.addLoot(Loot("Golden Ring", LootType.RING, 1_500.0))
    conan.dropLoot("Golden Ring")
    conan.showPlayerInventory()

}

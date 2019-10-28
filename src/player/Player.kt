package player

import player.Loot
import player.PlayerEducation

open class Player(private val name: String, private val age: Int = 20, private val salary: Int = 1_000_000) {
    lateinit var  education: PlayerEducation
    private val inventory = ArrayList<Loot>()

    init {
        if (age >= 18) {
            println("Hello $name, you are $age and are eligible to vote")
        }
    }

    fun addLoot(item: Loot) {
        inventory.add(item)
    }

    fun dropLoot(item: Loot): Boolean {
        return if(inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    fun dropLoot(name: String): Boolean {
        println("$name will be dropped")
        //return inventory.removeIf { it.getName() == name}
        for (item in inventory) {
            if (item.getName() == name) {
                inventory.remove(item)
                return true
            }
        }
        return false
    }

    fun showPlayerInventory() {
        var total = 0.0
        for (i in inventory) {
            println("$name has: $i")
            total += i.getValue()
        }

        println("Total inventory value: $total  ")
    }

    fun createEducation(degree: String, school: String) {
        education = PlayerEducation(degree, school)
        printEducation()
    }

    fun printEducation() {
        println("$name's education: ${education.getDegree()} from ${education.getSchool()}")
    }

    internal fun showSalary() {
        println("$name's salary is: $salary")
    }

    override fun toString(): String {
        return "\nThis is $name\n" +
                "$name is $age year(s) old \n" +
                "$name has a salary of $$salary \n" +
                "$name has a degree of ${education.getDegree()} from ${education.getSchool()} \n" +
                "$name inventory right now: ${inventory}\n"
    }
}
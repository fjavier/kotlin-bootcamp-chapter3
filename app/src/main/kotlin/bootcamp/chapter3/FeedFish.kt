package bootcamp.chapter3

import java.util.Random

class FeedFish {
    fun feedTheFish(){
        val day:String = randomDay()
        val food = fishFood(day)
        println("Today is $day and the fish eat $food")
    }

    private fun randomDay(): String {
        val week = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado","Domingo")
        return week[Random().nextInt(week.size)]

    }

    fun fishFood(day:String):String{
        val food:String
        when(day){
            "Lunes"-> food = "Flakes"
            "Martes"-> food = "pellets"
            //"Miercoles"-> food = "Redworms"
            //"Jueves"-> food = "Granules"
            "Viernes"-> food = "Mosquitoes"
            "Sabado"-> food = "lettuce"
            "Domingo"-> food = "plankton"
            else -> food = "Gallo pinto"
        }
        return food
    }
}
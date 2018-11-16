package com.mummyx.idlechef

import android.widget.TextView

class UserValues{
    companion object {

        //Player Cash
        var cash:Double = 0.0

        val checkpoints: IntArray = intArrayOf(10,25,50,100)

        var mainMoneyTV: TextView? = null

        //Double Array Values (Level, Income, Price, Time in Seconds)
        val ingredientsMap = mutableMapOf(
            Pair(IngredientType.POTATO, Potato()),
            Pair(IngredientType.CARROT, Carrot()),
            Pair(IngredientType.BROCCOLI, Broccoli()),
            Pair(IngredientType.APPLE, Apple()),
            Pair(IngredientType.PEAR, Pear()),
            Pair(IngredientType.STRAWBERRY, Strawberry()),
            Pair(IngredientType.KIWI, Kiwi()),
            Pair(IngredientType.MELON, Melon())
        )
        //var ingredientRunning : BooleanArray = booleanArrayOf(false, false)
        val ingredientsRunning = mutableMapOf(
            Pair(IngredientType.POTATO, false),
            Pair(IngredientType.CARROT, false),
            Pair(IngredientType.BROCCOLI, false),
            Pair(IngredientType.APPLE, false),
            Pair(IngredientType.PEAR, false),
            Pair(IngredientType.STRAWBERRY, false),
            Pair(IngredientType.KIWI, false),
            Pair(IngredientType.MELON, false)
        )
    }
}

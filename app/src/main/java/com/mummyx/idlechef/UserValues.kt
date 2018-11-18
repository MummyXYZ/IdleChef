package com.mummyx.idlechef

import android.widget.TextView
import com.mummyx.idlechef.models.*

class UserValues {
    companion object {

        //Player Cash
        var cash: Double = 0.0

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
    }
}

package com.mummyx.idlechef.models

open class Ingredient(
    val name: String,
    var level: Int,
    var income: Double,
    var incomeMulti: Double,
    var price: Double,
    var priceMulti: Double,
    var unlocked: Boolean,
    var unlockprc: Double,
    var seen: Boolean,
    var upgradeTime: Long,
    var upgradeStart: Long = 0
)

object Supplier {
    val items = listOf(
        Potato(),
        Carrot(),
        Broccoli(),
        Apple(),
        Pear(),
        Strawberry(),
        Kiwi(),
        Melon()
    )
}

class Potato : Ingredient(
    // Name of Ingredient
    "Potato",
    // Level Increments of 1
    1,
    // Base Income
    1.0,
    // Income Multiplier (income * incomeMulti = Current Income)
    1.0,
    4.0,
    1.0,
    true,
    0.0,
    true,
    10000
)

class Carrot : Ingredient(
    // Name of Ingredient
    "Carrot",
    // Level Increments of 1
    1,
    // Base Income
    60.0,
    // Income Multiplier (income * incomeMulti = Current Income)
    1.0,
    // Base Upgrade Price
    66.7,
    // Price Multiplier (price * priceMulti = Current Price)
    1.0,
    // Has the Ingredient been purchased yet?
    false,
    // Price to purchase Ingredient
    60.0,
    false,
    2000
)

class Broccoli : Ingredient(
    // Name of Ingredient
    "Broccoli",
    // Level Increments of 1
    1,
    // Base Income
    540.0,
    // Income Multiplier (income * incomeMulti = Current Income)
    1.0,
    // Base Upgrade Price
    809.0,
    // Price Multiplier (price * priceMulti = Current Price)
    1.0,
    // Has the Ingredient been purchased yet?
    false,
    // Price to purchase Ingredient
    720.0,
    false,
    6000
)

class Apple : Ingredient(
    // Name of Ingredient
    "Apple",
    // Level Increments of 1
    1,
    // Base Income
    6480.0,
    // Income Multiplier (income * incomeMulti = Current Income)
    1.0,
    9818.2,
    1.0,
    false,
    8640.0,
    false,
    12000
)

class Pear : Ingredient(
    // Name of Ingredient
    "Pear",
    // Level Increments of 1
    1,
    // Base Income
    77760.0,
    // Income Multiplier (income * incomeMulti = Current Income)
    1.0,
    119172.40,
    1.0,
    false,
    103680.0,
    false,
    18000
)

class Strawberry : Ingredient(
    // Name of Ingredient
    "Strawberry",
    // Level Increments of 1
    1,
    // Base Income
    622080.0,
    1.0,
    1446697.70,
    1.0,
    false,
    1244160.0,
    false,
    96000
)

class Kiwi : Ingredient(
    // Name of Ingredient
    "Kiwi",
    // Level Increments of 1
    1,
    // Base Income
    6718464.0,
    1.0,
    17360372.1,
    1.0,
    false,
    14929920.0,
    false,
    1536000
)

class Melon : Ingredient(
    // Name of Ingredient
    "Melon",
    // Level Increments of 1
    1,
    // Base Income
    89579520.0,
    1.0,
    210775342.0,
    1.0,
    false,
    179159040.0,
    false,
    3072000
)


/*
open class Ingredientt(
    val type : IngredientType,
    val name : String,
    var unlocked : Boolean,
    var unlockprc : Double,
    var level : Int,
    var income : Double,
    var multi : Double,
    var multiprcmulti : Double,
    var multiprc : Double,
    var price : Double,
    var tiMS : Long,
    var progress : Long,
    var completeTime : Long = 0)

class Potatot : Ingredientt(
    IngredientType.POTATO,
    "Potato",
    true,
    0.0,
    1,
    1.0,
    1.0,
    1.07,
    1.0,
    4.0,
    1000,
    0)

class Carrott : Ingredientt(
    IngredientType.CARROT,
    "Carrot",
    false,
    60.0,
    1,
    //.1
    60.0,
    1.0,
    1.15,
    1.0,
    66.7,
    //Multi 2
    2000,
    0)
class Broccolit : Ingredientt(
    IngredientType.BROCCOLI,
    "Broccoli",
    false,
    720.0,
    1,
    //.75
    540.0,
    1.0,
    1.14,
    1.0,
    809.0,
    //Multi 3
    6000,
    0)
class Applet : Ingredientt(
    IngredientType.APPLE,
    "Apple",
    false,
    8640.0,
    1,
    //.75
    6480.0,
    1.0,
    1.13,
    1.0,
    9818.2,
    //Multi 2
    12000,
    0)
class Peart : Ingredientt(
    IngredientType.PEAR,
    "Pear",
    false,
    103680.0,
    1,
    //.75
    77760.0,
    1.0,
    1.12,
    1.0,
    119172.40,
    //Multi 1.5
    18000,
    0)
class Strawberryt : Ingredientt(
    IngredientType.STRAWBERRY,
    "Strawberry",
    false,
    1244160.0,
    1,
    //.5
    622080.0,
    1.0,
    1.11,
    1.0,
    1446697.70,
    //Multi 5.33333333
    96000,
    0)
class Kiwit : Ingredientt(
    IngredientType.KIWI,
    "Kiwi",
    false,
    14929920.0,
    1,
    //.45
    6718464.0,
    1.0,
    1.1,
    1.0,
    17360372.1,
    //Multi 16
    1536000,
    0)
class Melont : Ingredientt(
    IngredientType.MELON,
    "Melon",
    false,
    179159040.0,
    1,
    //.5
    89579520.0,
    1.0,
    1.09,
    1.0,
    210775342.2,
    10000,
    0)*/
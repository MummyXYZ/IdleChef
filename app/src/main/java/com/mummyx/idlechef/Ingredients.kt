package com.mummyx.idlechef

//Values (Name, Level, Income, Price, Time in Seconds)
open class Ingredient(
    val type:IngredientType,
    val name : String,
    var unlocked : Boolean,
    var unlockprc : Double,
    var level : Int,
    var income : Double,
    var multi : Double,
    var multiprcmulti : Double,
    var multiprc: Double,
    var price: Double,
    var tiMS: Long,
    var progress: Long,
    var completeTime: Long = 0)

class Potato : Ingredient(
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

class Carrot : Ingredient(
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
class Broccoli : Ingredient(
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
class Apple : Ingredient(
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
class Pear : Ingredient(IngredientType.PEAR,
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
class Strawberry : Ingredient(
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
class Kiwi : Ingredient(
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
class Melon : Ingredient(
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
    0)
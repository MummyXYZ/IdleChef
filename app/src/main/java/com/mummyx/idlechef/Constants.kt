package com.mummyx.idlechef

import com.mummyx.idlechef.models.*

class Constants {
    companion object {
        val checkpoints: IntArray = intArrayOf(10, 25, 50, 100)

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
}
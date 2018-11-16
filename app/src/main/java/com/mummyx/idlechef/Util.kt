package com.mummyx.idlechef

import android.util.Log
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*

object Util
{
    fun ft(ft:Double) = "$" + DecimalFormat("#,###.##").format(ft)
}
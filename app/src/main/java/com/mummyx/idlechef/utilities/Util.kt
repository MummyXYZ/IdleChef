package com.mummyx.idlechef.utilities

import java.text.DecimalFormat

object Util
{
    fun ft(ft:Double) = "$" + DecimalFormat("#,###.##").format(ft)
}
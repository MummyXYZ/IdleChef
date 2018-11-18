package com.mummyx.idlechef

import android.support.v7.util.DiffUtil
import com.mummyx.idlechef.models.Ingredient


internal class DiffUtilCallback(
    private val oldItems: List<Ingredient>,
    private val newItems: List<Ingredient>
) : DiffUtil.Callback() {

    override fun getOldListSize() = oldItems.size

    override fun getNewListSize() = newItems.size

    override fun areItemsTheSame(oldPosition: Int, newPosition: Int): Boolean
            = oldItems[oldPosition] == newItems[newPosition]

    override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean
            = oldItems[oldPosition] == newItems[newPosition]


    override fun getChangePayload(oldPosition: Int, newPosition: Int): Any? {
        //return super.getChangePayload(oldPosition, newPosition)
        return newItems[newPosition].level - oldItems[oldPosition].level

    }

}
package com.mummyx.idlechef.adapters

import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.mummyx.idlechef.DiffUtilCallback
import com.mummyx.idlechef.models.Ingredient
import com.mummyx.idlechef.ItemViewHolder
import com.mummyx.idlechef.R
import com.mummyx.idlechef.UserValues

class IngredientAdapter(private val inflater: LayoutInflater) : RecyclerView.Adapter<ItemViewHolder>() {

    private var items: List<Ingredient> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        Log.v("Logged", "onCreateViewHolder")
        val view = inflater.inflate(R.layout.itemrow, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        Log.v("LoggedIA", "onBindViewHolder 2 var")
        holder.bind(this, items[position])
    }

    override fun getItemCount(): Int {
        val test = items.filter {it.unlocked || UserValues.cash >= it.unlockprc || it.seen}.size
        return test

        //var count = 0
        //for(n in 0 until items.size){
        //    if (items[n].unlocked || UserValues.cash >= items[n].unlockprc) count += 1
        //}
        //return count
    }

    fun updateItems(items: List<Ingredient>) {
        Log.v("LoggedIA", "Diff Update")
        val diffCallback = DiffUtilCallback(this.items, items)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        this.items = items

        diffResult.dispatchUpdatesTo(this)
    }
}
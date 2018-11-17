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

class IngredientAdapter(private val inflater: LayoutInflater) : RecyclerView.Adapter<ItemViewHolder>(){

    private var items: List<Ingredient> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        Log.v("Logged", "onCreateViewHolder")
        val view = inflater.inflate(R.layout.itemrow, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        Log.v("LoggedIA", "onBindViewHolder 2 var")
        holder.setItem(items[position])
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int, payloads: List<Any>) {
        Log.v("LoggedIA", "onBindViewHolder 3 var")
        if(!payloads.isEmpty()){
            when (payloads[0]){
                //Ingredient. -> {
                //    bindViewHolder(holder, items[position].level)
                //}
            }
        }
        holder.updateItem(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun updateItems(items: List<Ingredient>){
        Log.v("LoggedIA","Diff Update")
        val diffCallback = DiffUtilCallback(this.items, items)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        this.items = items

        diffResult.dispatchUpdatesTo(this)


        //this.items = items
    }
}
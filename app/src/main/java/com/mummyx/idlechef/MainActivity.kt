package com.mummyx.idlechef

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Job

class MainActivity : AppCompatActivity(), JobHolder {

    override var job = Job()
    private lateinit var adapter: IngredientAdapter
    private var oldItems: List<Ingredient> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v("LoggedMA", "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        mainScroll.layoutManager = layoutManager
        adapter = IngredientAdapter(layoutInflater)
        mainScroll.adapter = adapter

        val items: List<Ingredient> = listOf(
            Potato(),
            Carrot(),
            Broccoli(),
            Apple(),
            Pear(),
            Strawberry(),
            Kiwi(),
            Melon()
        )

        adapter.updateItems(items)


        UserValues.mainMoneyTV = mainHeaderCash
        mainHeaderCash.text = Util.ft(UserValues.cash)
        //loadItems()


        //private fun loadItems() {
            //jobHolder.add {
            //val newItems = sorted.filter { it.endsWith() }
            //adapter.updateItems(newItems)
            //val result = DiffUtil.calculateDiff((DiffUtilCallback(oldItems, newItems)))
        //}
    }
}
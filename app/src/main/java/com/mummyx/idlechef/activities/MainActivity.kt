package com.mummyx.idlechef.activities

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle
import android.util.Log
import com.mummyx.idlechef.*
import com.mummyx.idlechef.adapters.IngredientAdapter
import com.mummyx.idlechef.models.Supplier.items
import com.mummyx.idlechef.utilities.Util

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: IngredientAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.v("LoggedMA", "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()

        adapter.updateItems(items)

        UserValues.mainMoneyTV = mainHeaderCash
        mainHeaderCash.text = Util.ft(UserValues.cash)
    }

    private fun setUpRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        mainScroll.layoutManager = layoutManager
        adapter = IngredientAdapter(layoutInflater)
        mainScroll.adapter = adapter
    }
}

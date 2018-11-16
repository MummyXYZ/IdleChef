package com.mummyx.idlechef

import android.support.v7.widget.RecyclerView.ViewHolder
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.view.View.OnClickListener
import android.widget.TextView
import com.mummyx.idlechef.R.layout.activity_main
import kotlinx.android.synthetic.main.itemrow.view.*

class ItemViewHolder(private val rowLayout: View) : ViewHolder(rowLayout), OnClickListener {

    private var item: Ingredient? = null

    private var incomeText: TextView = rowLayout.findViewById(R.id.ingrIncome)
    private var levelText: TextView = rowLayout.findViewById(R.id.ingrLevel)
    private var nameText: TextView = rowLayout.findViewById(R.id.ingrName)
    private var upgradeButton: Button = rowLayout.findViewById(R.id.ingrUpgrade)
    private var ingrIcon: ImageView = rowLayout.findViewById(R.id.ingrIcon)


    init {
        Log.v("LoggedIVH", "Init $item")
        render()
        upgradeButton.setOnClickListener(this)
        ingrIcon.setOnClickListener(this)
    }

    override fun onClick(view: View?){
        if (view == upgradeButton){
            Log.v("LoggedIVH", "ingrUpgrade Clicked")
            upgradeIngredients()
        }else if(view == ingrIcon){
            Log.v("LoggedIVH", "ingrIcon Clicked")
            updateIncome()
        }
        updateUpgrade()
    }

    fun updateItem(item: Ingredient){
        Log.v("LoggedIVH", "updateItem $item")
        this.item = item
        render()
    }

    fun setItem(item: Ingredient) {
        Log.v("LoggedIVH", "setItem $item")
        this.item = item
        render()
    }

    private fun render(){
        Log.v("LoggedIVH", "Render $item")
        val item = this.item ?: return
        nameText.text = item.name
        incomeText.text = item.income.toString()
        levelText.text = item.level.toString()
        upgradeButton.text = item.price.toString()
        updateUpgrade()
    }

    private fun updateIncome() {
        Log.v("LoggedIVH", "updateIncome $item")
        val item = this.item ?: return
        if (item.unlocked) {
            UserValues.cash += (item.income * item.multi)
            UserValues.mainMoneyTV?.text = Util.ft(UserValues.cash)
            if(UserValues.ingredientsMap[IngredientType.CARROT]?.unlocked == false && UserValues.cash >= UserValues.ingredientsMap[IngredientType.CARROT]?.price ?: return)
            {
                
            }
        }
    }sdfsdfsdfsdfsdsdf

    private fun upgradeIngredients(){
        Log.v("LoggedIVH", "upgradeIngredients $item")
    }

    private fun updateUpgrade(){
        with(rowLayout) {
            if (UserValues.cash >= item?.price?: return) {
                ingrUpgrade.setBackgroundResource(R.drawable.ic_ingredient_upgrade_affordable)
            } else {
                ingrUpgrade.setBackgroundResource(R.drawable.ic_ingredient_upgrade_not_affordable)
            }
        }
    }



    /*fun bind(v: Ingredient) {
        with(rowLayout) {
            ingrName.text = v.name
            ingrLevel.text = v.level.toString()
            ingrIncome.text = Util.ft(v.income)


            ingrIcon.setOnClickListener {
                if (v.unlocked) {
                    if (UserValues.ingredientsRunning[v.type] == false) {
                        Log.v("Ingredient", v.name)
                        UserValues.ingredientsRunning[v.type] = true
                        updateIngredient(v.type)
                    }
                }
            }
            ingrUpgrade.setOnClickListener {
                upgradeIngredient(v)
            }
        }
    }

    private fun updateIngredient(ingredient: IngredientType) = GlobalScope.launch {
        val i = UserValues.ingredientsMap[ingredient] ?: return@launch
        i.completeTime = System.currentTimeMillis() + i.tiMS

        /*for (n in 0 until 100) {
            delay(i.tiMS / 100)
            if (i.progress < 99) {
                i.progress += 1
                rowLayout.ingrProgess.progress = i.progress.toInt()
            } else {
                i.progress = 0
                rowLayout.ingrProgess.progress = i.progress.toInt()
            }
        }*/
        UserValues.cash += (i.income * i.multi)
        UserValues.ingredientsRunning[ingredient] = false
        UserValues.mainMoneyTV?.text = Util.ft(UserValues.cash)
        updateUpgrade(i)
        //adapter.notifyDataSetChanged()

        Log.v("Ingredient", "${i.name + " + " + i.tiMS}")
    }

    private fun upgradeIngredient(i: Ingredient) {
        with(rowLayout) {
            if (i.unlocked) {
                if (UserValues.cash >= i.price * i.multiprc) {
                    Log.v("Ingredient Upgraded ", i.name)
                    //Update Cash
                    UserValues.cash -= i.price * i.multiprc
                    //
                    //Increase values
                    i.multiprc *= i.multiprcmulti
                    UserValues.ingredientsMap[i.type]?.let { l -> l.level += 1 }
                    UserValues.ingredientsMap[i.type]?.let { i -> i.multi += 1 }
                    //
                    //Update TV
                    UserValues.mainMoneyTV?.text = Util.ft(UserValues.cash)
                    ingrLevel.text = i.level.toString()
                    ingrIncome.text = Util.ft(i.income * i.multi)
                    ingrUpgrade.text = "Upgrade For ${Util.ft(i.price * i.multiprc)}"
                    //
                    //If Cash is Still Higher Then Upgrade
                    if (UserValues.cash >= i.price) {
                        ingrUpgrade.setBackgroundResource(R.drawable.ic_ingredient_upgrade_affordable)
                    } else {
                        ingrUpgrade.setBackgroundResource(R.drawable.ic_ingredient_upgrade_not_affordable)
                    }
                    //
                    //Check If At Checkpoint For Speed Multi
                    for (n in 0 until UserValues.checkpoints.size) {
                        if (i.level == UserValues.checkpoints[n]) {
                            i.tiMS /= 2
                            Log.v("Ingredient", "${i.name + " Checkpoint : " + UserValues.checkpoints[n]}")
                        }
                    }
                    //
                }
            } else {
                if (UserValues.cash >= i.unlockprc) {
                    Log.v("Ingredient Unlocked ", i.name)
                    //Update Cash / unlocked
                    UserValues.cash -= i.unlockprc
                    i.unlocked = true
                    //
                    //Update TV
                    UserValues.mainMoneyTV?.text = Util.ft(UserValues.cash)
                    //
                    if (UserValues.cash >= i.price) {
                        ingrUpgrade.setBackgroundResource(R.drawable.ic_ingredient_upgrade_affordable)
                    } else {
                        ingrUpgrade.setBackgroundResource(R.drawable.ic_ingredient_upgrade_not_affordable)
                    }
                }
            }
        }
    }

    suspend fun updateUpgrade(i: Ingredient) {
        withContext(Main) {
            with(rowLayout) {
                if (i.completeTime >= System.currentTimeMillis()) {
                    i.progress = System.currentTimeMillis() / i.completeTime
                    ingrProgess.progress = i.progress.toInt()
                }
                if (i.unlocked) {
                    ingrIncome.text = Util.ft(i.income * i.multi)
                    ingrUpgrade.text = "Upgrade For ${Util.ft(i.price * i.multiprc)}"
                    if (UserValues.cash >= i.price * i.multiprc) {
                        ingrUpgrade.setBackgroundResource(R.drawable.ic_ingredient_upgrade_affordable)
                    } else {
                        ingrUpgrade.setBackgroundResource(R.drawable.ic_ingredient_upgrade_not_affordable)
                    }
                } else {
                    ingrIncome.text = Util.ft(i.income * i.multi)
                    ingrUpgrade.text = "Unlock For ${Util.ft(i.unlockprc)}"
                    if (UserValues.cash >= i.unlockprc) {
                        ingrUpgrade.setBackgroundResource(R.drawable.ic_ingredient_unlock_affordable)
                    } else {
                        ingrUpgrade.setBackgroundResource(R.drawable.ic_ingredient_unlock_not_affordable)
                    }
                }
                Log.v("Updaterrr", i.name)
            }
        }
    }*/
}

package com.android.dev.prof.flavorfusion.homeScreens

import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.android.dev.prof.flavorfusion.dataSource.Recipe
import com.android.dev.prof.flavorfusion.dataSource.RecipeX
import com.android.dev.prof.flavorfusion.databinding.RecipeItemBinding

class RecipeAdapter : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {


    class RecipeViewHolder(private val binding: RecipeItemBinding): ViewHolder(binding.root){

    }
    companion object DiffCallback: DiffUtil.ItemCallback<RecipeX>(){
        override fun areItemsTheSame(oldItem: RecipeX, newItem: RecipeX): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: RecipeX, newItem: RecipeX): Boolean {
            return oldItem.idMeal == newItem.idMeal
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}
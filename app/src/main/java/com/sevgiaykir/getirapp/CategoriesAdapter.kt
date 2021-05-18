package com.sevgiaykir.getirapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.sevgiaykir.getirapp.databinding.CardDesignBinding

class CategoriesAdapter(var mContext:Context, var categoryList:List<Categories>)
    :RecyclerView.Adapter<CategoriesAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(cardDesignBinding: CardDesignBinding)
        :RecyclerView.ViewHolder(cardDesignBinding.root) {

            var cardDesign:CardDesignBinding

            init {
                this.cardDesign=cardDesignBinding
            }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater=LayoutInflater.from(mContext)
        val design=CardDesignBinding.inflate(layoutInflater,parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val category=categoryList.get(position)


        holder.cardDesign.imageViewCat.setImageResource(
            mContext.resources.getIdentifier(category.category_img_name,"drawable",mContext.packageName))

        /*
        holder.cardDesign.textViewCatName.text=category.category_name
        */
        holder.cardDesign.categoryObject=category

        holder.cardDesign.catCardview.setOnClickListener{
            val transition=HomepageFragmentDirections.detailPageTransition(category)

            Navigation.findNavController(it).navigate(transition)
        }
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}
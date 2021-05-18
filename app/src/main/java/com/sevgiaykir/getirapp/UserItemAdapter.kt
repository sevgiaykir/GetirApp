package com.sevgiaykir.getirapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sevgiaykir.getirapp.databinding.CardDesignUserBinding

class UserItemAdapter (var mContext: Context, var userItemList:List<UserItem>)
    :RecyclerView.Adapter<UserItemAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(cardDesignUserBinding: CardDesignUserBinding)
        : RecyclerView.ViewHolder(cardDesignUserBinding.root) {

            var cardDesign:CardDesignUserBinding

            init {
                this.cardDesign=cardDesignUserBinding
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater=LayoutInflater.from(mContext)
        val design=CardDesignUserBinding.inflate(layoutInflater,parent,false)
        return CardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val userItem=userItemList.get(position)

        holder.cardDesign.textViewUserName.text="${"Ad: "+userItem.user_name}"
        holder.cardDesign.textViewUserSurname.text="${"Soyad: "+userItem.user_surname}"
        holder.cardDesign.textViewAddress.text="${"Adres: "+userItem.user_address}"
        holder.cardDesign.textViewMail.text="${"Mail: "+userItem.user_mail}"
        holder.cardDesign.textViewPhone.text="${"Telefon No: "+userItem.user_phone}"


    }

    override fun getItemCount(): Int {
        return userItemList.size
        //1
    }
}
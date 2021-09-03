package com.sevgiaykir.getirapp

import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sevgiaykir.getirapp.databinding.FragmentProfilePageBinding

class ProfilePageFragment : Fragment() {

    private lateinit var design:FragmentProfilePageBinding
    private lateinit var userItemList: ArrayList<UserItem>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        design=DataBindingUtil.inflate(inflater,R.layout.fragment_profile_page, container, false)
        //design.userItemAdapter=adapter

        return design.root
    }
}
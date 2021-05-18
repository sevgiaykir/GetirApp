package com.sevgiaykir.getirapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sevgiaykir.getirapp.databinding.FragmentCampaignPageBinding
import com.sevgiaykir.getirapp.databinding.FragmentSearchPageBinding

class SearchPageFragment : Fragment() {

    private lateinit var design: FragmentSearchPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        design =
            DataBindingUtil.inflate(inflater, R.layout.fragment_search_page, container, false)

        (activity as AppCompatActivity).setSupportActionBar(design.toolbarSearchPage)

        return design.root
    }
}
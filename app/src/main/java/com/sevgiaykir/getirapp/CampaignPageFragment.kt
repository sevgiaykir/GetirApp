package com.sevgiaykir.getirapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import com.sevgiaykir.getirapp.databinding.FragmentCampaignPageBinding


class CampaignPageFragment : Fragment() {

    private lateinit var design: FragmentCampaignPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        design =
            DataBindingUtil.inflate(inflater, R.layout.fragment_campaign_page, container, false)

        //(activity as AppCompatActivity).setSupportActionBar(design.toolbarCampaignPage)

        design.buttonCampSave.setOnClickListener {
            Snackbar.make(it,"Kampanya kodu kaydedildi.",Snackbar.LENGTH_LONG).show()
        }

        return design.root
    }
}

/*class CampaignPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_campaign_page, container, false)
    }
}*/
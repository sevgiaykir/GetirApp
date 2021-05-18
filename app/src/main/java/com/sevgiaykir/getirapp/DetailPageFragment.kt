package com.sevgiaykir.getirapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.sevgiaykir.getirapp.databinding.FragmentDetailPageBinding

class DetailPageFragment : Fragment() {

    private lateinit var design:FragmentDetailPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        design= DataBindingUtil.inflate(inflater,R.layout.fragment_detail_page, container, false)

        val bundle:DetailPageFragmentArgs by navArgs()
        val comingCategory=bundle.categoryObject

        design.categoryObject=comingCategory

        design.imageViewDetails.setImageResource(
            resources.getIdentifier(comingCategory.category_img_name,"drawable",requireContext().packageName))

        /*
        design.textViewCatTitle.text=comingCategory.category_name
        design.textViewCatDetails.text=comingCategory.category_detail
        */
        return design.root
    }
}
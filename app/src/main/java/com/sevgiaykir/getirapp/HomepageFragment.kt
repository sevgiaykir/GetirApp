package com.sevgiaykir.getirapp

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sevgiaykir.getirapp.databinding.FragmentHomepageBinding

class HomepageFragment : Fragment() {

    private lateinit var design: FragmentHomepageBinding
    private lateinit var adapter: CategoriesAdapter
    private lateinit var categoriesList: ArrayList<Categories>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        design=DataBindingUtil.inflate(inflater,R.layout.fragment_homepage, container, false)

        //design.toolbarHomepage.title="getir"
        //design.toolbarHomepage.setTitleTextColor(Color.YELLOW)
        //(activity as AppCompatActivity).setSupportActionBar(design.toolbarHomepage)
        //design.rv.layoutManager=StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)

        val c1 = Categories(1, "Yeni Ürünler", "yeniurunler")
        val c2 = Categories(2, "İndirimler", "indirimler")
        val c3 = Categories(3, "Su", "su")
        val c4 = Categories(4, "Meyve & Sebze", "meyvesebze")
        val c5 = Categories(5, "Fırından", "firindan")
        val c6 = Categories(6, "Atıştırmalık", "atistirmalik")
        val c7 = Categories(7, "Dondurma", "dondurma")
        val c8 = Categories(8, "Yiyecek", "yiyecek")
        val c9 = Categories(9, "İçecek", "icecek")
        val c10 = Categories(10, "Fit & Form", "fitform")
        val c11 = Categories(11, "Süt & Kahvaltı", "sutkahvalti")
        val c12 = Categories(12, "Temel Gıda", "temelgida")
        val c13 = Categories(13, "Kişisel Bakım", "kisiselbakim")
        val c14 = Categories(14, "Ev Bakım", "evbakim")
        val c15 = Categories(15, "Ev & Yaşam", "evyasam")
        val c16 = Categories(16, "Teknoloji", "teknoloji")
        val c17 = Categories(17, "Evcil Hayvan", "evcilhayvan")
        val c18 = Categories(18, "Bebek", "bebek")
        val c19 = Categories(19, "Cinsel Sağlık", "cinselsaglik")
        val c20 = Categories(20, "Giyim", "giyim")

        categoriesList = ArrayList()

        categoriesList.add(c1)
        categoriesList.add(c2)
        categoriesList.add(c3)
        categoriesList.add(c4)
        categoriesList.add(c5)
        categoriesList.add(c6)
        categoriesList.add(c7)
        categoriesList.add(c8)
        categoriesList.add(c9)
        categoriesList.add(c10)
        categoriesList.add(c11)
        categoriesList.add(c12)
        categoriesList.add(c13)
        categoriesList.add(c14)
        categoriesList.add(c15)
        categoriesList.add(c16)
        categoriesList.add(c17)
        categoriesList.add(c18)
        categoriesList.add(c19)
        categoriesList.add(c20)

        adapter = CategoriesAdapter(requireContext(), categoriesList)
        //design.rv.adapter = adapter

        design.categoriesAdapter=adapter

        return design.root
    }
}
package com.sevgiaykir.getirapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFrag=supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment

        NavigationUI.setupWithNavController(bottomNav,navHostFrag.navController)

    }
}
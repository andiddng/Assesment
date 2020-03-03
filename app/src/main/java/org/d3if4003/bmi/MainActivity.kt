package org.d3if4003.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import org.d3if4003.bmi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout : DrawerLayout
    private lateinit var appBarConfiguration : AppBarConfiguration
    //private lateinit var binding : DataBindingUtil

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
    //   drawerLayout = binding.drawerlayout
        val navController = this.findNavController(R.id.navigasi)
        NavigationUI.setupActionBarWithNavController(this, navController,drawerLayout)
    //   appBarConfiguration = AppBarConfiguration(navController.graph,drawerLayout)
    }

    override fun onNavigateUp(): Boolean {

        val navController = this.findNavController(R.id.navigasi)
        return NavigationUI.navigateUp(navController,appBarConfiguration)
        //return super.onNavigateUp()
    }
}

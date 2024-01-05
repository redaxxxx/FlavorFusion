package com.android.dev.prof.flavorfusion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.android.dev.prof.flavorfusion.databinding.ActivityHomeBinding
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityHomeBinding>(this, R.layout.activity_home)

        binding.navBar.setOnItemSelectedListener(object: NavigationBarView.OnItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                return when(item.itemId){
                    R.id.homeFragment ->{
                        R.drawable.home_ic_green
                        true
                    }
                    R.id.favoriteFragment-> {
                        R.drawable.inactive_ic_green
                        true
                    }
                    R.id.notificationFragment-> {
                        R.drawable.notification_icon
                        true
                    }
                    R.id.profileFragment-> {
                        R.drawable.profile_icon
                        true
                    }
                    else -> false
                }

            }

        })
        val navController by lazy {
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
            navHostFragment.navController
        }

//        val bottomNavigation = findViewById<BottomNavigationView>(R.id.nav_bar)
        binding.navBar.setupWithNavController(navController)

//        setupWithNavController(bottomNavigation, navController)

    }

}
package com.example.taskpapb_9_bottomtablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.taskpapb_9_bottomtablayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            replaceFragment(MovieHomeFragment())
            bottomNavbar.setOnItemSelectedListener {
                when(it.itemId){
                    R.id.nav_home -> replaceFragment(MovieHomeFragment())
                    R.id.nav_profile -> replaceFragment(ProfileFragment())
                    R.id.nav_setting -> replaceFragment(SettingFragment())
                    else -> {}
                }
                true
            }
        }
    }

    // ini gunanya buat replace isinya frame layout ketika navbar bottom di klik
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}
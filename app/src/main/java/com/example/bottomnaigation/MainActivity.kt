package com.example.bottomnaigation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottmo=findViewById<BottomNavigationView>(R.id.bottomBar)

        bottmo.setOnItemSelectedListener {

            when (it.itemId){

                R.id.item0->{
                    loadfragment(HomeFragment())
                    true
                } R.id.item0->{

                loadfragment(InboxFragment())
                    true
                } R.id.item0->{

                loadfragment(ProfileFragment())
                    true
                }

                else -> {
                    true
                }
            }
        }


    }

    private fun loadfragment(fragment: Fragment) {

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fram,Fragment())
            .commit()

    }
}
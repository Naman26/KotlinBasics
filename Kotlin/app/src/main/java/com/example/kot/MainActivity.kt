package com.example.kot

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intentButton.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity:: class.java)
            startActivity(leagueIntent)
        }

        listViewButton.setOnClickListener{
            val listviewIntent = Intent(this, ListView:: class.java)
            startActivity(listviewIntent)
        }

        recyclerViewbutton.setOnClickListener{
            val recyclerViewbutton = Intent(this, RecyclerViewActivity:: class.java)
            startActivity(recyclerViewbutton)
        }
    }
}

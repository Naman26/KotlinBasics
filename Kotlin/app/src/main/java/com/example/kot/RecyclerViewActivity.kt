package com.example.kot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("Jon Snow"))
        users.add(User("Arya Stark"))
        users.add(User("Sansa Stark"))
        users.add(User("Jaime Lannister"))
        users.add(User("Cersai Lannister"))
        users.add(User("Daenerys Stormborn"))
        users.add(User("Tyrion Lannister"))
        users.add(User("Night King"))
        users.add(User("Bran Stark"))
        users.add(User("Theon Grayjoy"))
        users.add(User("Sir Davos"))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter
    }
}

package com.example.kot

import android.content.AbstractThreadedSyncAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_view.*

class ListView : AppCompatActivity() {
    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val studentList= listOf("Ishita", "Naman", "Nidhi", "Michael")

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, studentList)

        listView.adapter = adapter
    }
}

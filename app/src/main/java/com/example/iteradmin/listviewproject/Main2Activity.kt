package com.example.iteradmin.listviewproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val list = findViewById<ListView>(R.id.list)

        val daaata = arrayListOf("laptop","mouse","key","chai","break",
                "lunch","developer","million","dev","ok","boy","girl","ok","child","monitor","ok")

        val adp = ArrayAdapter<String>(this,R.layout.data,daaata)
        list.adapter =adp

       list.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "position of ${position}",Toast.LENGTH_LONG).show()
        }
    }
}

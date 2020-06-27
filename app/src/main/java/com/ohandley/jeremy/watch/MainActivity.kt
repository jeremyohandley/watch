package com.ohandley.jeremy.watch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setCustomView(R.layout.custom_search_action_bar)
        supportActionBar!!.elevation = 0f

        val fab = findViewById<FloatingActionButton>(R.id.report_button)
        fab.setOnClickListener{
            val intent = Intent(this, ReportActivity::class.java)
            startActivity(intent)
        }
    }
}

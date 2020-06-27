package com.ohandley.jeremy.watch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.ActionBar

class ReportActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)
        initActionBar()
        initListeners()
    }

    private fun navigateToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun changeEditTextOutline(et: EditText, hasFocus:Boolean) {
        if (hasFocus) {
            et.background = getDrawable(R.drawable.text_box_outline_active)
        } else {
            et.background = getDrawable(R.drawable.text_box_outline_inactive)
        }
    }

    private fun initActionBar() {
        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setCustomView(R.layout.custom_back_action_bar)
    }

    private fun initListeners() {
        val backBtn = findViewById<ImageButton>(R.id.back_button)
        backBtn.setOnClickListener { navigateToMainActivity() }

        val nameEt = findViewById<EditText>(R.id.officer_name_et)
        val municipalityEt = findViewById<EditText>(R.id.officer_municipality_et)
        val badgeNumberEt = findViewById<EditText>(R.id.officer_badge_number_et)
        val descriptionEt = findViewById<EditText>(R.id.description_et)


        nameEt.setOnFocusChangeListener {view, hasFocus -> changeEditTextOutline(view as EditText,  hasFocus)}
        municipalityEt.setOnFocusChangeListener{view, hasFocus -> changeEditTextOutline(view as EditText,  hasFocus)}
        badgeNumberEt.setOnFocusChangeListener{view, hasFocus -> changeEditTextOutline(view as EditText,  hasFocus)}
        descriptionEt.setOnFocusChangeListener{view, hasFocus -> changeEditTextOutline(view as EditText,  hasFocus)}
    }
}

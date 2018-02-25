package com.example.abdallahsarayrah.audiovideoproh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_value_to_explicit_intent.*

class ValueToExplicitIntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_value_to_explicit_intent)

        buttonBrowse.setOnClickListener {
            var intent = Intent(this, ExplicitIntentActivity::class.java)
            intent.putExtra("value", editTextUrl.text.toString())
            startActivity(intent)
        }
    }
}

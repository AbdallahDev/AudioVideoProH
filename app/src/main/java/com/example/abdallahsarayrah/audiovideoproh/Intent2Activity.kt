package com.example.abdallahsarayrah.audiovideoproh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_intent2.*

class Intent2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        Toast.makeText(this, "Your are in Activity2", Toast.LENGTH_SHORT).show()

        buttonIntent2.setOnClickListener {
            var intent = Intent(this, Intent1Activity::class.java)
            startActivity(intent)
        }
    }
}

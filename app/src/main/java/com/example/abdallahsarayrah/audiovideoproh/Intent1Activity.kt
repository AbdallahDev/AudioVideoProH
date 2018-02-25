package com.example.abdallahsarayrah.audiovideoproh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_intent1.*
import kotlinx.android.synthetic.main.activity_intent2.*

class Intent1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)

        Toast.makeText(this, "Your are in Activity1", Toast.LENGTH_SHORT).show()

        buttonIntent1.setOnClickListener {
            var intent = Intent(this, Intent2Activity::class.java)
            startActivity(intent)
        }
    }

}

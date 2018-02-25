package com.example.abdallahsarayrah.audiovideoproh

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explicit_intent.*

class ExplicitIntentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)

        var url = intent.getStringExtra("value")
        var explicitIntentUrl = Uri.parse("http://$url")
        var explicitIntent = Intent(Intent.ACTION_VIEW, explicitIntentUrl)
        startActivity(explicitIntent)

        buttonExplicitIntent.setOnClickListener {
            var goBack = Intent(this, ValueToExplicitIntentActivity::class.java)
            startActivity(goBack)
        }
    }
}

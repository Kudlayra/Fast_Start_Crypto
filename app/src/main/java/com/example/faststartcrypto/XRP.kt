package com.example.a12lecture

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private lateinit var nextActivityButton: Button
private lateinit var nextActivityButton2: Button
private lateinit var nextActivityButton3: Button
private lateinit var openSite: Button

class XRP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xrp)


        nextActivityButton = findViewById(R.id.Bitcoin_Button)
        nextActivityButton.setOnClickListener {
            val bitcoinIntent: Intent = Intent(this, Bitcoin::class.java)
            startActivity(bitcoinIntent)}
        nextActivityButton2 = findViewById(R.id.Ethereum_Button)
        nextActivityButton2.setOnClickListener {
            val ethereumIntent: Intent = Intent(this, Ethereum::class.java)
            startActivity(ethereumIntent)}
        nextActivityButton2 = findViewById(R.id.Dogecoin_Button)
        nextActivityButton2.setOnClickListener {
            val dogecoinIntent: Intent = Intent(this, Dogecoin::class.java)
            startActivity(dogecoinIntent)}
        openSite = findViewById(R.id.openurl)

        openSite.setOnClickListener {
            val cryptoLink = Uri.parse("https://crypto.com")
            val openUrlIntent = Intent(Intent.ACTION_VIEW, cryptoLink)
            startActivity(openUrlIntent)
        }

    }
}
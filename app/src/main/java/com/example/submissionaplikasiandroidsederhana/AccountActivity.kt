package com.example.submissionaplikasiandroidsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
        supportActionBar?.title = "Account"
    }
}
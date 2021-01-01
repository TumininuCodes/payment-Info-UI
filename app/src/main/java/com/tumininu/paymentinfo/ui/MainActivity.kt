package com.tumininu.paymentinfo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tumininu.paymentinfo.other.CreditCardFormatting
import com.tumininu.paymentinfo.R
import com.tumininu.paymentinfo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )

        CreditCardFormatting.apply {
            mainBinding.cardNumberEditText.text.toString()
        }
    }
}

package com.tumininu.paymentinfo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tumininu.paymentinfo.R
import com.tumininu.paymentinfo.databinding.ActivityMainBinding
import com.tumininu.paymentinfo.other.CreditCardFormatting

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout using dataBinding

        mainBinding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )

        // Implement text formatting in card Number TextView

        mainBinding.cardNumberEditText.addTextChangedListener(CreditCardFormatting())
    }
}

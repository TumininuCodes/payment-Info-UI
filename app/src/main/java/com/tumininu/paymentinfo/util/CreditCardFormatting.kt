package com.tumininu.paymentinfo.util

import android.text.Editable
import android.text.InputFilter
import android.text.TextWatcher

class CreditCardFormatting : TextWatcher {

    // This class implements the TextWatcher Interface
    // Separates text into chunks of 4

    private var current = ""

    override fun afterTextChanged(s: Editable?) {
        if (s.toString() != current) {
            val userInput = s.toString().replace(nonDigits, "")
            if (userInput.length <= 16) {
                current = userInput.chunked(4).joinToString(" ")
                s?.filters = arrayOfNulls<InputFilter>(0)
            }
            s?.replace(0, s.length, current, 0, current.length)
        }
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

    companion object {
        private val nonDigits = Regex("[^\\d]")
    }
}
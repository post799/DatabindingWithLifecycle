package com.andriyaleksyeyev.databindinginfo

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var myText = MutableLiveData<String>()
    var btnText = MutableLiveData<String>()

    fun btnClick(view: View){
        myText.value = "Text change again - textView"

        btnText.value = "Text change again - button"

    }
}
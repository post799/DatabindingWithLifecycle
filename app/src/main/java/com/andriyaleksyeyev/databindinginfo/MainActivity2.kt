package com.andriyaleksyeyev.databindinginfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.andriyaleksyeyev.databindinginfo.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding : ActivityMain2Binding
    lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main2)

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        binding.viewmodel = viewModel

        binding.lifecycleOwner = this

        viewModel.myText.value = "Before changing text"
        viewModel.btnText.value = "Before changing text"


    }
}

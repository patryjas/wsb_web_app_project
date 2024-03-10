package com.example.web_end_project.ui.Trzecia

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TrzeciaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "To jest fragment trzeciej strony"
    }
    val text: LiveData<String> = _text
}
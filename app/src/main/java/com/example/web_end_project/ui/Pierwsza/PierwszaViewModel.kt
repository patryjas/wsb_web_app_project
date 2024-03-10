package com.example.web_end_project.ui.Pierwsza

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PierwszaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "To jest fragment pierwszej strony"
    }
    val text: LiveData<String> = _text
}
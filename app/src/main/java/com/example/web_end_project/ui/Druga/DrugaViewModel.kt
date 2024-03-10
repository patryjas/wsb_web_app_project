package com.example.web_end_project.ui.Druga

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DrugaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "To jest fragment drugiej strony"
    }
    val text: LiveData<String> = _text
}
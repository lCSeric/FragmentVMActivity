package edu.temple.diceroll

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel(){

    private val _diceValue = MutableLiveData<String>()
    val diceValue: LiveData<String>
        get() = _diceValue

    fun updateDiceValue(newValue: String) {
        _diceValue.value = newValue
    }
}
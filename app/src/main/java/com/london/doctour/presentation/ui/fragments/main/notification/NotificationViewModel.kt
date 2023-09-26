package com.example.doctour.presentation.ui.fragments.main.notification

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.doctour.R
import com.london.doctour.base.BaseViewModel
import com.example.doctour.presentation.ui.fragments.home.model.Notification


class NotificationViewModel : BaseViewModel() {

    private val _notification = MutableLiveData<List<Notification>>()
    val notification: LiveData<List<Notification>> get() = _notification

    fun getNotification(){
        _notification.value = listOf(
            Notification("Запись успешна",
            "вы успешно записались на встречу", R.drawable.ic_successfully.toString(), "15:00"),
            Notification("Запись отменена!",
                "Вы успешно отменили встречу", R.drawable.ic_failed.toString(), "10:00"),
            Notification("Запись измена!",
                "Вы успешно изменили встречу", R.drawable.ic_change.toString(), "16:00"),
        )
    }
}
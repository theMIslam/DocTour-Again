package com.example.doctour.presentation.ui.fragments.main.notification

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.doctour.R
import com.london.doctour.base.BaseFragment
import com.example.doctour.databinding.FragmentNotificationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationFragment : BaseFragment<FragmentNotificationBinding, NotificationViewModel>(
    R.layout.fragment_notification
) {

    override val binding: FragmentNotificationBinding by viewBinding(FragmentNotificationBinding::bind)
    override val viewModel: NotificationViewModel by viewModels<NotificationViewModel>()
}
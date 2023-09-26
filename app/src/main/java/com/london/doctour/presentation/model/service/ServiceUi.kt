package com.london.doctour.presentation.model.service

import com.example.doctour.domain.model.service.Service
import com.london.doctour.presentation.model.subService.SubServiceUI
import com.london.doctour.presentation.model.subService.toSubServiceUI

data class ServiceUi(
    val slug: String,
    val name: String?,
    val subservice_service: List<SubServiceUI>?= emptyList()
)

fun Service.toServiceUI()= ServiceUi(
    slug, name,subservice_service?.map { it.toSubServiceUI() }
)

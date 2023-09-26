package com.london.doctour.presentation.model.subService

import com.london.doctour.base.IBaseDiffModel
import com.example.doctour.domain.model.subService.SubService
import com.london.doctour.presentation.model.clinic.ClinicUI
import com.london.doctour.presentation.model.clinic.toClinicUI

data class SubServiceUI(
    override val id:Int,
    val name:String?,
    val slug:String?,
    val count_clinic:String?,
    val service:Int?,
    val clinic:List<ClinicUI> ?= emptyList()
): IBaseDiffModel<Int>

fun SubService.toSubServiceUI()= SubServiceUI(
    id, name, slug, count_clinic, service,clinic?.map { it.toClinicUI() }
)

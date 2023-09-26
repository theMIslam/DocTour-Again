package com.london.doctour.presentation.model.education

import com.london.doctour.base.IBaseDiffModel

data class EducationUI(
    override val id: String,
    val is_deleted: Boolean,
    val created_at: String?,
    val updated_at: String?,
    val title: String?,
    val specialization: String?,
    val year: String?,
    val doctor: String?
) : IBaseDiffModel<String>

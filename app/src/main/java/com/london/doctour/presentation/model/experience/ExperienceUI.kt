package com.london.doctour.presentation.model.experience

import com.london.doctour.base.IBaseDiffModel

data class ExperienceUI(
    override val id: String,
    val is_deleted: Boolean,
    val created_at: String?,
    val updated_at: String?,
    val title: String?,
    val year: String?,
    val doctor: String?
) : IBaseDiffModel<String>

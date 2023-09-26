package com.example.doctour.presentation.ui.fragments.main.profileimport com.london.doctour.base.BaseViewModelimport com.example.doctour.domain.usecases.deleteUserProfile.DeleteUserProfileByIdUseCaseimport com.example.doctour.domain.usecases.createUserProfile.GetUserProfileByIDUseCaseimport com.example.doctour.domain.usecases.logout.LogOutUseCaseimport com.example.doctour.presentation.model.profile.ProfileUIimport com.example.doctour.presentation.model.profile.toProfileUIimport dagger.hilt.android.lifecycle.HiltViewModelimport kotlinx.coroutines.flow.asStateFlowimport javax.inject.Inject@HiltViewModelclass ProfileViewModel @Inject constructor(    private val logOutUseCase: LogOutUseCase,    private val getUserProfileByIdUseCase: GetUserProfileByIDUseCase,    private val deleteUserProfileByIdUseCase: DeleteUserProfileByIdUseCase) : BaseViewModel() {    private val _accountDeletionState = MutableUIStateFlow<Unit>()    val accountDeletionState = _accountDeletionState.asStateFlow()    private val _getUserProfileById = MutableUIStateFlow<ProfileUI>()    val getUserProfileById = _getUserProfileById.asStateFlow()    private val _deleteUserProfileById = MutableUIStateFlow<Unit>()    val deleteUserProfileById = _deleteUserProfileById.asStateFlow()    fun  deleteProfileById(id:String){        deleteUserProfileByIdUseCase(            id        ).collectRequest(_deleteUserProfileById){}    }    fun getProfileById(id:String){        getUserProfileByIdUseCase(id).collectNetworkRequest(_getUserProfileById){            it.toProfileUI()        }    }    fun logOut () = logOutUseCase().gatherRequest(_accountDeletionState)}
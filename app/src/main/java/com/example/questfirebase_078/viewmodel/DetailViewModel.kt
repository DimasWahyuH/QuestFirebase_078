package com.example.questfirebase_078.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questfirebase_078.modeldata.Siswa
import com.example.questfirebase_078.repositori.RepositorySiswa
import com.example.questfirebase_078.view.route.DestinasiDetail
import kotlinx.coroutines.launch
import java.io.IOException

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}
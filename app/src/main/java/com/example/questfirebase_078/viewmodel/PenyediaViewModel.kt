package com.example.questfirebase_078.viewmodel

import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import com.example.questfirebase_078.repositori.AplikasiDataSiswa

fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]
            as AplikasiDataSiswa)

object PenyediaViewModel {

    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                aplikasiDataSiswa().container.repositoriSiswa
            )
        }
        initializer {
            EntryViewModel(
                aplikasiDataSiswa().container.repositoriSiswa
            )
        }
        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                aplikasiDataSiswa().container.repositoriSiswa
            )
        }

    }
}
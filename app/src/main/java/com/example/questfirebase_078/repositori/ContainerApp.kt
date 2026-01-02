package com.example.questfirebase_078.repositori

import android.app.Application

interface ContainerApp {
    val repositoriSiswa: RepositorySiswa
}

class DefaultContainerApp : ContainerApp {
    override val repositoriSiswa: RepositorySiswa by lazy {
        FirebaseRepositorySiswa()
    }
}


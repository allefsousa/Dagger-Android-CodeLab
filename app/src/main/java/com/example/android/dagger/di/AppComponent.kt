package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

/**
 * @author allef.santos on 2019-11-08
 * Com o inject(activity: RegistrationActivity)método na @Componentinterface, estamos dizendo ao Dagger que RegistrationActivitysolicita
 * injeção e que ele deve fornecer o que a Atividade está injetando (ou seja, RegistrationViewModelconforme definido na etapa anterior).
 */

@Component(modules = [StorageModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: RegistrationActivity)
    fun inject(activity: MainActivity)
}
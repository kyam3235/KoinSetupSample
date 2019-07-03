package jp.kyamlab.koinsetupsample

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val myModule = module {
    viewModel { MainViewModel(get()) }

    factory { MyRepository() }
}
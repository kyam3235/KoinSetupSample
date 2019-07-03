package jp.kyamlab.koinsetupsample

import androidx.lifecycle.ViewModel;

class MainViewModel(
    private val repository: MyRepository
) : ViewModel() {

    fun fetch(): String {
        return repository.fetch()
    }
}

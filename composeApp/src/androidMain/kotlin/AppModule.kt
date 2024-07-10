import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

actual val viewModelModules = module {
    viewModelOf(::MainViewModel)
}
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val viewModelModules = module {
    singleOf(::MainViewModel)
}
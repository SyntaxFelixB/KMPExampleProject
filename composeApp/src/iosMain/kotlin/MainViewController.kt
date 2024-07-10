import androidx.compose.ui.window.ComposeUIViewController


fun MainViewController() = ComposeUIViewController(
    configure = {
        KoinInject().init()
    }
) {
    App()
}
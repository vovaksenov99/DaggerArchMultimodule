package com.akscorp.bonialtesttask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akscorp.bonialtesttask.databinding.ActivityMainBinding
import com.akscorp.bonialtesttask.navigation.CiceroneTuner
import com.akscorp.screenA.navigation.Screens
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.AppNavigator
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var router: Router

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext as App).baseComponent.inject(this)

        lifecycle.addObserver(
            CiceroneTuner(
                navigatorHolder = navigatorHolder,
                navigator = AppNavigator(this, R.id.container)
            )
        )

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            router.newRootScreen(Screens.provideScreen())
        }
    }
}


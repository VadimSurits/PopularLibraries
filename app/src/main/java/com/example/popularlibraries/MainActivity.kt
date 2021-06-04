package com.example.popularlibraries

import android.os.Bundle
import com.example.popularlibraries.App.Navigation.navigatorHolder
import com.example.popularlibraries.App.Navigation.router
import com.example.popularlibraries.R.layout.activity_main
import com.example.popularlibraries.navigation.AndroidScreens
import com.github.terrakok.cicerone.androidx.AppNavigator
import moxy.MvpAppCompatActivity

class MainActivity : MvpAppCompatActivity(activity_main) {

    val navigator = AppNavigator(this, R.id.container)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        savedInstanceState ?: router.newRootScreen(AndroidScreens().users())
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }
}

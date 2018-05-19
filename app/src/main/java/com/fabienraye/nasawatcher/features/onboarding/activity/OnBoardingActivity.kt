package com.fabienraye.nasawatcher.features.onboarding.activity

import android.os.Bundle
import androidx.navigation.Navigation
import com.fabienraye.nasawatcher.R
import com.fabienraye.nasawatcher.features.commons.activities.BaseActivity

class OnBoardingActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
    }

    override fun onNavigateUp(): Boolean {
        return Navigation.findNavController(this, R.id.onBoardingNavFragment).navigateUp()
    }
}

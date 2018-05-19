package com.fabienraye.nasawatcher.features.onboarding.presenter

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import com.fabienraye.nasawatcher.R
import com.fabienraye.nasawatcher.features.commons.fragments.BaseFragment
import com.fabienraye.nasawatcher.features.onboarding.adapter.PresentationAdapter
import kotlinx.android.synthetic.main.fragment_on_boarding_presentation.view.*

/**
 * A simple [BaseFragment] subclass.
 * It presents the purpose of the app
 *
 * Use the [PresentationFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class PresentationFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        context?.also { context ->
            view.onBoardingViewPager.adapter = PresentationAdapter(context)
            view.onBoardingStartButton.setOnClickListener(
                    Navigation.createNavigateOnClickListener(R.id.action_onBoardingPresentation_to_onBoardingRegister, null))
        }
    }

    override val layout: Int
        get() = R.layout.fragment_on_boarding_presentation

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment OnBoardingPresentation.
         */
        @JvmStatic
        fun newInstance() = PresentationFragment()
    }
}

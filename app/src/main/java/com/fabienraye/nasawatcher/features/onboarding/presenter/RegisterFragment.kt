package com.fabienraye.nasawatcher.features.onboarding.presenter

import com.fabienraye.nasawatcher.R
import com.fabienraye.nasawatcher.features.commons.fragments.BaseFragment

/**
 * A simple [BaseFragment] subclass.
 * It allows to enter the api key
 *
 * Use the [RegisterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFragment : BaseFragment() {

    override val layout: Int
        get() = R.layout.fragment_register

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment OnBoardingRegister.
         */
        @JvmStatic
        fun newInstance() = RegisterFragment()
    }
}

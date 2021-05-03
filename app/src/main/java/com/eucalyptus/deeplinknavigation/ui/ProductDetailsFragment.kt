package com.eucalyptus.deeplinknavigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eucalyptus.deeplinknavigation.R
import com.eucalyptus.deeplinknavigation.databinding.FragmentProductDetailsBinding

class ProductDetailsFragment : Fragment() {
    lateinit var viewBinding: FragmentProductDetailsBinding
    lateinit var productId: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewBinding = FragmentProductDetailsBinding.inflate(layoutInflater)
        return viewBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        productId = "something"

    }


}
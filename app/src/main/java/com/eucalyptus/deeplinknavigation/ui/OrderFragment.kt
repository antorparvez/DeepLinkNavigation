package com.eucalyptus.deeplinknavigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eucalyptus.deeplinknavigation.R
import com.eucalyptus.deeplinknavigation.databinding.FragmentHomeBinding
import com.eucalyptus.deeplinknavigation.databinding.FragmentOrderBinding


class OrderFragment : Fragment() {

    lateinit var viewBinding: FragmentOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentOrderBinding.inflate(layoutInflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}
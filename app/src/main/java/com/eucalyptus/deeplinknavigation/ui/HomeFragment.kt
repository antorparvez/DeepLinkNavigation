package com.eucalyptus.deeplinknavigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.eucalyptus.deeplinknavigation.Item
import com.eucalyptus.deeplinknavigation.R
import com.eucalyptus.deeplinknavigation.adapter.ItemAdapter
import com.eucalyptus.deeplinknavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var list:ArrayList<Item>
    lateinit var viewBinding: FragmentHomeBinding

    private val itemAdapter :ItemAdapter by lazy {
        ItemAdapter(requireContext(),list)
        { position->
            onButtonClick(position)
        }
    }

    private fun onButtonClick(position: Int) {
        Toast.makeText(requireContext(),"$position is here",Toast.LENGTH_SHORT).show()

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        list = ArrayList()

        list.add(Item("Product Name ",R.drawable.ic_launcher_foreground))
        list.add(Item("Product Name ",R.drawable.ic_launcher_foreground))
        list.add(Item("Product Name ",R.drawable.ic_launcher_foreground))
        list.add(Item("Product Name ",R.drawable.ic_launcher_foreground))
        list.add(Item("Product Name ",R.drawable.ic_launcher_foreground))
        list.add(Item("Product Name ",R.drawable.ic_launcher_foreground))
        list.add(Item("Product Name ",R.drawable.ic_launcher_foreground))
        list.add(Item("Product Name ",R.drawable.ic_launcher_foreground))


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewBinding = FragmentHomeBinding.inflate(layoutInflater)
        return viewBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecylerView()

    }

    private fun initRecylerView() {

        viewBinding.itemRv .apply {
            layoutManager = LinearLayoutManager(
                requireContext(),
                LinearLayoutManager.VERTICAL,
                false
            )
            adapter = itemAdapter
        }

    }

}
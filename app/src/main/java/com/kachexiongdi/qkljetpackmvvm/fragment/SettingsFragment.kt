package com.kachexiongdi.qkljetpackmvvm.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.kachexiongdi.qkljetpackmvvm.R
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentSettingsBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentStep9DetailBinding

/**
 *   author : qiukailong
 *   date   : 2021/5/14  10:24 上午
 *   desc   :
 */
class SettingsFragment : Fragment() {
    private lateinit var viewBinding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //此时才会执行刷新menu
        setHasOptionsMenu(true)
        viewBinding = FragmentSettingsBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        super.onCreateOptionsMenu(menu, inflater)
    }
}
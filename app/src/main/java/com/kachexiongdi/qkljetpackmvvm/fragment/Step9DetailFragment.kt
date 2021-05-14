package com.kachexiongdi.qkljetpackmvvm.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.kachexiongdi.qkljetpackmvvm.R
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentStep9DetailBinding
import com.kachexiongdi.qkljetpackmvvm.databinding.FragmentStep9HomeBinding

/**
 *   author : qiukailong
 *   date   : 2021/5/12  6:30 下午
 *   desc   :
 */
class Step9DetailFragment : Fragment() {
    private lateinit var viewBinding: FragmentStep9DetailBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //此时才会执行刷新menu
        setHasOptionsMenu(true)
        viewBinding = FragmentStep9DetailBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        menu.clear()
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val args = Step9HomeFragmentArgs.fromBundle(requireArguments())
        viewBinding.tvContent.text = "${args.userName},${args.age}"
        viewBinding.button1.setOnClickListener {
            val navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_step9DetailFragment_to_step9HomeFragment)
        }
    }
}
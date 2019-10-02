package com.redbox.mirumon.main.groups

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.redbox.mirumon.R
import kotlinx.android.synthetic.main.fragment_group_list.*

class GroupListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_group_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        group_list_rv.adapter = GroupListAdapter()
        group_list_rv.layoutManager = LinearLayoutManager(context)

        group_add_btn.setOnClickListener {
            val dialog =  CreateGroupDialog()
            dialog.show(fragmentManager!!, "create")
        }
    }
}
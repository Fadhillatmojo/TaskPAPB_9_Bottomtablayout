package com.example.taskpapb_9_bottomtablayout

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.taskpapb_9_bottomtablayout.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    // membuat fragment binding
    private lateinit var binding: FragmentProfileBinding

    // mendefinisikan variable untuk menyimpan komponen nantinya
    private lateinit var logoutButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // membuat binding
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root

        // mendefinisikan komponen dengan binding
        logoutButton = binding.btnLogout

        // set onclick listener ketika logout button dipencet
        logoutButton.setOnClickListener{
            // intent untuk logout
            val intenttoLoginActivity = Intent(context, LoginActivity::class.java)
            startActivity(intenttoLoginActivity)
        }
        return view
    }
}
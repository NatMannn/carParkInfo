package com.example.carparkinfo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login_page.*

/**
 * A simple [Fragment] subclass.
 */
class login_page : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


            login_btn.setOnClickListener {
                if(user_edit.text.toString().equals("admin") && password_edit.text.toString().equals("password")){
                    findNavController().navigate(R.id.action_login_page_to_parking)
            }else {
                    alert_login.setText("Username or Password is not match!!!")
                }

        }
    }


}

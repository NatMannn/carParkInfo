package com.example.carparkinfo


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_parking.*

/**
 * A simple [Fragment] subclass.
 */
class parking : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_parking, container, false)
    }
    var arr_id  = arrayOf("","","")
    var arr_brand =  arrayOf("","","")
    var arr_name =   arrayOf("","","")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        slot1.setOnClickListener {

            resetValue()
            id_edit.setText (arr_id[0])
            brand_edit.setText( arr_brand[0])
            name_edit.setText(arr_name[0])
            status.visibility = View.VISIBLE
            edit_btn.setOnClickListener {


                arr_id[0]=( id_edit.text.toString())

                arr_brand[0]=( brand_edit.text.toString())
                arr_name[0]=( name_edit.text.toString())
                status.visibility = View.GONE
                slot1.setText(arr_id[0])
                slot1.setBackgroundColor(Color.parseColor("#D81B60"))

            }
            del_btn.setOnClickListener {
                slot1.setText("EMPTY")
                arr_id[0]=("")
                arr_brand[0]=("")
                arr_name[0]=( "")
                status.visibility = View.GONE
                slot1.setBackgroundColor(Color.parseColor("#62CA91"))
            }
        }
        slot2.setOnClickListener {

            resetValue()
            id_edit.setText (arr_id[1])
            brand_edit.setText( arr_brand[1])
            name_edit.setText(arr_name[1])
            status.visibility = View.VISIBLE
            edit_btn.setOnClickListener {


                arr_id[1]=( id_edit.text.toString())
                arr_brand[1]=( brand_edit.text.toString())
                arr_name[1]=( name_edit.text.toString())
                status.visibility = View.GONE
                slot2.setText(arr_id[1])
                slot2.setBackgroundColor(Color.parseColor("#D81B60"))

            }
            del_btn.setOnClickListener {
                slot2.setText("EMPTY")
                arr_id[1]=("")
                arr_brand[1]=("")
                arr_name[1]=( "")
                status.visibility = View.GONE
                slot2.setBackgroundColor(Color.parseColor("#62CA91"))
            }

        }
        slot3.setOnClickListener {

            resetValue()
            id_edit.setText (arr_id[2])
            brand_edit.setText( arr_brand[2])
            name_edit.setText(arr_name[2])

            status.visibility = View.VISIBLE
            edit_btn.setOnClickListener {

                arr_id[2]=( id_edit.text.toString())
                arr_brand[2]=( brand_edit.text.toString())
                arr_name[2]=( name_edit.text.toString())
                status.visibility = View.GONE
                slot3.setText(arr_id[2])
                slot3.setBackgroundColor(Color.parseColor("#D81B60"))

            }
            del_btn.setOnClickListener {
                slot3.setText("EMPTY")
                arr_id[2]=("")
                arr_brand[2]=("")
                arr_name[2]=( "")
                status.visibility = View.GONE
                slot3.setBackgroundColor(Color.parseColor("#62CA91"))
            }

        }
    }

    fun resetValue() {
        id_edit.setText("")
        brand_edit.setText("")
        name_edit.setText("")
    }



}

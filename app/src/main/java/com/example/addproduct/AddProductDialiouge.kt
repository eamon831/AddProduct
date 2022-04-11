package com.example.addproduct

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment

class AddProductDialiouge : DialogFragment() {


    companion object {
        const val TAG = "PurchaseConfirmationDialog"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootview:View= inflater.inflate(R.layout.addproductdialouge,container,false)
        return rootview
    }

}
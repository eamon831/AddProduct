package com.example.addproduct

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    val Fab=findViewById<FloatingActionButton>(R.id.fab);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Fab.setOnClickListener(){
            Toast.makeText(this,"Fab",Toast.LENGTH_LONG).show();
             val view=LayoutInflater.from(this).inflate(R.layout.addproductdialouge,null)
             val builder=AlertDialog.Builder(this).setView(view)

              builder.show()


            }
        }




}



package com.aydanilozyurek.kotlinalertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // How to show a message to the user ?
        // 1) Toast
        // 2) Alert Dialog
        // 3) Snackbar

        // Context
        // Activity Context (keyword --> this) - Application Context (keyword --> applicationContext)


        // Toast Message
        Toast.makeText(this, "Welcome", Toast.LENGTH_LONG).show()
    }

    fun save(view : View ){

        // Alert Dialog
        var alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage( "Are you sure ?")
        alert.setPositiveButton("Yes", object : DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
              Toast.makeText(this@MainActivity,"Saved!", Toast.LENGTH_LONG).show()
            }

        })
       alert.setNegativeButton("No"){
           dialog, which ->
           Toast.makeText(this@MainActivity,"Not Saved!", Toast.LENGTH_LONG).show()
       }


        alert.show()

    }
}
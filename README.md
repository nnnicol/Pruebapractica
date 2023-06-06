# Pruebapractica 
PARDO LLANO NAYDELIN NICOL
package com.example.sumadedosnumeros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class menu : AppCompatActivity() {
    lateinit var et1 : EditText
    lateinit var et2 : EditText
    lateinit var btnsumas : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        btnsumas = findViewById(R.id.sumar)


        btnsumas.setOnClickListener(View.OnClickListener {
            val numero1 = Integer.parseInt(et1.text.toString())
            val numero2 = Integer.parseInt(et2.text.toString())
            val sumar = numero1 + numero2



            val intent = Intent(this, resultado::class.java)
            intent.putExtra("Result", sumar)
            startActivity(intent)
        })

    }

}
package com.example.sumadedosnumeros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class menu : AppCompatActivity() {
    lateinit var et1 : EditText
    lateinit var et2 : EditText
    lateinit var btnsumas : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        btnsumas = findViewById(R.id.sumar)


        btnsumas.setOnClickListener(View.OnClickListener {
            val numero1 = Integer.parseInt(et1.text.toString())
            val numero2 = Integer.parseInt(et2.text.toString())
            val sumar = numero1 + numero2



            val intent = Intent(this, resultado::class.java)
            intent.putExtra("Result", sumar)
            startActivity(intent)
        })

    }
}
![image](https://github.com/nnnicol/Pruebapractica/assets/133244392/ab095298-94d4-4e4d-8924-d464d68ae0be)





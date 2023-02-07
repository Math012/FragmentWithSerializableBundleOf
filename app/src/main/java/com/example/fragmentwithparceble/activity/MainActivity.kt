package com.example.fragmentwithparceble.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.replace
import androidx.fragment.app.commit
import com.example.fragmentwithparceble.R
import com.example.fragmentwithparceble.fragment.DadosFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nome:EditText = findViewById(R.id.editNome)
        var sobrenome:EditText = findViewById(R.id.editSobrenome)
        var idade:EditText = findViewById(R.id.editIdade)
        var buttonEnviar:Button = findViewById(R.id.buttonEnviar)

        buttonEnviar.setOnClickListener(View.OnClickListener {
            val bundle_var = bundleOf(
                "Dado" to Dados(
                    "${nome.text.toString()}",
                    "${sobrenome.text.toString()}",
                    "${idade.text.toString()}"
                )
            )

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace<DadosFragment>(R.id.fragmentMain, args = bundle_var)
            }


        })



    }
}
package com.example.fragmentwithparceble.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmentwithparceble.R
import com.example.fragmentwithparceble.activity.Dados

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER



class DadosFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_dados, container, false)
        var nomeResultado:TextView = view.findViewById(R.id.nomeResultado)
        var sobrenomeResultado:TextView = view.findViewById(R.id.sobrenomeResultado)
        var idadeResultado:TextView = view.findViewById(R.id.idadeResultado)


        val dados = requireArguments().getSerializable("Dado") as Dados
        nomeResultado.setText(dados.nome)
        sobrenomeResultado.setText(dados.sobrenome)
        idadeResultado.setText((dados.idade))

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DadosFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}
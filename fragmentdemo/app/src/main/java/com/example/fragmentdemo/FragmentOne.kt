package com.example.fragmentdemo

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"OnView Created")
        return inflater.inflate(R.layout.fragment_one,container,false)
    }
    val TAG="Fragment One"

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG,"OnActivity Created")
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG,"OnAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"OnStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG,"OnDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG,"On Detach")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"On Destroy")
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val communicter:ICommunicator =  activity as ICommunicator
        val person= Person("Test","last","test@gmail.com",20)

        button2.setOnClickListener{
            val destinationFragment = ThirdFragment()
            val bundle = Bundle()
            bundle.putString("MSG",editText_msg.text.toString())
            bundle.putParcelable("Person",person)
            destinationFragment.arguments= bundle
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.root_container,destinationFragment)?.addToBackStack("fragmentthird")?.commit()

        }
        button_second.setOnClickListener {
            val destinationFragment = SecondFragment()
            val bundle = Bundle()
            bundle.putString("MSG",editText_msg.text.toString())
            bundle.putParcelable("Person",person)
            destinationFragment.arguments= bundle
            activity?.supportFragmentManager?.beginTransaction()?.replace(R.id.root_container,destinationFragment)?.addToBackStack("fragmentsecond")?.commit()
        }
        button_comm.setOnClickListener {
            communicter.getMessage("I am from Fragment One")
            communicter.getPerson(person)
        }

    }


}
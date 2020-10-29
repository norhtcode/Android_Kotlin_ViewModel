package com.example.android_kotlin_viewmodel.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.android_kotlin_viewmodel.R

//The code that accompanies the main_fragment.xml.
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    //Method which is called when the fragment is created, and inflates the main_fragment.xml layout file
    //so that it is displayed within the container area of the main activity layout (main_activity.xml)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //Fragment or Activity maintain references to the ViewModels on which it relies for data using an instance
        //of the ViewModelProvider class.
        //A ViewModelProvider instance is created via a call to the ViewModelProviders.of() method.
        //val viewModelProvider = ViewModelProviders.of(fragment)

        //When called, the method is passed a reference to the current Fragment or Activity and returns a
        //ViewModelProvider instance.
        //Once the ViewModelProvider instance has been created, the get() method can be called on that instance
        //passing through the class of spcific ViewModel that is required.
        //val viewModel = ViewModleProider.of(this).get(MainViewModel::class.java)

        //The single line code for this
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        //With access to the model view, code can now be added to the Fragment to begin working with the data model.
        view?.findViewById<TextView>(R.id.resultText)?.text = viewModel.getResult().toString()

        //The onClick property of the Button is used to designate the method to be called when the button is clicked by the user.
        //Unfortunately, this property is only able to call methods on an activity and cannot be used to call a method in a Fragmet.
        //To get around this limitation, we will need to add som code to the Fragment class to set up an onClick listnener on the button.
        view?.findViewById<Button>(R.id.convertButton)?.setOnClickListener {
            if(view?.findViewById<TextView>(R.id.dollarText)?.text.toString().isNotEmpty()) {
                viewModel.setAmount(view?.findViewById<TextView>(R.id.dollarText)?.text.toString())
                view?.findViewById<TextView>(R.id.resultText)?.text = viewModel.getResult().toString()
            }else{
                view?.findViewById<TextView>(R.id.resultText)?.text = "No Value"
            }
        }
    }
}
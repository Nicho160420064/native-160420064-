package id.ac.ubaya.informatika.a160420062_week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_end_game.*


class endGameFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_end_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(arguments != null){
            val playerPoints = endGameFragmentArgs.fromBundle(requireArguments()).playerPoint
            txtScore.text = "Your Score is $playerPoints"
        }
        btnBack.setOnClickListener{
            val action = endGameFragmentDirections.endToMain()
            Navigation.findNavController(it).navigate(action)
        }
    }

}
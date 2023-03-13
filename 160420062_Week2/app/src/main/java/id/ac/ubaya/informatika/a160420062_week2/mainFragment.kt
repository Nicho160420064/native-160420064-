package id.ac.ubaya.informatika.a160420062_week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import kotlin.random.Random

class mainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var ans = 0
        var randNum1 = Random.nextInt(0,100)
        var randNum2 = Random.nextInt(0,100)
        var poin = 0
        ans = randNum1 + randNum2


        if (ans!=null){
            txtNum.text = "$randNum1 + $randNum2"
        }

        super.onViewCreated(view, savedInstanceState)
        btnSubmit.setOnClickListener{
            var userAns = txtAnswer.text
            if(ans.toString()==userAns.toString()){
                txtNum.text = "$randNum1 + $randNum2"
                poin++
                randNum1 = Random.nextInt(0,100)
                randNum2 = Random.nextInt(0,100)
                ans = randNum1 + randNum2
                txtNum.text = "$randNum1 + $randNum2"

            }
            else{
                val action = mainFragmentDirections.mainToEnd(poin)
                Navigation.findNavController(it).navigate(action)
            }

        }

    }


}
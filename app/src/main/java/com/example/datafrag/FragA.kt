import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.datafrag.FragB
import com.example.datafrag.R
import com.example.datafrag.databinding.FragmentFragABinding

class FragA : Fragment() {
    lateinit var binding: FragmentFragABinding
    lateinit var bundle: Bundle
    lateinit var fragB: FragB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFragABinding.inflate(layoutInflater)
        val bundle = Bundle()
        fragB = FragB()



        binding.btn.setOnClickListener {

            bundle.putString("key", binding.editTextTextPersonName.text.toString())
            fragB.arguments = bundle;

            fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainerView, fragB)
                ?.commit()

        }

        return binding.root


    }


}
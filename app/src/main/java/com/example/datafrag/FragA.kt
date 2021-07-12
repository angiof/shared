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
    lateinit var fragB: FragB



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFragABinding.inflate(layoutInflater)


        binding.btn.setOnClickListener {

            bundlerSet()

        }

        return binding.root


    }

    private fun bundlerSet() {
        val bundleArgs = Bundle()
        fragB = FragB()
        bundleArgs.putString("key", binding.editTextTextPersonName.text.toString())
        fragB.arguments = bundleArgs
        fragmentManager?.beginTransaction()?.replace(R.id.fragmentContainerView, fragB)?.commit()

    }


}
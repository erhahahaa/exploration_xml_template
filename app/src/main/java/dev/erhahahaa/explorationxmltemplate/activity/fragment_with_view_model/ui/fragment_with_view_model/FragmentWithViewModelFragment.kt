package dev.erhahahaa.explorationxmltemplate.activity.fragment_with_view_model.ui.fragment_with_view_model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dev.erhahahaa.explorationxmltemplate.R

class FragmentWithViewModelFragment : Fragment() {

  companion object {
    fun newInstance() = FragmentWithViewModelFragment()
  }

  private val viewModel: FragmentWithViewModelViewModel by viewModels()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?,
  ): View {
    return inflater.inflate(R.layout.fragment_fragment_with_view_model, container, false)
  }
}

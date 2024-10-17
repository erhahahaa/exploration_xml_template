package dev.erhahahaa.explorationxmltemplate.activity.fragment_with_view_model

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.erhahahaa.explorationxmltemplate.R
import dev.erhahahaa.explorationxmltemplate.activity.fragment_with_view_model.ui.fragment_with_view_model.FragmentWithViewModelFragment

class FragmentWithViewModelActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_fragment_with_view_model)
    if (savedInstanceState == null) {
      supportFragmentManager
        .beginTransaction()
        .replace(R.id.container, FragmentWithViewModelFragment.newInstance())
        .commitNow()
    }
  }
}

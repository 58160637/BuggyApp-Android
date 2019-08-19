package scb.academy.jinglebell.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_profile.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import scb.academy.jinglebell.R
import scb.academy.jinglebell.activity.GreetActivity
import scb.academy.jinglebell.activity.SongInfoActivity
import scb.academy.jinglebell.adapter.CountryAdapter
import scb.academy.jinglebell.adapter.SongAdapter
import scb.academy.jinglebell.extension.showToast
import scb.academy.jinglebell.model.Country
import scb.academy.jinglebell.service.ApiManager

class ProfileFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        profileButton.setOnClickListener {
            //context?.showToast(editText.text.toString())
            var intent = Intent(context, GreetActivity::class.java)
            intent.putExtra("name",editText.text.toString())
            startActivity(intent)
        }
    }


}

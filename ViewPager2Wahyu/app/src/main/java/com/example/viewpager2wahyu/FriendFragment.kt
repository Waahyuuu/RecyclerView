package com.example.viewpager2wahyu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FriendFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FriendFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var friendAdapter: FriendAdapter
    private val friends = mutableListOf<MyFriend>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_friend, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        setupRecyclerView()
        return view
    }

    private fun setupRecyclerView(){
        friends.addAll(
            listOf(
                MyFriend("Kusuma","Laki-laki","+62812346435","Kusum@gmail.com", R.drawable.kusuma),
                MyFriend("Diny","Perempuan","+6281285373422","Dny@gmail.com",R.drawable.diny),
                MyFriend("Kulino","Laki-laki","+62834753799","KulNOO@gmail.com",R.drawable.kulino),
                MyFriend("Jamal","Laki-laki","+628123453888","Jml@gmail.com",R.drawable.jamal),
                MyFriend("Azkal","Laki-laki","+628999399333","Zekly@gmail.com",R.drawable.azkal),
                MyFriend("Rudi","Laki-laki","+6281234545649","Rudi12@gmail.com",R.drawable.rudi),
                MyFriend("Dragon","Laki-laki","+62812556566","Dragoned@gmail.com",R.drawable.dragon),
                MyFriend("Bety","Perempuan","+6281234567895","Bty23@gmail.com",R.drawable.bety),
                MyFriend("Liardo","Laki-laki","+628125644434","Liarmen@gmail.com",R.drawable.liardo)

            )
        )

        friendAdapter = FriendAdapter(friends)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = friendAdapter
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FriendFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FriendFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
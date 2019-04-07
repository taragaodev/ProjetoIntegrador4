package com.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.pi4.farol.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {


    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_chat, container, false);
            EditText edit_msg = v.findViewById(R.id.edit_msg_send);
            TextView msgOne = v.findViewById(R.id.txt_chat_one);
            TextView msgTwo = v.findViewById(R.id.txt_chat_two);
            ImageView imgOne = v.findViewById(R.id.image_chat_one);
            ImageView imgTwo = v.findViewById(R.id.image_chat_two);
            Button btnSendMsg = v.findViewById(R.id.btn_send_msg);
        return v;
    }

}

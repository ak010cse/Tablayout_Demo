package com.example.tablayoutdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NotificationFragment extends Fragment {
    TextView notification_textView;

    public NotificationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_notification, container, false);
         notification_textView=(TextView)view.findViewById(R.id.textView);
        setText();

        return view;
    }
    public  void setText(){
        notification_textView.setText("Notification Fragment");


    }

}

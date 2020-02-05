package com.example.tablayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout home_layout, message_layout, video_layout, notification_layout;
    private TextView textView, home, message, video, notification;
    private HomeFragment homeFragment;
    private MessageFragment messageFragment;
    VideoFragment videoFragment;
    NotificationFragment notificationFragment;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home_layout = (LinearLayout) findViewById(R.id.home_linearLayout);
        message_layout = (LinearLayout) findViewById(R.id.message_linearLayout);
        video_layout = (LinearLayout) findViewById(R.id.video_linearLayout);
        notification_layout = (LinearLayout) findViewById(R.id.notification_linearLayout);
        textView = (TextView) findViewById(R.id.textView);
        home = (TextView) findViewById(R.id.home);
        message = (TextView) findViewById(R.id.message);
        video = (TextView) findViewById(R.id.video);
        notification = (TextView) findViewById(R.id.notification);
        frameLayout=(FrameLayout)findViewById(R.id.frameLayout);

        message.setVisibility(View.GONE);
        video.setVisibility(View.GONE);
        notification.setVisibility(View.GONE);

        textView.setText("Home Activity");
        homeFragment = new HomeFragment();
        messageFragment = new MessageFragment();
        videoFragment=new VideoFragment();
        notificationFragment =new NotificationFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, homeFragment);
        transaction.commit();
        clickListener();
    }

    public void clickListener() {
        home_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Home Activity");
                home.setVisibility(View.VISIBLE);
                message.setVisibility(View.GONE);
                video.setVisibility(View.GONE);
                notification.setVisibility(View.GONE);
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, homeFragment);
                transaction.commit();
            }
        });
        message_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Message Activity");
                home.setVisibility(View.GONE);
                message.setVisibility(View.VISIBLE);
                video.setVisibility(View.GONE);
                notification.setVisibility(View.GONE);

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, messageFragment);
                transaction.commit();
            }
        });
        video_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Video Activity");
                home.setVisibility(View.GONE);
                message.setVisibility(View.GONE);
                video.setVisibility(View.VISIBLE);
                notification.setVisibility(View.GONE);
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, videoFragment);
                transaction.commit();
            }
        });
        notification_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Notification Activity");
                home.setVisibility(View.GONE);
                message.setVisibility(View.GONE);
                video.setVisibility(View.GONE);
                notification.setVisibility(View.VISIBLE);
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameLayout, notificationFragment);
                transaction.commit();
            }
        });
    }

}

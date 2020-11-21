package com.yskim.filemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;

import java.io.File;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        //getFolderFileList();
        File root_dir = Environment.getRootDirectory();
        File data_dir = Environment.getDataDirectory();
        File storage_dir = Environment.getStorageDirectory();
        File download_dir = Environment.getDownloadCacheDirectory();

        String[] root_str = root_dir.list();
        String[] data_str = data_dir.list();
        String[] storage_str = storage_dir.list();
        String[] download_str = download_dir.list();


        TextView textView = new TextView(this);
        textView.setText(String.join("\n", str));
        mainLayout.addView(textView);


        //Toast.makeText(this, String.join("\n", str), Toast.LENGTH_LONG).show();

        setContentView(mainLayout);
        //setContentView(R.layout.activity_main);
    }




}


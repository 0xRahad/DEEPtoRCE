package com.android.deeptorce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rce);

        // Get the TextView reference
        TextView textView = findViewById(R.id.textView);

        // Get the data from the intent
        Uri appLinkData = getIntent().getData();

        if (appLinkData != null) {
            // Extract the path from the URI
            String pathPrefix = appLinkData.getPath();
            if (pathPrefix != null && pathPrefix.contains("exploit")) {
                try {
                    // Execute the command
                    Process process = Runtime.getRuntime().exec("whoami");

                    // Read the output of the command
                    BufferedReader reader = new BufferedReader(
                            new InputStreamReader(process.getInputStream()));
                    StringBuilder output = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        output.append(line).append("\n");
                    }

                    // Display the output in the TextView
                    textView.setText(output.toString());

                    // Close the reader
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

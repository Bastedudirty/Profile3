package com.example.profile;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AboutUsActivity extends AppCompatActivity {

    private TextView aboutUsText;
    private TextView contactInfoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Make sure the layout resource name is correct
        setContentView(R.layout.activity_about_us);

        // Initialize the TextViews
        aboutUsText = findViewById(R.id.about_us_text);
        contactInfoText = findViewById(R.id.contact_info);

        // Set the information you want to display
        aboutUsText.setText("Hello! I'm [Your Name]. I'm a software developer with a passion for Android development. I enjoy learning new technologies and solving problems.");
        contactInfoText.setText("You can reach me at: [Your Contact Info]");
    }
}

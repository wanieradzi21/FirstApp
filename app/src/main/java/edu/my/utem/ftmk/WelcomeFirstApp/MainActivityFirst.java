package edu.my.utem.ftmk.WelcomeFirstApp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import edu.my.utem.ftmk.WelcomeFirstApp.databinding.ActivityMainFirstBinding;

public class MainActivityFirst extends AppCompatActivity {
    ActivityMainFirstBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainFirstBinding.inflate(getLayoutInflater());

        EdgeToEdge.enable(this);
        setContentView(binding.getRoot());

        //editTextText2 = (editText) findViewById(R.id.editTextText2);
        //textView = (TextView) findViewById(R.id.textView);
    }

    public void fnGreet(View view)
    {
        binding.textView.setText("Hello welcome" + binding.editTextText2.getText());
    }
}

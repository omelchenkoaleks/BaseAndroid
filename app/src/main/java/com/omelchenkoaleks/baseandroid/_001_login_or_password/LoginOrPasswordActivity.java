package com.omelchenkoaleks.baseandroid._001_login_or_password;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.omelchenkoaleks.baseandroid.R;

public class LoginOrPasswordActivity extends AppCompatActivity {
    private TextView mResultTextView;
    private EditText mLoginEditText;
    private EditText mPasswordEditText;
    private String mRealLogin;
    private String mRealPassword;

    private Button mOnClickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_001_login_or_password);

        mOnClickButton = findViewById(R.id.login_button);

        mRealLogin = "Admin";
        mRealPassword = "123";

        mResultTextView = findViewById(R.id.result_text_view);
        mLoginEditText = findViewById(R.id.login_edit_text);
        mPasswordEditText = findViewById(R.id.password_edit_text);

        mOnClickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loginText = mLoginEditText.getText().toString();
                String passwordText= mPasswordEditText.getText().toString();
                String text = (loginText.equals(mRealLogin) && passwordText.equals(mRealPassword)) ?
                        loginText + " you entered successful" : " error";
                mResultTextView.setText(text);
            }
        });
    }

}

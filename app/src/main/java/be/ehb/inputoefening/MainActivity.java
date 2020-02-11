package be.ehb.inputoefening;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button convertBtn;
    private EditText eurEt;
    private TextView dollarTv;

    private View.OnClickListener convertListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Double eur = Double.parseDouble(eurEt.getText().toString());
            dollarTv.setText(String.format("%.2f",eur*1.0919));

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        convertBtn = findViewById(R.id.btn_convert2);
        eurEt = findViewById(R.id.et_Eur);
        dollarTv = findViewById(R.id.tv_Dollar);
        convertBtn.setOnClickListener(convertListener);
    }
}

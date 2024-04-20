package cn.edu.jnu.x2021102244;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = this.findViewById(R.id.button);
        EditText editText = this.findViewById(R.id.editTextText);
        TextView textView = this.findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String scores = editText.getText().toString();
                String []arrayScores = scores.split(",");
                BowlingGame game = new BowlingGame();
                for (int i = 0; i < arrayScores.length; i++)
                {
                    game.roll(Integer.parseInt(arrayScores[i]));
                }
                textView.setText(textView.getText()+Integer.toString(game.score()));
            }
        });
    }
}
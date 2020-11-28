package io.github.webbluetoothcg.bletestperipheral;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StartUUIDinput extends Activity {
EditText uuid;
Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_uuidinput);
        uuid = (EditText) findViewById(R.id.uuid);
        submit = (Button) findViewById(R.id.buttonsubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uuidstring = uuid.getText().toString();
                Intent intent = new Intent(StartUUIDinput.this, Peripherals.class);
                intent.putExtra("uuid",uuidstring);
                startActivity(intent);
            }
        });

    }
}

package men.ngopi.aviedb.mytabview;

import android.support.design.button.MaterialButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class TabProfile extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_profile, container, false);

        // Jabatan Spinner
        Spinner jabatanSpinner = rootView.findViewById(R.id.jabatanSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(rootView.getContext(),
                R.array.jabatanSpinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        jabatanSpinner.setAdapter(adapter);

        // Gender Spinner
        Spinner genderSpinner = rootView.findViewById(R.id.genderSpinner);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(rootView.getContext(),
                R.array.genderArray, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(adapter1);

        EditText jabatanET = rootView.findViewById(R.id.jabatanTF);
        jabatanET.setText("      ");
        EditText genderET = rootView.findViewById(R.id.genderTF);
        genderET.setText("       ");

        MaterialButton btn = rootView.findViewById(R.id.saveBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Changes saved!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        return rootView;
    }
}

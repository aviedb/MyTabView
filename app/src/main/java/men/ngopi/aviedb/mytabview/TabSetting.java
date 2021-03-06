package men.ngopi.aviedb.mytabview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.Switch;

public class TabSetting extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_setting, container, false);

        // Private Switch
        Switch privateSwitch = rootView.findViewById(R.id.privateSwitch);
        Boolean psState = privateSwitch.isChecked();

        FloatingActionButton fab = rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Add Another Account", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        RadioButton radioButton = rootView.findViewById(R.id.lightRB);
        radioButton.setChecked(true);

        return rootView;
    }
}

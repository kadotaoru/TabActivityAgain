package to.msn.wings.tabactivityagain;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import db.TaskDBHelper;

import androidx.appcompat.app.AppCompatActivity;

public class Frag1 extends Fragment {

    private static final Object Tag = "Frag1"; //Frag1に変更
    private TaskDBHelper mHelper;
    private ListView mTaskListView;
    private ArrayAdapter<String> mAdapter;

    //frag1_layout.xmlと連携
    @Nullable
    @Override
    public View onCreateView(
        @Nullable LayoutInflater inflater,
        @Nullable ViewGroup container,
        @Nullable Bundle savedInstanceState){
    return inflater.inflate(R.layout.frag1_layout, container, false);
    }
}

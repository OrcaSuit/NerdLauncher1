package android.bignerdranch.com;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NerdLauncherFragment extends Fragment {
    private RecyclerView mRecycleListView;
    public static  NerdLauncherFragment newInstance() {
        return new NerdLauncherFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_nerd_launcher, container, false);
        mRecycleListView = (RecyclerView)v.findViewById(R.id.fragmet_nerd_launcher_recycler_view);
        mRecycleListView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return v;
    }
}

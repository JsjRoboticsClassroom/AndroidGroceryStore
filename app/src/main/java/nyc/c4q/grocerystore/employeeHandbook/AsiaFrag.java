package nyc.c4q.grocerystore.employeeHandbook;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import nyc.c4q.grocerystore.R;

/**
 * Created by asiagibson on 10/8/16.
 */

public class AsiaFrag extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveIntanceState) {
        View view = inflater.inflate(R.layout.asia_gibson, container, false);
        return view;

    }



}
/*   FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        AsiaFrag fragment = new AsiaFrag();
        fragmentTransaction.add(R.id.viewGibson, fragment);
        fragmentTransaction.commit();*/

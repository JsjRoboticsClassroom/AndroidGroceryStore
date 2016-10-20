package nyc.c4q.grocerystore.employeeHandbook;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.grocerystore.R;
import nyc.c4q.grocerystore.employeeHandbook.employees.Ashique;
import nyc.c4q.grocerystore.employeeHandbook.employees.HuiLily;
import nyc.c4q.grocerystore.employeeHandbook.employees.Hyunjoo;

public class EmployeeView extends AppCompatActivity {
    public static final String EMPLOYEE_NAME = "extra.employee.name";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_view);
        String employee = getIntent().getStringExtra(EMPLOYEE_NAME);
        if(employee != null){
            switch (employee) {
                case "HuiLily":
                    showHuiLily();
                    break;
                case "Ashique":
                    showAshique();
                    break;
                case "Hyunjoo":
                    showHyunjoo();
                    break;
                case "Helen":
                    showHelen();
                    break;
            }
        }
    }


    private void showHelen(){
        getFragmentManager().beginTransaction().add(R.id.employee_profile, new Helen()).commit();
    }
    private void showAshique(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new Ashique());
        fragmentTransaction.commit();
    }

    private void showHuiLily(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new HuiLily());
        fragmentTransaction.commit();
    }
    private void showHyunjoo(){
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.employee_profile,new Hyunjoo());
        fragmentTransaction.commit();
    }
}

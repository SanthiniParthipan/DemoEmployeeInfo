package sg.edu.rp.c346.id19028654.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployeeInfo;
    ArrayList<EmployeeInfo>alEmployeeInfo;
    CustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvEmployeeInfo=findViewById(R.id.listViewEmployeeInfo);
        alEmployeeInfo=new ArrayList<>();
        EmployeeInfo item1= new EmployeeInfo("john","software technical leader","3400.0");
        alEmployeeInfo.add(item1);
        EmployeeInfo item2= new EmployeeInfo("May","Programmer","2200.0");
        alEmployeeInfo.add(item2);

        adapter=new CustomAdapter(this,R.layout.row,alEmployeeInfo);
        lvEmployeeInfo.setAdapter(adapter);
    }
}

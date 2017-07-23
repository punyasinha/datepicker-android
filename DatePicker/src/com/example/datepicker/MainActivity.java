package com.example.datepicker;

import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.view.Menu;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends Activity {
DatePickerDialog date;
TimePickerDialog time;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void d(View v){
		date=new DatePickerDialog(this, datecall, 2016, 04, 02);
		date.show();
		//Toast.makeText(this, "bjh", Toast.LENGTH_SHORT).show();
	}
	public void t(View v){
		time=new TimePickerDialog(this, timecall, 02, 18, false);
		time.show();
	}
  DatePickerDialog.OnDateSetListener datecall=new OnDateSetListener() {
	
	@Override
	public void onDateSet(DatePicker arg0, int year, int month, int dayofmonth) {
		// TODO Auto-generated method stub
		//Toast.makeText(this, "jgj", Toast.LENGTH_SHORT).show();
		Toast.makeText(MainActivity.this, "the date selected is: "+dayofmonth+"/"+ ++month+"/"+year, Toast.LENGTH_SHORT).show();
		
	}
};
TimePickerDialog.OnTimeSetListener timecall=new OnTimeSetListener() {
	
	@Override
	public void onTimeSet(TimePicker arg0, int hour, int min) {
		// TODO Auto-generated method stub
		Toast.makeText(MainActivity.this, "the time is:"+hour+":"+min, Toast.LENGTH_SHORT).show();
	}
};
}

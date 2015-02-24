package pkl54.capi.subseksi.pkl54.Dashboard;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import pkl54.capi.subseksi.pkl54.R;

public class QuestionerListAdapter extends ArrayAdapter<Questioner> {

	protected static final String LOG_TAG = QuestionerListAdapter.class.getSimpleName();
	
	private List<Questioner> items;
	private int layoutResourceId;
	private Context context;

	public QuestionerListAdapter(Context context, int layoutResourceId, List<Questioner> items) {
		super(context, layoutResourceId, items);
		this.layoutResourceId = layoutResourceId;
		this.context = context;
		this.items = items;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		kuesionerHolder holder = null;

		LayoutInflater inflater = ((Activity) context).getLayoutInflater();
		row = inflater.inflate(layoutResourceId, parent, false);

		holder = new kuesionerHolder();
		holder.kuesioner = items.get(position);
		holder.sendButton = (ImageView)row.findViewById(R.id.atomPay_removePay);
		holder.sendButton.setTag(holder.kuesioner);

		holder.name = (TextView)row.findViewById(R.id.atomPay_name);
		

		row.setTag(holder);

		setupItem(holder);
		return row;
	}

	private void setupItem(kuesionerHolder holder) {
		holder.name.setText(holder.kuesioner.getName());
	}

	public static class kuesionerHolder {
		Questioner kuesioner;
		TextView name;
		ImageView sendButton;
	}
	
	
	

	
}

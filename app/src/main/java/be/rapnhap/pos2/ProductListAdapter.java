package be.rapnhap.pos2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ProductListAdapter extends ArrayAdapter<Product> {

    private static final String TAG = "ProductListAdapter";

    private Context mContext;
    int mResource;

    /**
     * Default constructor for the ProductListAdapter
     * @param context
     * @param resource
     * @param objects
     */
    public ProductListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Product> objects) {
        super(context, resource, objects);
        mContext =context;
        mResource = resource;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // get product info
        String productId = getItem(position).getProduct();
        String label = getItem(position).getLabel();
        String group = getItem(position).getGroup();
        String price = getItem(position).getPrice();
        String sequence = getItem(position).getSequence();

        // Create product object with the info
        Product product = new Product(productId,label,price,group,sequence);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);


        Button butPlus = convertView.findViewById(R.id.buttonPlus);
        Button butMin = convertView.findViewById(R.id.buttonMin);
        TextView tvQty = convertView.findViewById(R.id.textView1);

        //TextView tvGroup = convertView.findViewById(R.id.textView1);
        //TextView tvLabel = convertView.findViewById(R.id.textView2);
        //TextView tvPrice = convertView.findViewById(R.id.textView3);

        butPlus.setText(label);
        switch (group) {
            case "aard":
                butPlus.setBackgroundResource(R.color.aard);
                butMin.setBackgroundResource(R.color.aard);
            case "blader":
                butPlus.setBackgroundResource(R.color.blader);
                butMin.setBackgroundResource(R.color.blader);
        }


        tvQty.setText("1");
        //tvLabel.setText(label);
        //tvPrice.setText(price);

        return convertView;
    }
}

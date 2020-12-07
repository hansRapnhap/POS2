package be.rapnhap.pos2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
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
        Integer[] quantitiesL = new Integer[30];
        Arrays.fill(quantitiesL, 0);

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
                butPlus.setBackgroundColor(butPlus.getContext().getResources().getColor(R.color.aardappel));
                butMin.setBackgroundColor(butMin.getContext().getResources().getColor(R.color.aardappel));
                break;
            case "ijsjes":
                butPlus.setBackgroundColor(butPlus.getContext().getResources().getColor(R.color.ijs));
                butMin.setBackgroundColor(butMin.getContext().getResources().getColor(R.color.ijs));
                break;
            case "Koffie":
                butPlus.setBackgroundColor(butPlus.getContext().getResources().getColor(R.color.brown));
                butMin.setBackgroundColor(butMin.getContext().getResources().getColor(R.color.brown));
                break;
            case "Thee":
                butPlus.setBackgroundColor(butPlus.getContext().getResources().getColor(R.color.tea));
                butMin.setBackgroundColor(butMin.getContext().getResources().getColor(R.color.tea));
                break;
            case "blader":
                butPlus.setBackgroundColor(butPlus.getContext().getResources().getColor(R.color.bladerdeeg));
                butMin.setBackgroundColor(butMin.getContext().getResources().getColor(R.color.bladerdeeg));
                break;
            case "vanille":
                butPlus.setBackgroundColor(butPlus.getContext().getResources().getColor(R.color.vanille));
                butMin.setBackgroundColor(butMin.getContext().getResources().getColor(R.color.vanille));
                break;
            case "frisdrank":
                butPlus.setBackgroundColor(butPlus.getContext().getResources().getColor(R.color.frisdrank));
                butMin.setBackgroundColor(butMin.getContext().getResources().getColor(R.color.frisdrank));
                break;
            case "bier":
                butPlus.setBackgroundColor(butPlus.getContext().getResources().getColor(R.color.wijn));
                butMin.setBackgroundColor(butMin.getContext().getResources().getColor(R.color.wijn));
                break;
            case "wijn":
                butPlus.setBackgroundColor(butPlus.getContext().getResources().getColor(R.color.wijn));
                butMin.setBackgroundColor(butMin.getContext().getResources().getColor(R.color.wijn));
                    break;
        }

        butPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if (qtyA1 > 0) {
                    quantitiesL[position]+= 1;
                    tvQty.setText(quantitiesL[position].toString());

                // TODO amount = amount.subtract(priceA1);
                    // TODO loadData();
                //}
            }
        });

        //tvQty.setText("1"");
        //tvLabel.setText(label);
        //tvPrice.setText(price);

        return convertView;
    }
}

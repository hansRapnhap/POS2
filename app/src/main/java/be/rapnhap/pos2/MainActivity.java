package be.rapnhap.pos2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.math.BigDecimal;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: Started");
        ListView mListViewL = (ListView) findViewById(R.id.listViewL);
        ListView mListViewR = (ListView) findViewById(R.id.listViewR);

        // Create the Product objects
        Product[] productL =new Product[21];
        Product[] productR =new Product[19];
        productL[0] = new Product("A bieslook", "A bieslook", "2", "aard", "1");
        productL[1] = new Product("A parmes", "A parmes", "2", "aard", "2");
        productL[2] = new Product("A gorg", "A gorg", "2,3", "aard", "3");
        productL[3] = new Product("A olijf", "A olijf", "2,3", "aard", "4");
        productL[4] = new Product("A ham", "A ham", "2,5", "aard", "6");
        productL[5] = new Product("A chorr", "Achorr", "2,5", "aard", "7");
        productL[6] = new Product("A kip", "A kip", "2,8", "aard", "8");
        productL[7] = new Product("A zalm", "A zalm", "3", "aard", "10");
        productL[8] = new Product("Chocolat", "Chocolat", "2,3", "ijsjes", "1");
        productL[9] = new Product("Cornet", "Cornet", "2", "ijsjes", "2");
        productL[10] = new Product("Vanille", "Vanille", "1,2", "ijsjes", "3");
        productL[11] = new Product("Satelite", "Satelite", "1", "ijsjes", "4");
        productL[12] = new Product("Expresso", "Expresso", "1,8", "Koffie", "1");
        productL[13] = new Product("Expr M", "Expr M", "2", "Koffie", "2");
        productL[14] = new Product("Lungo", "Lungo", "2", "Koffie", "3");
        productL[15] = new Product("Lungo M", "Lungo M", "2,2", "Koffie", "4");
        productL[16] = new Product("Deca", "Deca", "2", "Koffie", "5");
        productL[17] = new Product("Deca M", "Deca M", "2,2", "Koffie", "6");
        productL[18] = new Product("Yellow", "Yellow", "1,5", "Thee", "1");
        productL[19] = new Product("Green", "Green", "1,5", "Thee", "2");
        productL[20] = new Product("Rozenb", "Rozenb", "1,5", "Thee", "3");


        productR[0] = new Product("B champ", "B champ", "3", "blader", "1");
        productR[1] = new Product("B courg", "B courg", "3", "blader", "2");
        productR[2]  = new Product("B gehakt", "B gehakt", "3,8", "blader", "3");
        productR[3]  = new Product("B Ham", "B Ham", "3,8", "blader", "4");
        productR[4]  = new Product("B appel", "B appel", "3", "blader", "5");
        productR[5]  = new Product("B Chocol", "B Chocol", "3", "blader", "6");
        productR[6]  = new Product("Vanille", "Vanille", "2", "vanille", "1");
        productR[7]  = new Product("Cola", "Cola", "1,5", "frisdrank", "1");
        productR[8]  = new Product("Cola 0", "Cola 0", "1,5", "frisdrank", "2");
        productR[9]  = new Product("Ice Tea", "Ice Tea", "1,5", "frisdrank", "3");
        productR[10] = new Product("Fanta", "Fanta", "1,5", "frisdrank", "4");
        productR[11] = new Product("Appel", "Appel", "2", "frisdrank", "5");
        productR[12] = new Product("Sinaas", "Sinaas", "2,5", "frisdrank", "6");
        productR[13] = new Product("Plat w", "Plat w", "1,5", "frisdrank", "7");
        productR[14] = new Product("Spuitw", "Spuitw", "1,5", "frisdrank", "8");
        productR[15] = new Product("Cecemel", "Cecemel", "2", "frisdrank", "9");
        productR[16] = new Product("Pint", "Pint", "2", "bier", "1");
        productR[17] = new Product("Wit", "Wit", "2,5", "wijn", "1");
        productR[18] = new Product("Rood", "Rood", "2,5", "wijn", "2");

        ArrayList<Product> productListL = new ArrayList();

        for (int i = 0; i < productL.length; i++ ) {
            productListL.add(productL[i]);
        }
        ProductListAdapter adapterL = new ProductListAdapter(this, R.layout.adapter_view_layout, productListL);
        mListViewL.setAdapter(adapterL);
        mListViewL.setDivider(null);

        ArrayList<Product> productListR = new ArrayList();
        for (int i = 0; i < productR.length; i++ ) productListR.add(productR[i]);
        ProductListAdapter adapterR = new ProductListAdapter(this, R.layout.adapter_view_layout, productListR);
        mListViewR.setAdapter(adapterR);
        mListViewR.setDivider(null);

    }
}
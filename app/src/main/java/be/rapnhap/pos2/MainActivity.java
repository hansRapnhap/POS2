package be.rapnhap.pos2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: Started");
        ListView mListView = (ListView) findViewById(R.id.listView);

        // Create the Product objects
        Product[] product =new Product[40];
        product[0] = new Product("A bieslook", "A bieslook", "2", "aard", "1");
        product[1] = new Product("A parmes", "A parmes", "2", "aard", "2");
        product[2] = new Product("A gorg", "A gorg", "2,3", "aard", "3");
        product[3] = new Product("A olijf", "A olijf", "2,3", "aard", "4");

        product[4] = new Product("A ham", "A ham", "2,5", "aard", "6");
        product[5] = new Product("A chorr", "Achorr", "2,5", "aard", "7");
        product[6] = new Product("A kip", "A kip", "2,8", "aard", "8");

        product[7] = new Product("A zalm", "A zalm", "3", "aard", "10");

        product[8] = new Product("B champ", "B champ", "3", "blader", "1");
        product[9] = new Product("C courg", "C courg", "3", "blader", "2");
        product[10] = new Product("B gehakt", "B gehakt", "3,8", "blader", "3");
        product[11] = new Product("B Ham", "B Ham", "3,8", "blader", "4");
        product[12] = new Product("B appel", "B appel", "3", "blader", "5");
        product[13] = new Product("B Chocol", "B Chocol", "3", "blader", "6");

        product[14] = new Product("Vanille", "Vanille", "2", "vanille", "1");
        product[15] = new Product("Chocolat", "Chocolat", "2,3", "ijsjes", "1");
        product[16] = new Product("Cornet", "Cornet", "2", "ijsjes", "2");
        product[17] = new Product("Vanille", "Vanille", "1,2", "ijsjes", "3");
        product[18] = new Product("Satelite", "Satelite", "1", "ijsjes", "4");
        product[19] = new Product("Cola", "Cola", "1,5", "frisdrank", "1");
        product[20] = new Product("Cola 0", "Cola 0", "1,5", "frisdrank", "2");
        product[21] = new Product("Tea", "Tea", "1,5", "frisdrank", "3");
        product[22] = new Product("Fanta", "Fanta", "1,5", "frisdrank", "4");
        product[23] = new Product("Appel", "Appel", "2", "frisdrank", "5");
        product[24] = new Product("Appels", "Appels", "2,5", "frisdrank", "6");
        product[25] = new Product("Plat w", "Plat w", "1,5", "frisdrank", "7");
        product[26] = new Product("Spuitw", "Spuitw", "1,5", "frisdrank", "8");
        product[27] = new Product("Cecemel", "Cecemel", "2", "frisdrank", "9");
        product[28] = new Product("Expresso", "Expresso", "1,8", "Koffie", "1");
        product[29] = new Product("Expr M", "Expr M", "2", "Koffie", "2");
        product[30] = new Product("Lungo", "Lungo", "2", "Koffie", "3");
        product[31] = new Product("Lungo M", "Lungo M", "2,2", "Koffie", "4");
        product[32] = new Product("Deca", "Deca", "2", "Koffie", "5");
        product[33] = new Product("Deca M", "Deca M", "2,2", "Koffie", "6");
        product[34] = new Product("Yellow", "Yellow", "1,5", "Thee", "1");
        product[35] = new Product("Green", "Green", "1,5", "Thee", "2");
        product[36] = new Product("Rozenb", "Rozenb", "1,5", "Thee", "3");
        product[37] = new Product("Pint", "Pint", "2", "bier", "1");
        product[38] = new Product("Wit", "Wit", "2,5", "wijn", "1");
        product[39] = new Product("Rood", "Rood", "2,5", "wijn", "2");

        ArrayList<Product> productList = new ArrayList();
        for (int i = 0; i < product.length; i++ ) productList.add(product[i]);

        ProductListAdapter adapter = new ProductListAdapter(this, R.layout.adapter_view_layout, productList);
        mListView.setAdapter(adapter);

    }
}
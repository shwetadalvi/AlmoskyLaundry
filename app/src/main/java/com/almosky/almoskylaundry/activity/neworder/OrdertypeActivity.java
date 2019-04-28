package com.almosky.almoskylaundry.activity.neworder;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.almosky.almoskylaundry.Almosky;
import com.almosky.almoskylaundry.R;
import com.almosky.almoskylaundry.activity.AddressListActivity;
import com.almosky.almoskylaundry.activity.SignupOrLoginActivity;
import com.almosky.almoskylaundry.common.BaseActivity;
import com.almosky.almoskylaundry.utils.AppPrefes;
import com.almosky.almoskylaundry.utils.api.ApiCalls;
import com.almosky.almoskylaundry.utils.constants.PrefConstants;
import com.leo.simplearcloader.SimpleArcDialog;


public class OrdertypeActivity extends BaseActivity {

    private RecyclerView activeOrderRecyclerView;

    private TextView addNew, name;
    AppPrefes appPrefes;
    SimpleArcDialog dialog;
    ApiCalls apiCalls;

    public static final int ACTIVE_ORDERS = 8;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_order_type);

        appPrefes = new AppPrefes(this);
        dialog = new SimpleArcDialog(this);
        apiCalls = new ApiCalls();


        ImageView backButton = findViewById(R.id.backArrow);
        backButton.setVisibility(View.VISIBLE);

        backButton.setOnClickListener(v -> finish());

        LinearLayout normal = (LinearLayout) findViewById(R.id.lyt_normal);

        normal.setOnClickListener(v -> {
            Almosky.getInst().setDeliveryType("1");
            // Intent go = new Intent(OrdertypeActivity.this, PickUpActivity.class);
            Almosky.getInst().setAddressType("1");
            Intent go = new Intent(OrdertypeActivity.this, AddressListActivity.class);
            startActivity(go);
        });

        LinearLayout fast = (LinearLayout) findViewById(R.id.lyt_fast);
        fast.setOnClickListener(v -> {
            Almosky.getInst().setDeliveryType("2");  //fast service
            Almosky.getInst().setAddressType("1");
            // Intent go=new Intent(OrdertypeActivity.this,PickUpActivity.class);
            Intent go=new Intent(OrdertypeActivity.this,AddressListActivity.class);
            startActivity(go);

        });

        if(appPrefes.getBoolData(PrefConstants.isLogin)){



        }else {
            startActivity(new Intent(OrdertypeActivity.this, SignupOrLoginActivity.class));
        }





    }


}

package com.example.s_shop.view.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.s_shop.R;
import com.example.s_shop.adapter.ProductAdapter;
import com.example.s_shop.databinding.ActivityShowAllProductByCategoryBinding;
import com.example.s_shop.model.Product;
import com.example.s_shop.model.ProductByCategory;
import com.example.s_shop.model.response.ProductResponse;
import com.example.s_shop.ultil.ObjectUtil;
import com.example.s_shop.ultil.ProgressLoadingDialog;
import com.example.s_shop.view.product_screen.DetailProduct;

import java.util.ArrayList;
import java.util.List;

public class ShowAllProductByCategoryActivity extends AppCompatActivity implements ObjectUtil {
    ActivityShowAllProductByCategoryBinding binding;
    List<Product> list;
    ProductAdapter adapter;
    private ProgressLoadingDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShowAllProductByCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dialog = new ProgressLoadingDialog(this);
        list = new ArrayList<>();;
        binding.tvNameCategory.setText("Giá : 499k");
        adapter = new ProductAdapter(this, list, this);
        binding.rcvAllProductByCategory.setAdapter(adapter);
        ShowListAllProductByCategory();
        initController();
    }

    private void initController() {
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void ShowListAllProductByCategory() {
        dialog.show();
        Intent intent = getIntent();
        ProductByCategory categoryId = (ProductByCategory) intent.getSerializableExtra("categoryId");
        Log.d("categoryId", "ShowListAllProductByCategory: "+ categoryId);
        binding.tvNameCategory.setText(categoryId.getNameCategory());
        adapter.setProductList(categoryId.getProduct());
        binding.rcvAllProductByCategory.setAdapter(adapter);
        dialog.dismiss();

    }

    private void setdaUi(ProductResponse reponse) {

    }


    @Override
    public void onclickObject(Object object) {
        Product product = (Product) object;
        String id = product.getId();
        Intent intent = new Intent(this, DetailProduct.class);
        intent.putExtra("id_product", id);
        startActivity(intent);
        overridePendingTransition(R.anim.slidle_in_left, R.anim.slidle_out_left);

    }
}
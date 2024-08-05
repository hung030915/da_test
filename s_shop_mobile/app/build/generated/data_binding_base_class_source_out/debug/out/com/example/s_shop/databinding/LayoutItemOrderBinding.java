// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.s_shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutItemOrderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView btnItem;

  @NonNull
  public final RecyclerView rcvOrderDetail;

  @NonNull
  public final TextView tvOrderId;

  @NonNull
  public final TextView tvQuantityTypeProduct;

  @NonNull
  public final TextView tvStatus;

  @NonNull
  public final TextView tvTitleTongTien;

  @NonNull
  public final TextView tvTotalPrice;

  private LayoutItemOrderBinding(@NonNull LinearLayout rootView, @NonNull TextView btnItem,
      @NonNull RecyclerView rcvOrderDetail, @NonNull TextView tvOrderId,
      @NonNull TextView tvQuantityTypeProduct, @NonNull TextView tvStatus,
      @NonNull TextView tvTitleTongTien, @NonNull TextView tvTotalPrice) {
    this.rootView = rootView;
    this.btnItem = btnItem;
    this.rcvOrderDetail = rcvOrderDetail;
    this.tvOrderId = tvOrderId;
    this.tvQuantityTypeProduct = tvQuantityTypeProduct;
    this.tvStatus = tvStatus;
    this.tvTitleTongTien = tvTitleTongTien;
    this.tvTotalPrice = tvTotalPrice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutItemOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutItemOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_item_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutItemOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnItem;
      TextView btnItem = ViewBindings.findChildViewById(rootView, id);
      if (btnItem == null) {
        break missingId;
      }

      id = R.id.rcvOrderDetail;
      RecyclerView rcvOrderDetail = ViewBindings.findChildViewById(rootView, id);
      if (rcvOrderDetail == null) {
        break missingId;
      }

      id = R.id.tvOrderId;
      TextView tvOrderId = ViewBindings.findChildViewById(rootView, id);
      if (tvOrderId == null) {
        break missingId;
      }

      id = R.id.tvQuantityTypeProduct;
      TextView tvQuantityTypeProduct = ViewBindings.findChildViewById(rootView, id);
      if (tvQuantityTypeProduct == null) {
        break missingId;
      }

      id = R.id.tvStatus;
      TextView tvStatus = ViewBindings.findChildViewById(rootView, id);
      if (tvStatus == null) {
        break missingId;
      }

      id = R.id.tv_title_tong_tien;
      TextView tvTitleTongTien = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleTongTien == null) {
        break missingId;
      }

      id = R.id.tvTotalPrice;
      TextView tvTotalPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalPrice == null) {
        break missingId;
      }

      return new LayoutItemOrderBinding((LinearLayout) rootView, btnItem, rcvOrderDetail, tvOrderId,
          tvQuantityTypeProduct, tvStatus, tvTitleTongTien, tvTotalPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
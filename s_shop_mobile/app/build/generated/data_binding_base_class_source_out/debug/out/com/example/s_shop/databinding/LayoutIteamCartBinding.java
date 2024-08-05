// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.s_shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutIteamCartBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView btnMinus;

  @NonNull
  public final TextView btnPlus;

  @NonNull
  public final CheckBox chkPurchase;

  @NonNull
  public final ImageView imgProduct;

  @NonNull
  public final LinearLayout layoutForeground;

  @NonNull
  public final TextView tvColorOption;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvQuantity;

  private LayoutIteamCartBinding(@NonNull FrameLayout rootView, @NonNull TextView btnMinus,
      @NonNull TextView btnPlus, @NonNull CheckBox chkPurchase, @NonNull ImageView imgProduct,
      @NonNull LinearLayout layoutForeground, @NonNull TextView tvColorOption,
      @NonNull TextView tvName, @NonNull TextView tvPrice, @NonNull TextView tvQuantity) {
    this.rootView = rootView;
    this.btnMinus = btnMinus;
    this.btnPlus = btnPlus;
    this.chkPurchase = chkPurchase;
    this.imgProduct = imgProduct;
    this.layoutForeground = layoutForeground;
    this.tvColorOption = tvColorOption;
    this.tvName = tvName;
    this.tvPrice = tvPrice;
    this.tvQuantity = tvQuantity;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutIteamCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutIteamCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_iteam_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutIteamCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnMinus;
      TextView btnMinus = ViewBindings.findChildViewById(rootView, id);
      if (btnMinus == null) {
        break missingId;
      }

      id = R.id.btnPlus;
      TextView btnPlus = ViewBindings.findChildViewById(rootView, id);
      if (btnPlus == null) {
        break missingId;
      }

      id = R.id.chkPurchase;
      CheckBox chkPurchase = ViewBindings.findChildViewById(rootView, id);
      if (chkPurchase == null) {
        break missingId;
      }

      id = R.id.imgProduct;
      ImageView imgProduct = ViewBindings.findChildViewById(rootView, id);
      if (imgProduct == null) {
        break missingId;
      }

      id = R.id.layoutForeground;
      LinearLayout layoutForeground = ViewBindings.findChildViewById(rootView, id);
      if (layoutForeground == null) {
        break missingId;
      }

      id = R.id.tvColorOption;
      TextView tvColorOption = ViewBindings.findChildViewById(rootView, id);
      if (tvColorOption == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tvPrice;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      id = R.id.tvQuantity;
      TextView tvQuantity = ViewBindings.findChildViewById(rootView, id);
      if (tvQuantity == null) {
        break missingId;
      }

      return new LayoutIteamCartBinding((FrameLayout) rootView, btnMinus, btnPlus, chkPurchase,
          imgProduct, layoutForeground, tvColorOption, tvName, tvPrice, tvQuantity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
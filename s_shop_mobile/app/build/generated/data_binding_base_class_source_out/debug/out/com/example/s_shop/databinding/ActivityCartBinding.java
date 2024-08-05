// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.s_shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView btnPurchase;

  @NonNull
  public final FrameLayout frameLayout2;

  @NonNull
  public final Toolbar idToolbar;

  @NonNull
  public final ImageView imageView14;

  @NonNull
  public final ImageView imageView15;

  @NonNull
  public final ImageView imageView16;

  @NonNull
  public final ImageView imageView17;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final RelativeLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout13;

  @NonNull
  public final LinearLayout listVoucher;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rcvCart;

  @NonNull
  public final TextView tvDrum;

  @NonNull
  public final TextView tvTotalPrice;

  private ActivityCartBinding(@NonNull ConstraintLayout rootView, @NonNull TextView btnPurchase,
      @NonNull FrameLayout frameLayout2, @NonNull Toolbar idToolbar, @NonNull ImageView imageView14,
      @NonNull ImageView imageView15, @NonNull ImageView imageView16,
      @NonNull ImageView imageView17, @NonNull ImageView imgBack,
      @NonNull RelativeLayout linearLayout, @NonNull LinearLayout linearLayout13,
      @NonNull LinearLayout listVoucher, @NonNull ProgressBar progressBar,
      @NonNull RecyclerView rcvCart, @NonNull TextView tvDrum, @NonNull TextView tvTotalPrice) {
    this.rootView = rootView;
    this.btnPurchase = btnPurchase;
    this.frameLayout2 = frameLayout2;
    this.idToolbar = idToolbar;
    this.imageView14 = imageView14;
    this.imageView15 = imageView15;
    this.imageView16 = imageView16;
    this.imageView17 = imageView17;
    this.imgBack = imgBack;
    this.linearLayout = linearLayout;
    this.linearLayout13 = linearLayout13;
    this.listVoucher = listVoucher;
    this.progressBar = progressBar;
    this.rcvCart = rcvCart;
    this.tvDrum = tvDrum;
    this.tvTotalPrice = tvTotalPrice;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnPurchase;
      TextView btnPurchase = ViewBindings.findChildViewById(rootView, id);
      if (btnPurchase == null) {
        break missingId;
      }

      id = R.id.frameLayout2;
      FrameLayout frameLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout2 == null) {
        break missingId;
      }

      id = R.id.id_toolbar;
      Toolbar idToolbar = ViewBindings.findChildViewById(rootView, id);
      if (idToolbar == null) {
        break missingId;
      }

      id = R.id.imageView14;
      ImageView imageView14 = ViewBindings.findChildViewById(rootView, id);
      if (imageView14 == null) {
        break missingId;
      }

      id = R.id.imageView15;
      ImageView imageView15 = ViewBindings.findChildViewById(rootView, id);
      if (imageView15 == null) {
        break missingId;
      }

      id = R.id.imageView16;
      ImageView imageView16 = ViewBindings.findChildViewById(rootView, id);
      if (imageView16 == null) {
        break missingId;
      }

      id = R.id.imageView17;
      ImageView imageView17 = ViewBindings.findChildViewById(rootView, id);
      if (imageView17 == null) {
        break missingId;
      }

      id = R.id.imgBack;
      ImageView imgBack = ViewBindings.findChildViewById(rootView, id);
      if (imgBack == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      RelativeLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout13;
      LinearLayout linearLayout13 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout13 == null) {
        break missingId;
      }

      id = R.id.listVoucher;
      LinearLayout listVoucher = ViewBindings.findChildViewById(rootView, id);
      if (listVoucher == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rcvCart;
      RecyclerView rcvCart = ViewBindings.findChildViewById(rootView, id);
      if (rcvCart == null) {
        break missingId;
      }

      id = R.id.tvDrum;
      TextView tvDrum = ViewBindings.findChildViewById(rootView, id);
      if (tvDrum == null) {
        break missingId;
      }

      id = R.id.tvTotalPrice;
      TextView tvTotalPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalPrice == null) {
        break missingId;
      }

      return new ActivityCartBinding((ConstraintLayout) rootView, btnPurchase, frameLayout2,
          idToolbar, imageView14, imageView15, imageView16, imageView17, imgBack, linearLayout,
          linearLayout13, listVoucher, progressBar, rcvCart, tvDrum, tvTotalPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

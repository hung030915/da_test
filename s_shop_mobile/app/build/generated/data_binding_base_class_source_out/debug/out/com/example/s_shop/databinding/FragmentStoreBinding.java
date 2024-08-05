// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.s_shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStoreBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rcvVoucher;

  @NonNull
  public final RecyclerView recyStore;

  private FragmentStoreBinding(@NonNull LinearLayout rootView, @NonNull ProgressBar progressBar,
      @NonNull RecyclerView rcvVoucher, @NonNull RecyclerView recyStore) {
    this.rootView = rootView;
    this.progressBar = progressBar;
    this.rcvVoucher = rcvVoucher;
    this.recyStore = recyStore;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_store, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStoreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rcvVoucher;
      RecyclerView rcvVoucher = ViewBindings.findChildViewById(rootView, id);
      if (rcvVoucher == null) {
        break missingId;
      }

      id = R.id.recyStore;
      RecyclerView recyStore = ViewBindings.findChildViewById(rootView, id);
      if (recyStore == null) {
        break missingId;
      }

      return new FragmentStoreBinding((LinearLayout) rootView, progressBar, rcvVoucher, recyStore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
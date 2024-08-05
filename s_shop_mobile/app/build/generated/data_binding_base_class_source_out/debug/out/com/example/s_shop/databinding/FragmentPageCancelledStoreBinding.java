// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.s_shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPageCancelledStoreBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout layoutDrum;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rcvOrder;

  private FragmentPageCancelledStoreBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout layoutDrum, @NonNull ProgressBar progressBar,
      @NonNull RecyclerView rcvOrder) {
    this.rootView = rootView;
    this.layoutDrum = layoutDrum;
    this.progressBar = progressBar;
    this.rcvOrder = rcvOrder;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPageCancelledStoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPageCancelledStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_page_cancelled_store, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPageCancelledStoreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.layoutDrum;
      ConstraintLayout layoutDrum = ViewBindings.findChildViewById(rootView, id);
      if (layoutDrum == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rcvOrder;
      RecyclerView rcvOrder = ViewBindings.findChildViewById(rootView, id);
      if (rcvOrder == null) {
        break missingId;
      }

      return new FragmentPageCancelledStoreBinding((ConstraintLayout) rootView, layoutDrum,
          progressBar, rcvOrder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

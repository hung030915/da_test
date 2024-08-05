// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
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

public final class FragmentNotificationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imgCart;

  @NonNull
  public final ImageView imgChat;

  @NonNull
  public final LinearLayout layout1;

  @NonNull
  public final LinearLayout layout2;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rcvNofity;

  @NonNull
  public final TextView tvQuantityCart;

  private FragmentNotificationBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imgCart, @NonNull ImageView imgChat, @NonNull LinearLayout layout1,
      @NonNull LinearLayout layout2, @NonNull ProgressBar progressBar,
      @NonNull RecyclerView rcvNofity, @NonNull TextView tvQuantityCart) {
    this.rootView = rootView;
    this.imgCart = imgCart;
    this.imgChat = imgChat;
    this.layout1 = layout1;
    this.layout2 = layout2;
    this.progressBar = progressBar;
    this.rcvNofity = rcvNofity;
    this.tvQuantityCart = tvQuantityCart;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_notification, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNotificationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgCart;
      ImageView imgCart = ViewBindings.findChildViewById(rootView, id);
      if (imgCart == null) {
        break missingId;
      }

      id = R.id.imgChat;
      ImageView imgChat = ViewBindings.findChildViewById(rootView, id);
      if (imgChat == null) {
        break missingId;
      }

      id = R.id.layout1;
      LinearLayout layout1 = ViewBindings.findChildViewById(rootView, id);
      if (layout1 == null) {
        break missingId;
      }

      id = R.id.layout2;
      LinearLayout layout2 = ViewBindings.findChildViewById(rootView, id);
      if (layout2 == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rcvNofity;
      RecyclerView rcvNofity = ViewBindings.findChildViewById(rootView, id);
      if (rcvNofity == null) {
        break missingId;
      }

      id = R.id.tvQuantityCart;
      TextView tvQuantityCart = ViewBindings.findChildViewById(rootView, id);
      if (tvQuantityCart == null) {
        break missingId;
      }

      return new FragmentNotificationBinding((ConstraintLayout) rootView, imgCart, imgChat, layout1,
          layout2, progressBar, rcvNofity, tvQuantityCart);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

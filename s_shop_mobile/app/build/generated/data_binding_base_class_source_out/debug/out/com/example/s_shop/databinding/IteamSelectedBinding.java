// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.s_shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class IteamSelectedBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imgDropDown;

  @NonNull
  public final TextView tvSelected;

  private IteamSelectedBinding(@NonNull RelativeLayout rootView, @NonNull ImageView imgDropDown,
      @NonNull TextView tvSelected) {
    this.rootView = rootView;
    this.imgDropDown = imgDropDown;
    this.tvSelected = tvSelected;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static IteamSelectedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static IteamSelectedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.iteam_selected, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static IteamSelectedBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgDropDown;
      ImageView imgDropDown = ViewBindings.findChildViewById(rootView, id);
      if (imgDropDown == null) {
        break missingId;
      }

      id = R.id.tv_selected;
      TextView tvSelected = ViewBindings.findChildViewById(rootView, id);
      if (tvSelected == null) {
        break missingId;
      }

      return new IteamSelectedBinding((RelativeLayout) rootView, imgDropDown, tvSelected);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class LayoutIteamOptionProductBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnDelete;

  @NonNull
  public final ImageView imgIteamOption;

  @NonNull
  public final TextView tvColorOption;

  private LayoutIteamOptionProductBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView btnDelete, @NonNull ImageView imgIteamOption,
      @NonNull TextView tvColorOption) {
    this.rootView = rootView;
    this.btnDelete = btnDelete;
    this.imgIteamOption = imgIteamOption;
    this.tvColorOption = tvColorOption;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutIteamOptionProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutIteamOptionProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_iteam_option_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutIteamOptionProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDelete;
      ImageView btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.imgIteamOption;
      ImageView imgIteamOption = ViewBindings.findChildViewById(rootView, id);
      if (imgIteamOption == null) {
        break missingId;
      }

      id = R.id.tvColorOption;
      TextView tvColorOption = ViewBindings.findChildViewById(rootView, id);
      if (tvColorOption == null) {
        break missingId;
      }

      return new LayoutIteamOptionProductBinding((LinearLayout) rootView, btnDelete, imgIteamOption,
          tvColorOption);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

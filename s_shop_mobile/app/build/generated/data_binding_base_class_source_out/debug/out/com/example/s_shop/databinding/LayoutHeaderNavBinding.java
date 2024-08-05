// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.s_shop.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutHeaderNavBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircleImageView imgAvartarStore;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvNameStore;

  private LayoutHeaderNavBinding(@NonNull LinearLayout rootView,
      @NonNull CircleImageView imgAvartarStore, @NonNull TextView tvEmail,
      @NonNull TextView tvNameStore) {
    this.rootView = rootView;
    this.imgAvartarStore = imgAvartarStore;
    this.tvEmail = tvEmail;
    this.tvNameStore = tvNameStore;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutHeaderNavBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutHeaderNavBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_header_nav, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutHeaderNavBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgAvartarStore;
      CircleImageView imgAvartarStore = ViewBindings.findChildViewById(rootView, id);
      if (imgAvartarStore == null) {
        break missingId;
      }

      id = R.id.tvEmail;
      TextView tvEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvEmail == null) {
        break missingId;
      }

      id = R.id.tvNameStore;
      TextView tvNameStore = ViewBindings.findChildViewById(rootView, id);
      if (tvNameStore == null) {
        break missingId;
      }

      return new LayoutHeaderNavBinding((LinearLayout) rootView, imgAvartarStore, tvEmail,
          tvNameStore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

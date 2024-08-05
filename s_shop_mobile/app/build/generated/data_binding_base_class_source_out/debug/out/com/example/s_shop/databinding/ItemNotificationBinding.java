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

public final class ItemNotificationBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgAvartar;

  @NonNull
  public final LinearLayout item;

  @NonNull
  public final View line;

  @NonNull
  public final TextView tvContent;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvTitle;

  private ItemNotificationBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgAvartar,
      @NonNull LinearLayout item, @NonNull View line, @NonNull TextView tvContent,
      @NonNull TextView tvDate, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.imgAvartar = imgAvartar;
    this.item = item;
    this.line = line;
    this.tvContent = tvContent;
    this.tvDate = tvDate;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemNotificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemNotificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_notification, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemNotificationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgAvartar;
      ImageView imgAvartar = ViewBindings.findChildViewById(rootView, id);
      if (imgAvartar == null) {
        break missingId;
      }

      id = R.id.item;
      LinearLayout item = ViewBindings.findChildViewById(rootView, id);
      if (item == null) {
        break missingId;
      }

      id = R.id.line;
      View line = ViewBindings.findChildViewById(rootView, id);
      if (line == null) {
        break missingId;
      }

      id = R.id.tvContent;
      TextView tvContent = ViewBindings.findChildViewById(rootView, id);
      if (tvContent == null) {
        break missingId;
      }

      id = R.id.tvDate;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ItemNotificationBinding((LinearLayout) rootView, imgAvartar, item, line, tvContent,
          tvDate, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
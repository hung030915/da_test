// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.s_shop.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutDialogFeedbackBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnPhanHoi;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView phanhoikhieunai;

  @NonNull
  public final TextView phanhoikhieunai2;

  @NonNull
  public final TextView textView13;

  private LayoutDialogFeedbackBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnPhanHoi, @NonNull ImageView imageView2, @NonNull TextView phanhoikhieunai,
      @NonNull TextView phanhoikhieunai2, @NonNull TextView textView13) {
    this.rootView = rootView;
    this.btnPhanHoi = btnPhanHoi;
    this.imageView2 = imageView2;
    this.phanhoikhieunai = phanhoikhieunai;
    this.phanhoikhieunai2 = phanhoikhieunai2;
    this.textView13 = textView13;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutDialogFeedbackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutDialogFeedbackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_dialog_feedback, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutDialogFeedbackBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnPhanHoi;
      Button btnPhanHoi = ViewBindings.findChildViewById(rootView, id);
      if (btnPhanHoi == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.phanhoikhieunai;
      TextView phanhoikhieunai = ViewBindings.findChildViewById(rootView, id);
      if (phanhoikhieunai == null) {
        break missingId;
      }

      id = R.id.phanhoikhieunai2;
      TextView phanhoikhieunai2 = ViewBindings.findChildViewById(rootView, id);
      if (phanhoikhieunai2 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      return new LayoutDialogFeedbackBinding((ConstraintLayout) rootView, btnPhanHoi, imageView2,
          phanhoikhieunai, phanhoikhieunai2, textView13);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

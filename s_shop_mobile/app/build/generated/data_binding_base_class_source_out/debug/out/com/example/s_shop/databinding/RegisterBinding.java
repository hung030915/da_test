// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.s_shop.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RegisterBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView backRegi;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final TextInputEditText edtEmail;

  @NonNull
  public final TextInputEditText edtPass;

  @NonNull
  public final TextInputEditText edtRepass;

  @NonNull
  public final View lineEmail;

  @NonNull
  public final View linePass;

  @NonNull
  public final TextView tvErrorEmail;

  @NonNull
  public final TextView tvErrorPass;

  private RegisterBinding(@NonNull LinearLayout rootView, @NonNull ImageView backRegi,
      @NonNull Button btnRegister, @NonNull TextInputEditText edtEmail,
      @NonNull TextInputEditText edtPass, @NonNull TextInputEditText edtRepass,
      @NonNull View lineEmail, @NonNull View linePass, @NonNull TextView tvErrorEmail,
      @NonNull TextView tvErrorPass) {
    this.rootView = rootView;
    this.backRegi = backRegi;
    this.btnRegister = btnRegister;
    this.edtEmail = edtEmail;
    this.edtPass = edtPass;
    this.edtRepass = edtRepass;
    this.lineEmail = lineEmail;
    this.linePass = linePass;
    this.tvErrorEmail = tvErrorEmail;
    this.tvErrorPass = tvErrorPass;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backRegi;
      ImageView backRegi = ViewBindings.findChildViewById(rootView, id);
      if (backRegi == null) {
        break missingId;
      }

      id = R.id.btnRegister;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.edtEmail;
      TextInputEditText edtEmail = ViewBindings.findChildViewById(rootView, id);
      if (edtEmail == null) {
        break missingId;
      }

      id = R.id.edtPass;
      TextInputEditText edtPass = ViewBindings.findChildViewById(rootView, id);
      if (edtPass == null) {
        break missingId;
      }

      id = R.id.edtRepass;
      TextInputEditText edtRepass = ViewBindings.findChildViewById(rootView, id);
      if (edtRepass == null) {
        break missingId;
      }

      id = R.id.lineEmail;
      View lineEmail = ViewBindings.findChildViewById(rootView, id);
      if (lineEmail == null) {
        break missingId;
      }

      id = R.id.linePass;
      View linePass = ViewBindings.findChildViewById(rootView, id);
      if (linePass == null) {
        break missingId;
      }

      id = R.id.tvErrorEmail;
      TextView tvErrorEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvErrorEmail == null) {
        break missingId;
      }

      id = R.id.tvErrorPass;
      TextView tvErrorPass = ViewBindings.findChildViewById(rootView, id);
      if (tvErrorPass == null) {
        break missingId;
      }

      return new RegisterBinding((LinearLayout) rootView, backRegi, btnRegister, edtEmail, edtPass,
          edtRepass, lineEmail, linePass, tvErrorEmail, tvErrorPass);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

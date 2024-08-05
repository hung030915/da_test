// Generated by view binder compiler. Do not edit!
package com.example.s_shop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class LayoutDialogDetailProductBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView battery;

  @NonNull
  public final TextView camera;

  @NonNull
  public final TextView chipset;

  @NonNull
  public final TextView connection;

  @NonNull
  public final TextView cpu;

  @NonNull
  public final TextView description;

  @NonNull
  public final TextView gpu;

  @NonNull
  public final TextView manufacturer;

  @NonNull
  public final TextView operatingSystem;

  @NonNull
  public final TextView other;

  @NonNull
  public final TextView ram;

  @NonNull
  public final TextView rom;

  @NonNull
  public final TextView screen;

  @NonNull
  public final TextView specialFeature;

  @NonNull
  public final TextView weight;

  private LayoutDialogDetailProductBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView battery, @NonNull TextView camera, @NonNull TextView chipset,
      @NonNull TextView connection, @NonNull TextView cpu, @NonNull TextView description,
      @NonNull TextView gpu, @NonNull TextView manufacturer, @NonNull TextView operatingSystem,
      @NonNull TextView other, @NonNull TextView ram, @NonNull TextView rom,
      @NonNull TextView screen, @NonNull TextView specialFeature, @NonNull TextView weight) {
    this.rootView = rootView;
    this.battery = battery;
    this.camera = camera;
    this.chipset = chipset;
    this.connection = connection;
    this.cpu = cpu;
    this.description = description;
    this.gpu = gpu;
    this.manufacturer = manufacturer;
    this.operatingSystem = operatingSystem;
    this.other = other;
    this.ram = ram;
    this.rom = rom;
    this.screen = screen;
    this.specialFeature = specialFeature;
    this.weight = weight;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutDialogDetailProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutDialogDetailProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_dialog_detail_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutDialogDetailProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.battery;
      TextView battery = ViewBindings.findChildViewById(rootView, id);
      if (battery == null) {
        break missingId;
      }

      id = R.id.camera;
      TextView camera = ViewBindings.findChildViewById(rootView, id);
      if (camera == null) {
        break missingId;
      }

      id = R.id.chipset;
      TextView chipset = ViewBindings.findChildViewById(rootView, id);
      if (chipset == null) {
        break missingId;
      }

      id = R.id.connection;
      TextView connection = ViewBindings.findChildViewById(rootView, id);
      if (connection == null) {
        break missingId;
      }

      id = R.id.cpu;
      TextView cpu = ViewBindings.findChildViewById(rootView, id);
      if (cpu == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.gpu;
      TextView gpu = ViewBindings.findChildViewById(rootView, id);
      if (gpu == null) {
        break missingId;
      }

      id = R.id.manufacturer;
      TextView manufacturer = ViewBindings.findChildViewById(rootView, id);
      if (manufacturer == null) {
        break missingId;
      }

      id = R.id.operatingSystem;
      TextView operatingSystem = ViewBindings.findChildViewById(rootView, id);
      if (operatingSystem == null) {
        break missingId;
      }

      id = R.id.other;
      TextView other = ViewBindings.findChildViewById(rootView, id);
      if (other == null) {
        break missingId;
      }

      id = R.id.ram;
      TextView ram = ViewBindings.findChildViewById(rootView, id);
      if (ram == null) {
        break missingId;
      }

      id = R.id.rom;
      TextView rom = ViewBindings.findChildViewById(rootView, id);
      if (rom == null) {
        break missingId;
      }

      id = R.id.screen;
      TextView screen = ViewBindings.findChildViewById(rootView, id);
      if (screen == null) {
        break missingId;
      }

      id = R.id.specialFeature;
      TextView specialFeature = ViewBindings.findChildViewById(rootView, id);
      if (specialFeature == null) {
        break missingId;
      }

      id = R.id.weight;
      TextView weight = ViewBindings.findChildViewById(rootView, id);
      if (weight == null) {
        break missingId;
      }

      return new LayoutDialogDetailProductBinding((ConstraintLayout) rootView, battery, camera,
          chipset, connection, cpu, description, gpu, manufacturer, operatingSystem, other, ram,
          rom, screen, specialFeature, weight);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

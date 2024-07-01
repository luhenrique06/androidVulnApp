// Generated by data binding compiler. Do not edit!
package com.insecureshop.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.insecureshop.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPrivateBinding extends ViewDataBinding {
  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final WebView webview;

  protected ActivityPrivateBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Toolbar toolbar, WebView webview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.toolbar = toolbar;
    this.webview = webview;
  }

  @NonNull
  public static ActivityPrivateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_private, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPrivateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPrivateBinding>inflateInternal(inflater, R.layout.activity_private, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPrivateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_private, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPrivateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPrivateBinding>inflateInternal(inflater, R.layout.activity_private, null, false, component);
  }

  public static ActivityPrivateBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityPrivateBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityPrivateBinding)bind(component, view, R.layout.activity_private);
  }
}
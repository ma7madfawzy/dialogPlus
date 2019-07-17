package com.dialog.plus.ui;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.dialog.plus.BR;

/**
 * Created by Muhammad Noamany
 * muhammadnoamany@gmail.com
 */
public class DialogUiModel extends BaseObservable {
    private boolean code_dialog, success_dialog, error_dialog, confirmation_dialog, validation_dialog, withResend;
    private String title, content, confirm_code_text, typed_code, resend_code_text;
    private int timeLeft;
    private Integer positiveColorRes, negativeColorRes, headerColorRes;

    public DialogUiModel() {
    }

    @Bindable
    public boolean isWithResend() {
        return withResend;
    }

    public void setWithResend(boolean withResend) {
        this.withResend = withResend;
    }

    @Bindable
    public Integer getHeaderColorRes() {
        return headerColorRes;
    }

    public void setHeaderColorRes(Integer headerColorRes) {
        this.headerColorRes = headerColorRes;
    }

    @Bindable
    public Integer getNegativeColorRes() {
        return negativeColorRes;
    }

    public void setNegativeColorRes(Integer negativeColorRes) {
        this.negativeColorRes = negativeColorRes;
    }

    @Bindable
    public Integer getPositiveColorRes() {
        return positiveColorRes;
    }

    public void setPositiveColorRes(Integer positiveColorRes) {
        this.positiveColorRes = positiveColorRes;
    }

    @Bindable
    public boolean isValidation_dialog() {
        return validation_dialog;
    }

    public void setValidation_dialog(boolean validation_dialog) {
        this.validation_dialog = validation_dialog;
    }

    @Bindable
    public int getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
        notifyPropertyChanged(BR.timeLeft);
    }

    @Bindable
    public String getResend_code_text() {
        return resend_code_text != null ? resend_code_text : "Resend";
    }

    public void setResend_code_text(String resend_code_text) {
        this.resend_code_text = resend_code_text;
    }

    @Bindable
    public String getTyped_code() {
        return typed_code;
    }

    public void setTyped_code(String typed_code) {
        this.typed_code = typed_code;
    }

    @Bindable
    public String getConfirm_code_text() {
        return confirm_code_text != null ? confirm_code_text : "Send";
    }

    public void setConfirm_code_text(String confirm_code_text) {
        this.confirm_code_text = confirm_code_text;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Bindable
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Bindable
    public boolean isCode_dialog() {
        return code_dialog;
    }

    public void setCode_dialog(boolean code_dialog) {
        this.code_dialog = code_dialog;
    }

    @Bindable
    public boolean isSuccess_dialog() {
        return success_dialog;
    }

    public void setSuccess_dialog(boolean success_dialog) {
        this.success_dialog = success_dialog;
    }

    @Bindable
    public boolean isError_dialog() {
        return error_dialog;
    }

    public void setError_dialog(boolean error_dialog) {
        this.error_dialog = error_dialog;
    }

    @Bindable
    public boolean isConfirmation_dialog() {
        return confirmation_dialog;
    }

    public void setConfirmation_dialog(boolean confirmation_dialog) {
        this.confirmation_dialog = confirmation_dialog;
    }
}
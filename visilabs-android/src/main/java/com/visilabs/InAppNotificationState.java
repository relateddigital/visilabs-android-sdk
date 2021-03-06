package com.visilabs;

import android.os.Bundle;
import android.os.Parcel;

import com.visilabs.inApp.InAppMessage;
import com.visilabs.mailSub.MailSubscriptionForm;

public class InAppNotificationState extends DisplayState {

    public static final String TYPE = "InAppNotificationState";

    private static final String INAPP_KEY = "INAPP_KEY";
    private static final String HIGHLIGHT_KEY = "HIGHLIGHT_KEY";

    private InAppMessage mInAppNotification;
    private MailSubscriptionForm mMailSubscriptionForm;
    private final int mHighlightColor;

    public InAppNotificationState(Bundle in) {
        mInAppNotification = in.getParcelable(INAPP_KEY);
        mHighlightColor = in.getInt(HIGHLIGHT_KEY);
    }
    public InAppNotificationState(InAppMessage inAppMessage, int highlightColor) {
        mInAppNotification = inAppMessage;
        mHighlightColor = highlightColor;
    }
    public InAppNotificationState(MailSubscriptionForm mailSubscriptionForm, int highlightColor) {
        mMailSubscriptionForm = mailSubscriptionForm;
        mHighlightColor = highlightColor;
    }

    public int getHighlightColor() {
        return mHighlightColor;
    }

    public InAppMessage getInAppMessage() {
        return mInAppNotification;
    }

    public MailSubscriptionForm getMailSubscriptionForm() {
        return mMailSubscriptionForm;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, final int flags) {
        Bundle write = new Bundle();
        if(mMailSubscriptionForm != null) {
            write.putParcelable(INAPP_KEY, mMailSubscriptionForm);
        } else {
            write.putParcelable(INAPP_KEY, mInAppNotification);
        }
        write.putInt(HIGHLIGHT_KEY, mHighlightColor);
        dest.writeBundle(write);
    }

    public static Creator<InAppNotificationState> CREATOR =
            new Creator<InAppNotificationState>() {

                @Override
                public InAppNotificationState createFromParcel(Parcel source) {
                    Bundle read = new Bundle(InAppNotificationState.class.getClassLoader());
                    read.readFromParcel(source);
                    return new InAppNotificationState(read);
                }

                @Override
                public InAppNotificationState[] newArray(int size) {
                    return new InAppNotificationState[size];
                }
            };
}

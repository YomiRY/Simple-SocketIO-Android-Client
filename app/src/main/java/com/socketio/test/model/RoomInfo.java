package com.socketio.test.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RoomInfo {

    @SerializedName("room_id")
    private String mRoomId;
    @SerializedName("room_type")
    private int mRoomType;
    @SerializedName("unread_count")
    private int mUnReadCount;
    @SerializedName("user_info_list")
    private ArrayList<UserInfo> mUserInfoList;
    @SerializedName("message_info_list")
    private ArrayList<MessageInfo> mMessageInfoList;

    public String getRoomId() {
        return mRoomId;
    }

    public void setRoomId(String mRoomId) {
        this.mRoomId = mRoomId;
    }

    public ArrayList<UserInfo> getUserInfoList() {
        return mUserInfoList;
    }

    public void setUserInfoList(ArrayList<UserInfo> mUserInfo) {
        this.mUserInfoList = mUserInfo;
    }

    public ArrayList<MessageInfo> getMessageInfoList() {
        return mMessageInfoList;
    }

    public void setMessageInfoList(ArrayList<MessageInfo> mMessageInfo) {
        this.mMessageInfoList = mMessageInfo;
    }

    public int getRoomType() {
        return mRoomType;
    }

    public void setRoomType(int mRoomType) {
        this.mRoomType = mRoomType;
    }
}

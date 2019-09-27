package com.cpgs.ouat.design;

public class UserModel {
    private int userImage;
    private String userName;
    private String userRollNo;
    private String userMobileNo;

    public UserModel() {
    }

    public UserModel(int userImage, String userName, String userRollNo, String userMobileNo) {
        this.userImage = userImage;
        this.userName = userName;
        this.userRollNo = userRollNo;
        this.userMobileNo = userMobileNo;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRollNo() {
        return userRollNo;
    }

    public void setUserRollNo(String userRollNo) {
        this.userRollNo = userRollNo;
    }

    public String getUserMobileNo() {
        return userMobileNo;
    }

    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }
}

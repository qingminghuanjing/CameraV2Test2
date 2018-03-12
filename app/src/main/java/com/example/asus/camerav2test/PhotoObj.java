package com.example.asus.camerav2test;

import java.io.Serializable;

/**
 * Created by 朱凤杰 on 2018/3/9.
 */

public class PhotoObj implements Serializable {//实现序列化，用于两个activity之间进行传递
    private static final long serialVersionUID = 9060527069391618394L;
    private boolean cancelable;
    private int heightPx;
    private int widthPx;
    private int quality;
    private boolean openFaceDetection;
    private boolean forceRejectWhenNoFaces;
    private String rejectMsg;
    private boolean useFrontCam;
    private boolean monoPic;
    private TipsConfig tipsConfig;
    private String mCameraId;

    public PhotoObj(boolean cancelable, int heightPx, int widthPx, int quality,
                        boolean openFaceDetection, boolean forceRejectWhenNoFaces, String rejectMsg,
                                boolean useFrontCam, boolean monoPic, TipsConfig tipsConfig, String mCameraId) {
        this.cancelable = cancelable;
        this.heightPx = heightPx;
        this.widthPx = widthPx;
        this.quality = quality;
        this.openFaceDetection = openFaceDetection;
        this.forceRejectWhenNoFaces = forceRejectWhenNoFaces;
        this.rejectMsg = rejectMsg;
        this.useFrontCam = useFrontCam;
        this.monoPic = monoPic;
        this.tipsConfig = tipsConfig;
        this.mCameraId = mCameraId;
    }

    public boolean isCancelable() {
        return cancelable;
    }

    public void setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
    }

    public int getHeightPx() {
        return heightPx;
    }

    public void setHeightPx(int heightPx) {
        this.heightPx = heightPx;
    }

    public int getWidthPx() {
        return widthPx;
    }

    public void setWidthPx(int widthPx) {
        this.widthPx = widthPx;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public boolean isOpenFaceDetection() {
        return openFaceDetection;
    }

    public void setOpenFaceDetection(boolean openFaceDetection) {
        this.openFaceDetection = openFaceDetection;
    }

    public boolean isForceRejectWhenNoFaces() {
        return forceRejectWhenNoFaces;
    }

    public void setForceRejectWhenNoFaces(boolean forceRejectWhenNoFaces) {
        this.forceRejectWhenNoFaces = forceRejectWhenNoFaces;
    }

    public String getRejectMsg() {
        return rejectMsg;
    }

    public void setRejectMsg(String rejectMsg) {
        this.rejectMsg = rejectMsg;
    }

    public boolean isUseFrontCam() {
        return useFrontCam;
    }

    public void setUseFrontCam(boolean useFrontCam) {
        this.useFrontCam = useFrontCam;
    }

    public boolean isMonoPic() {
        return monoPic;
    }

    public void setMonoPic(boolean monoPic) {
        this.monoPic = monoPic;
    }

    public TipsConfig getTipsConfig() {
        return tipsConfig;
    }

    public void setTipsConfig(TipsConfig tipsConfig) {
        this.tipsConfig = tipsConfig;
    }

    public String getmCameraId() {
        return mCameraId;
    }

    public void setmCameraId(String mCameraId) {
        this.mCameraId = mCameraId;
    }
}

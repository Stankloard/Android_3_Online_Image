package com.stankloardindustries.onlineimage;

import com.squareup.picasso.RequestCreator;

public class ImageModel {
    int image;

    public ImageModel(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

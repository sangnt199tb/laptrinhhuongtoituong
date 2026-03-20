package com.company;

public class Vector3D {
    private double x, y, z;
    public Vector3D() {}

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector3D cong(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public Vector3D tru(Vector3D v) {
        return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    public Vector3D nhan(double k) {
        return new Vector3D(this.x * k, this.y * k, this.z * k);
    }

    public double nhanVoHuong(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
}

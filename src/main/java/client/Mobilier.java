package client;

public class Mobilier {
    String _id;
    String name;
    String imgUrl;
    double weight;

    public Mobilier(String _id, String name, String imgUrl, double weight) {
        this._id = _id;
        this.name = name;
        this.imgUrl = imgUrl;
        this.weight = weight;
    }

    public Mobilier() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

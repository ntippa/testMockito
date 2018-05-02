package test.ntippa.testpowermockito.dto;

/**
 * Created by nalin on 4/25/2018.
 */

public class PlantDTO {
    private int guid;
    private String genus;
    private String cultivar;
    private String common;
    private String type;

    public int getGuid() {
        return guid;
    }

    public void setGuid(int guid) {
        this.guid = guid;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getCultivar() {
        return cultivar;
    }

    public void setCultivar(String cultivar) {
        this.cultivar = cultivar;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFallColor() {
        return fallColor;
    }

    public void setFallColor(String fallColor) {
        this.fallColor = fallColor;
    }

    private int size;
    private String fallColor;

}

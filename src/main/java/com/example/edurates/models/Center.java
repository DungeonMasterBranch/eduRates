package com.example.edurates.models;

import javax.persistence.*;

@Table(name = "center")
@Entity
public class Center {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String description;
    private String image;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type typeId;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region regionId;
    @ManyToOne
    @JoinColumn(name = "language_id")
    private Region languageId;
    @ManyToOne
    @JoinColumn(name = "rating_id")
    private Region ratingId;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private Region districtId;
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Region staffId;

    public Center() {
    }

    public Center(Long id, String name, String address, String description, String image, Type typeId, Region regionId, Region languageId, Region ratingId, Region districtId, Region staffId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.description = description;
        this.image = image;
        this.typeId = typeId;
        this.regionId = regionId;
        this.languageId = languageId;
        this.ratingId = ratingId;
        this.districtId = districtId;
        this.staffId = staffId;
    }

    public Center(String name, String address, String description, String image, Type typeId, Region regionId, Region languageId, Region ratingId, Region districtId, Region staffId) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.image = image;
        this.typeId = typeId;
        this.regionId = regionId;
        this.languageId = languageId;
        this.ratingId = ratingId;
        this.districtId = districtId;
        this.staffId = staffId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Type getTypeId() {
        return typeId;
    }

    public void setTypeId(Type typeId) {
        this.typeId = typeId;
    }

    public Region getRegionId() {
        return regionId;
    }

    public void setRegionId(Region regionId) {
        this.regionId = regionId;
    }

    public Region getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Region languageId) {
        this.languageId = languageId;
    }

    public Region getRatingId() {
        return ratingId;
    }

    public void setRatingId(Region ratingId) {
        this.ratingId = ratingId;
    }

    public Region getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Region districtId) {
        this.districtId = districtId;
    }

    public Region getStaffId() {
        return staffId;
    }

    public void setStaffId(Region staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "Center{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", typeId=" + typeId +
                ", regionId=" + regionId +
                ", languageId=" + languageId +
                ", ratingId=" + ratingId +
                ", districtId=" + districtId +
                ", staffId=" + staffId +
                '}';
    }
}

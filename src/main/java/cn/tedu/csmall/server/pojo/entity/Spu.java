package cn.tedu.csmall.server.pojo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Spu implements Serializable {
    private Long id;
    private String name;
    private String type_number;
    private String title;
    private String description;
    private BigDecimal list_price;
    private Integer stock;
    private Integer stock_threshold;
    private String unit;
    private Long brand_id;
    private String brand_name;
    private Long category_id;
    private String category_name;
    private Long attribute_template_id;
    private Long album_id;
    private String pictures;
    private String keywords;
    private String tags;
    private Integer sales;
    private Integer comment_count;
    private Integer positive_comment_count;
    private Integer sort;
    private Integer is_deleted;
    private Integer is_published;
    private Integer is_new_arrival;
    private Integer is_recommend;
    private Integer is_checked;
    private String check_user;
    private LocalDateTime gmt_check;
    private LocalDateTime gmt_create;
    private LocalDateTime gmt_modified;

    @Override
    public String toString() {
        return "Spu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type_number='" + type_number + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", list_price=" + list_price +
                ", stock=" + stock +
                ", stock_threshold=" + stock_threshold +
                ", unit='" + unit + '\'' +
                ", brand_id=" + brand_id +
                ", brand_name='" + brand_name + '\'' +
                ", category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                ", attribute_template_id=" + attribute_template_id +
                ", album_id=" + album_id +
                ", pictures='" + pictures + '\'' +
                ", keywords='" + keywords + '\'' +
                ", tags='" + tags + '\'' +
                ", sales=" + sales +
                ", comment_count=" + comment_count +
                ", positive_comment_count=" + positive_comment_count +
                ", sort=" + sort +
                ", is_deleted=" + is_deleted +
                ", is_published=" + is_published +
                ", is_new_arrival=" + is_new_arrival +
                ", is_recommend=" + is_recommend +
                ", is_checked=" + is_checked +
                ", check_user='" + check_user + '\'' +
                ", gmt_check=" + gmt_check +
                ", gmt_create=" + gmt_create +
                ", gmt_modified=" + gmt_modified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spu spu = (Spu) o;
        return Objects.equals(id, spu.id) && Objects.equals(name, spu.name) && Objects.equals(type_number, spu.type_number) && Objects.equals(title, spu.title) && Objects.equals(description, spu.description) && Objects.equals(list_price, spu.list_price) && Objects.equals(stock, spu.stock) && Objects.equals(stock_threshold, spu.stock_threshold) && Objects.equals(unit, spu.unit) && Objects.equals(brand_id, spu.brand_id) && Objects.equals(brand_name, spu.brand_name) && Objects.equals(category_id, spu.category_id) && Objects.equals(category_name, spu.category_name) && Objects.equals(attribute_template_id, spu.attribute_template_id) && Objects.equals(album_id, spu.album_id) && Objects.equals(pictures, spu.pictures) && Objects.equals(keywords, spu.keywords) && Objects.equals(tags, spu.tags) && Objects.equals(sales, spu.sales) && Objects.equals(comment_count, spu.comment_count) && Objects.equals(positive_comment_count, spu.positive_comment_count) && Objects.equals(sort, spu.sort) && Objects.equals(is_deleted, spu.is_deleted) && Objects.equals(is_published, spu.is_published) && Objects.equals(is_new_arrival, spu.is_new_arrival) && Objects.equals(is_recommend, spu.is_recommend) && Objects.equals(is_checked, spu.is_checked) && Objects.equals(check_user, spu.check_user) && Objects.equals(gmt_check, spu.gmt_check) && Objects.equals(gmt_create, spu.gmt_create) && Objects.equals(gmt_modified, spu.gmt_modified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type_number, title, description, list_price, stock, stock_threshold, unit, brand_id, brand_name, category_id, category_name, attribute_template_id, album_id, pictures, keywords, tags, sales, comment_count, positive_comment_count, sort, is_deleted, is_published, is_new_arrival, is_recommend, is_checked, check_user, gmt_check, gmt_create, gmt_modified);
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

    public String getType_number() {
        return type_number;
    }

    public void setType_number(String type_number) {
        this.type_number = type_number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getList_price() {
        return list_price;
    }

    public void setList_price(BigDecimal list_price) {
        this.list_price = list_price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getStock_threshold() {
        return stock_threshold;
    }

    public void setStock_threshold(Integer stock_threshold) {
        this.stock_threshold = stock_threshold;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Long getAttribute_template_id() {
        return attribute_template_id;
    }

    public void setAttribute_template_id(Long attribute_template_id) {
        this.attribute_template_id = attribute_template_id;
    }

    public Long getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(Long album_id) {
        this.album_id = album_id;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Integer getPositive_comment_count() {
        return positive_comment_count;
    }

    public void setPositive_comment_count(Integer positive_comment_count) {
        this.positive_comment_count = positive_comment_count;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Integer getIs_published() {
        return is_published;
    }

    public void setIs_published(Integer is_published) {
        this.is_published = is_published;
    }

    public Integer getIs_new_arrival() {
        return is_new_arrival;
    }

    public void setIs_new_arrival(Integer is_new_arrival) {
        this.is_new_arrival = is_new_arrival;
    }

    public Integer getIs_recommend() {
        return is_recommend;
    }

    public void setIs_recommend(Integer is_recommend) {
        this.is_recommend = is_recommend;
    }

    public Integer getIs_checked() {
        return is_checked;
    }

    public void setIs_checked(Integer is_checked) {
        this.is_checked = is_checked;
    }

    public String getCheck_user() {
        return check_user;
    }

    public void setCheck_user(String check_user) {
        this.check_user = check_user;
    }

    public LocalDateTime getGmt_check() {
        return gmt_check;
    }

    public void setGmt_check(LocalDateTime gmt_check) {
        this.gmt_check = gmt_check;
    }

    public LocalDateTime getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(LocalDateTime gmt_create) {
        this.gmt_create = gmt_create;
    }

    public LocalDateTime getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(LocalDateTime gmt_modified) {
        this.gmt_modified = gmt_modified;
    }
}
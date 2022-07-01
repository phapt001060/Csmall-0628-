package cn.tedu.csmall.server.pojo.dto;

import org.springframework.web.bind.annotation.PathVariable;

import java.io.Serializable;
import java.util.Objects;

public class BrandEditDTO implements Serializable {

    private String name;
    private String pinyin;
    private String logo;
    private Long categoryId;
    private String description;
    private String keywords;
    private Integer sort;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrandEditDTO that = (BrandEditDTO) o;
        return Objects.equals(name, that.name) && Objects.equals(pinyin, that.pinyin) && Objects.equals(logo, that.logo) && Objects.equals(categoryId, that.categoryId) && Objects.equals(description, that.description) && Objects.equals(keywords, that.keywords) && Objects.equals(sort, that.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pinyin, logo, categoryId, description, keywords, sort);
    }

    @Override
    public String toString() {
        return "BrandEditDTO{" +
                "name='" + name + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", logo='" + logo + '\'' +
                ", categoryId=" + categoryId +
                ", description='" + description + '\'' +
                ", keywords='" + keywords + '\'' +
                ", sort=" + sort +
                '}';
    }

}
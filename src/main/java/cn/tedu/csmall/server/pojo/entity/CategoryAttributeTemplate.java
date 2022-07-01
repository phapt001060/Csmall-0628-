package cn.tedu.csmall.server.pojo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class CategoryAttributeTemplate implements Serializable {
    private Long id;
    private Long category_id;
    private Long attribute_template_id;
    private LocalDateTime gmt_create;
    private LocalDateTime gmt_modified;

    @Override
    public String toString() {
        return "CategoryAttributeTemplate{" +
                "id=" + id +
                ", category_id=" + category_id +
                ", attribute_template_id=" + attribute_template_id +
                ", gmt_create=" + gmt_create +
                ", gmt_modified=" + gmt_modified +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryAttributeTemplate that = (CategoryAttributeTemplate) o;
        return Objects.equals(id, that.id) && Objects.equals(category_id, that.category_id) && Objects.equals(attribute_template_id, that.attribute_template_id) && Objects.equals(gmt_create, that.gmt_create) && Objects.equals(gmt_modified, that.gmt_modified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category_id, attribute_template_id, gmt_create, gmt_modified);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public Long getAttribute_template_id() {
        return attribute_template_id;
    }

    public void setAttribute_template_id(Long attribute_template_id) {
        this.attribute_template_id = attribute_template_id;
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

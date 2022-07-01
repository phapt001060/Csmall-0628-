package cn.tedu.csmall.server.pojo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Picture implements Serializable {
    private Long id;
    private String albumId;
    private Long url;
    private String description;
    private String width;
    private Integer height;
    private Integer isCover;
    private Integer sort;
    private LocalDateTime gmtCreate;
    private LocalDateTime gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public Long getUrl() {
        return url;
    }

    public void setUrl(Long url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getIsCover() {
        return isCover;
    }

    public void setIsCover(Integer isCover) {
        this.isCover = isCover;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return Objects.equals(id, picture.id) && Objects.equals(albumId, picture.albumId) && Objects.equals(url, picture.url) && Objects.equals(description, picture.description) && Objects.equals(width, picture.width) && Objects.equals(height, picture.height) && Objects.equals(isCover, picture.isCover) && Objects.equals(sort, picture.sort) && Objects.equals(gmtCreate, picture.gmtCreate) && Objects.equals(gmtModified, picture.gmtModified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, albumId, url, description, width, height, isCover, sort, gmtCreate, gmtModified);
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", albumId='" + albumId + '\'' +
                ", url=" + url +
                ", description='" + description + '\'' +
                ", width='" + width + '\'' +
                ", height=" + height +
                ", isCover=" + isCover +
                ", sort=" + sort +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}

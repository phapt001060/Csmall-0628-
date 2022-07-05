package cn.tedu.csmall.server.pojo.dto;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AlbumAddNewDTO {
  @ApiModelProperty(value = "相册名称",required = true)
  private   String name;
  @ApiModelProperty(value = "相册描述",required = true)
  private   String description;
  @ApiModelProperty(value = "相册分类",required = true)
  private   Integer sort;

}

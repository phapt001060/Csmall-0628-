package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.SkuSpecification;
import org.springframework.stereotype.Repository;

/**
 * SKU属性数据Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface SkuSpecificationMapper {

    /**
     * 新增SKU属性
     *
     * @param skuSpecification 新增的SKU属性对象
     * @return 受影响的行数
     */
    int insert(SkuSpecification skuSpecification);

    /**
     * 根据id删除SKU属性
     *
     * @param id 被删除的SKU属性的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个SKU属性id，批量删除SKU属性数据
     *
     * @param ids 期望删除的若干个SKU属性数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

}

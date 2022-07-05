package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Sku;
import org.springframework.stereotype.Repository;

/**
 * SKU（Stock Keeping Unit）Mapper接口
 *
 * @author java@tedu.cn
 * @version 0.0.1
 */
@Repository
public interface SkuMapper {

    /**
     * 新增SKU
     *
     * @param album 新增的SKU对象
     * @return 受影响的行数
     */
    int insert(Sku sku);

    /**
     * 根据id删除SKU
     *
     * @param id 被删除的SKU的id
     * @return 受影响的行数
     */
    int deleteById(Long id);

    /**
     * 根据若干个SKU id，批量删除SKU数据
     *
     * @param ids 期望删除的若干个SKU数据的id
     * @return 受影响的行数，将返回成功删除的数据量
     */
    int deleteByIds(Long... ids);

}

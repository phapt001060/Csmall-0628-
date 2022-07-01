package cn.tedu.csmall.server.mapper;

import cn.tedu.csmall.server.pojo.entity.Sku;
import cn.tedu.csmall.server.pojo.entity.Spu;

public interface SkuMapper {
    /**
     *
     * @param
     * @return
     */
    int insert(Sku sku);

    /**
     *
     * @param id
     * @return
     */
    int deleteById(Long id);

    /**
     *
     * @param id
     * @return
     */
    int updateNameById(Long id);

    /**
     *
     * @param ids
     * @return
     */
    int deleteByIds(Long... ids);
}
